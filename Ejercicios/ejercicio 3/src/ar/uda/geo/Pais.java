package ar.uda.geo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Pais {
    private final String nombre;
    private final List<Provincia> provincias = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public String getNombre() { return nombre; }
    public List<Provincia> getProvincias() { return List.copyOf(provincias); }

    public void agregarProvincia(Provincia p) {
        Objects.requireNonNull(p);
        if (p.getPais() != null && p.getPais() != this) {
            throw new IllegalStateException("La provincia ya pertenece a otro país");
        }
        p.setPais(this);
        provincias.add(p);
    }
}