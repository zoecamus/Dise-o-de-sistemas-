package ar.uda.geo;

import java.time.LocalDate;
import java.util.Objects;

/** Valor simple: fecha, concepto y monto. */
public record GastoMantenimiento(LocalDate fecha, String concepto, double monto) {
    public GastoMantenimiento {
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(concepto);
        if (monto < 0) throw new IllegalArgumentException("Monto negativo");
    }
}

