package ar.uda.geo;

import ar.uda.geo.impuestos.ImpuestoGeneral;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        var pais = new Pais("Argentina");
        var mendoza = new Provincia("Mendoza");
        pais.agregarProvincia(mendoza);

        var godoyCruz = new CiudadMayor100k("Godoy Cruz", 210000);
        mendoza.agregarCiudad(godoyCruz);

        // --- impuestos (forzados a que den != 0)
        godoyCruz.agregarImpuesto(new ImpuestoGeneral("Tasa Municipal", 1000.0, 1.0)); // => 1000
        godoyCruz.agregarImpuesto(new ImpuestoGeneral("Alumbrado", 500.0, 0.5));       // => 250

        // --- gastos
        godoyCruz.registrarGasto(new GastoMantenimiento(LocalDate.now(), "Bacheo", 200.0));
        godoyCruz.registrarGasto(new GastoMantenimiento(LocalDate.now(), "Plazas", 300.0));

        // DEBUG: listar lo que hay
        System.out.println("Impuestos cargados: " + godoyCruz.getImpuestos().size());
        godoyCruz.getImpuestos().forEach(i ->
                System.out.println("  - " + i.getNombre() + " => " + i.montoAnual()));
        System.out.println("Gastos cargados: " + godoyCruz.getGastos().size());

        System.out.printf("Recaudación %s: $%.2f%n", godoyCruz.getNombre(), godoyCruz.totalRecaudado());
        System.out.printf("Gastos %s: $%.2f%n",       godoyCruz.getNombre(), godoyCruz.totalGastos());
    }
}
