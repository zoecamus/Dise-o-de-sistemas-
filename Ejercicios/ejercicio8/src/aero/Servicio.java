package aero;

import java.time.LocalDate;
import java.util.Objects;



public class Servicio {

        private final Avion avion;
        private final Mecanico mecanico;
        private final LocalDate fecha;
        private final double horas;
        private final String tipoTrabajo;

        public Servicio(Avion avion, Mecanico mecanico, LocalDate fecha, double horas, String tipoTrabajo) {
            this.avion = Objects.requireNonNull(avion);
            this.mecanico = Objects.requireNonNull(mecanico);
            this.fecha = Objects.requireNonNull(fecha);
            if (horas <= 0) throw new IllegalArgumentException("Horas > 0");
            this.horas = horas;
            this.tipoTrabajo = Objects.requireNonNull(tipoTrabajo);
            // Nota: Podrías validar habilitaciones del mecánico contra el tipo del avión:
            // if (!mecanico.puedeMantener(avion.getTipo())) throw new IllegalStateException("Mecánico no habilitado para este tipo");
        }

        public Avion getAvion() { return avion; }
        public Mecanico getMecanico() { return mecanico; }
        public LocalDate getFecha() { return fecha; }
        public double getHoras() { return horas; }
        public String getTipoTrabajo() { return tipoTrabajo; }

        @Override public boolean equals(Object o) {
            if (!(o instanceof Servicio s)) return false;
            return avion.equals(s.avion) && fecha.equals(s.fecha) && tipoTrabajo.equals(s.tipoTrabajo);
        }
        @Override public int hashCode() {
            return Objects.hash(avion, fecha, tipoTrabajo);
        }
        @Override public String toString() {
            return "Servicio{" + fecha + ", " + tipoTrabajo + ", " + mecanico + ", horas=" + horas + "}";
        }
    }

