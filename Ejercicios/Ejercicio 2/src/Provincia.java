package model;

import java.util.*;

public class Provincia {
    private final String nombre;
    private final Pais pais;
    private final List<Ciudad> ciudades = new ArrayList<>();
    private Ciudad capitalProvincial;

    Provincia(String nombre, Pais pais) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre de provincia vacío");
        }
        this.nombre = nombre.trim();
        this.pais = Objects.requireNonNull(pais, "País requerido");
    }

    public String getNombre() { return nombre; }
    public Pais getPais() { return pais; }
    public List<Ciudad> getCiudades() { return Collections.unmodifiableList(ciudades); }
    public Optional<Ciudad> getCapitalProvincial() { return Optional.ofNullable(capitalProvincial); }

    public Ciudad crearCiudad(String nombreCiudad, boolean esCapitalDeProvincia) {
        Ciudad c = new Ciudad(nombreCiudad, this);
        ciudades.add(c);
        if (esCapitalDeProvincia) {
            definirCapitalProvincial(c);
        }
        return c;
    }

    public void definirCapitalProvincial(Ciudad ciudad) {
        if (!ciudades.contains(ciudad)) {
            throw new IllegalArgumentException("La ciudad no pertenece a esta provincia");
        }
        if (capitalProvincial != null) capitalProvincial.marcarComoCapitalDeProvincia(false);
        capitalProvincial = ciudad;
        capitalProvincial.marcarComoCapitalDeProvincia(true);
    }

    @Override
    public String toString() { return nombre; }
}
