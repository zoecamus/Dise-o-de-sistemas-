package model;

import java.util.*;

public class Pais {
    private final String nombre;
    private Continente continente; // relación de agregación
    private final List<Provincia> provincias = new ArrayList<>();
    private final Set<Pais> limitrofes = new HashSet<>();
    private Ciudad capital;

    public Pais(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre de país vacío");
        }
        this.nombre = nombre.trim();
    }

    public String getNombre() { return nombre; }
    public Optional<Continente> getContinente() { return Optional.ofNullable(continente); }
    public List<Provincia> getProvincias() { return Collections.unmodifiableList(provincias); }
    public Set<Pais> getLimitrofes() { return Collections.unmodifiableSet(limitrofes); }
    public Optional<Ciudad> getCapital() { return Optional.ofNullable(capital); }

    void setContinente(Continente continente) {
        this.continente = continente;
    }

    public Provincia crearProvincia(String nombreProvincia) {
        Provincia p = new Provincia(nombreProvincia, this);
        provincias.add(p);
        return p;
    }

    public void definirCapital(Ciudad ciudad) {
        Objects.requireNonNull(ciudad, "Ciudad requerida");
        if (ciudad.getProvincia().getPais() != this) {
            throw new IllegalArgumentException("La capital debe ser ciudad de este país");
        }
        this.capital = ciudad;
    }

    public void agregarFronteraCon(Pais otro) {
        if (otro == null || otro == this) return;
        this.limitrofes.add(otro);
        otro.limitrofes.add(this);
    }

    @Override
    public String toString() { return nombre; }
}
