package model;

import java.util.Objects;

public class Ciudad {
    private final String nombre;
    private final Provincia provincia;
    private boolean esCapitalDeProvincia;

    Ciudad(String nombre, Provincia provincia) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre de ciudad vacío");
        }
        this.nombre = nombre.trim();
        this.provincia = Objects.requireNonNull(provincia, "Provincia requerida");
    }

    public String getNombre() { return nombre; }
    public Provincia getProvincia() { return provincia; }
    public boolean isCapitalDeProvincia() { return esCapitalDeProvincia; }

    void marcarComoCapitalDeProvincia(boolean valor) {
        this.esCapitalDeProvincia = valor;
    }

    @Override
    public String toString() { return nombre; }
}
