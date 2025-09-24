package ar.uda.geo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Provincia {
    private final String nombre;
    private Pais pais; // relación con composición débil (contenedor)
    private final List<Ciudad> ciudades = new ArrayList<>();

    public Provincia(String nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    void setPais(Pais pais) { this.pais = pais; }
    public Pais getPais() { return pais; }
    public String getNombre() { return nombre; }
    public List<Ciudad> getCiudades() { return List.copyOf(ciudades); }

    public void agregarCiudad(Ciudad c) {
        Objects.requireNonNull(c);
        if (c.getProvincia() != null && c.getProvincia() != this) {
            throw new IllegalStateException("La ciudad ya pertenece a otra provincia");
        }
        c.setProvincia(this);
        ciudades.add(c);
    }
}
