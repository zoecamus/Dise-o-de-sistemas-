package ar.uda.geo;

import ar.uda.geo.impuestos.Impuesto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract sealed class Ciudad
        permits CiudadComun, CiudadMayor100k {


    private final String nombre;
    private int poblacion;
    private Provincia provincia;

    private final List<ar.uda.geo.impuestos.Impuesto> impuestos = new ArrayList<>();
    private final List<GastoMantenimiento> gastos = new ArrayList<>();

    protected Ciudad(String nombre, int poblacion) {
        this.nombre = Objects.requireNonNull(nombre);
        setPoblacion(poblacion);
    }

    public String getNombre() { return nombre; }
    public int getPoblacion() { return poblacion; }
    public Provincia getProvincia() { return provincia; }
    void setProvincia(Provincia p) { this.provincia = p; }

    public void setPoblacion(int poblacion) {
        if (poblacion < 0) throw new IllegalArgumentException("Población inválida");
        this.poblacion = poblacion;
    }

    public List<ar.uda.geo.impuestos.Impuesto> getImpuestos() { return List.copyOf(impuestos); }
    public List<GastoMantenimiento> getGastos() { return List.copyOf(gastos); }

    public void agregarImpuesto(ar.uda.geo.impuestos.Impuesto imp) {
        impuestos.add(Objects.requireNonNull(imp));
    }

    public void registrarGasto(GastoMantenimiento gasto) {
        gastos.add(Objects.requireNonNull(gasto));
    }

    public double totalRecaudado() {
        double total = 0.0;
        for (ar.uda.geo.impuestos.Impuesto imp : impuestos) {
            total += imp.montoAnual();
        }
        return total;
    }

    public double totalGastos() {
        return gastos.stream().mapToDouble(GastoMantenimiento::monto).sum();
    }
}