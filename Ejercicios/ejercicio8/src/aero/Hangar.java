package aero;

import java.util.*;



public class Hangar {

        private final String numero;     // identificador
        private final int capacidad;     // cantidad de aviones que entran
        private final String ubicacion;
        private final Set<Avion> aviones = new HashSet<>();

        public Hangar(String numero, int capacidad, String ubicacion) {
            this.numero = Objects.requireNonNull(numero);
            if (capacidad <= 0) throw new IllegalArgumentException("Capacidad > 0");
            this.capacidad = capacidad;
            this.ubicacion = Objects.requireNonNull(ubicacion);
        }

        public String getNumero() { return numero; }
        public int getCapacidad() { return capacidad; }
        public String getUbicacion() { return ubicacion; }

        void _ingresar(Avion a) {
            if (aviones.size() >= capacidad) throw new IllegalStateException("Hangar lleno");
            aviones.add(a);
        }
        void _retirar(Avion a) { aviones.remove(a); }

        public Set<Avion> getAviones() { return Collections.unmodifiableSet(aviones); }

        @Override public String toString() { return "Hangar{" + numero + "}"; }
    }

