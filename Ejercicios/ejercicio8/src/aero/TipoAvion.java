package aero;

import java.util.Objects;


public class TipoAvion {

        private final String numeroModelo; // p.ej. "A320", "B738"
        private final int capacidad;       // personas
        private final double pesoMaxKg;

        public TipoAvion(String numeroModelo, int capacidad, double pesoMaxKg) {
            this.numeroModelo = Objects.requireNonNull(numeroModelo);
            this.capacidad = capacidad;
            this.pesoMaxKg = pesoMaxKg;
        }

        public String getNumeroModelo() { return numeroModelo; }
        public int getCapacidad() { return capacidad; }
        public double getPesoMaxKg() { return pesoMaxKg; }

        @Override public boolean equals(Object o) {
            return (o instanceof TipoAvion ta) && ta.numeroModelo.equals(this.numeroModelo);
        }
        @Override public int hashCode() { return numeroModelo.hashCode(); }
        @Override public String toString() { return "TipoAvion{" + numeroModelo + "}"; }
    }

