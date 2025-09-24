package ar.uda.geo.impuestos;

public final class ImpuestoGeneral extends Impuesto {
    private final double baseImponibleAnual;
    private final double alicuota; // 0..1

    public ImpuestoGeneral(String nombre, double baseImponibleAnual, double alicuota) {
        super(nombre);
        if (baseImponibleAnual < 0) throw new IllegalArgumentException("Base negativa");
        if (alicuota < 0 || alicuota > 1) throw new IllegalArgumentException("Alícuota fuera de rango");
        this.baseImponibleAnual = baseImponibleAnual;
        this.alicuota = alicuota;
    }

    @Override public double montoAnual() { return baseImponibleAnual * alicuota; }
}
