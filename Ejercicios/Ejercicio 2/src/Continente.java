package model;

import java.util.*;

public class Continente {
    private final String nombre;
    private final Set<Pais> paises = new LinkedHashSet<>();

    public Continente(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre de continente vacío");
        }
        this.nombre = nombre.trim();
    }

    public String getNombre() { return nombre; }

    public Set<Pais> getPaises() {
        return Collections.unmodifiableSet(paises);
    }

    public void agregarPais(Pais pais) {
        Objects.requireNonNull(pais, "País requerido");
        if (paises.add(pais)) {
            pais.setContinente(this);
        }
    }

    public void quitarPais(Pais pais) {
        if (paises.remove(pais)) {
            pais.setContinente(null);
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}
