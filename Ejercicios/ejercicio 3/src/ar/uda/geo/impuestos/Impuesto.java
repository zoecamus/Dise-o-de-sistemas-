package ar.uda.geo.impuestos;

public abstract sealed class Impuesto permits ImpuestoGeneral {
    private final String nombre;

    protected Impuesto(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre vacío");
        this.nombre = nombre;
    }
    public String getNombre() { return nombre; }
    public abstract double montoAnual();
}
