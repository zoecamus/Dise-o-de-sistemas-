package aero;

import java.time.LocalDate;
import java.util.*;



public class Avion {

        private final String matricula;       // único
        private final TipoAvion tipo;
        private Hangar hangar;

        // Propiedad actual + historial
        private Propietario propietarioActual;
        private LocalDate fechaAdquisicionActual;
        private final List<String> historialPropiedad = new ArrayList<>();

        private final Set<Servicio> servicios = new HashSet<>();

        public Avion(String matricula, TipoAvion tipo, Hangar hangarInicial) {
            this.matricula = Objects.requireNonNull(matricula);
            this.tipo = Objects.requireNonNull(tipo);
            setHangar(hangarInicial);
        }

        public String getMatricula() { return matricula; }
        public TipoAvion getTipo() { return tipo; }
        public Hangar getHangar() { return hangar; }

        public void setHangar(Hangar nuevo) {
            Objects.requireNonNull(nuevo);
            if (this.hangar != null) this.hangar._retirar(this);
            this.hangar = nuevo;
            nuevo._ingresar(this);
        }

        /* --- Propietarios --- */
        public Propietario getPropietarioActual() { return propietarioActual; }
        public LocalDate getFechaAdquisicionActual() { return fechaAdquisicionActual; }

        public void transferirA(Propietario nuevoProp, LocalDate fechaAdq) {
            Objects.requireNonNull(nuevoProp);
            Objects.requireNonNull(fechaAdq);
            if (propietarioActual != null) {
                historialPropiedad.add(
                        String.format("%s -> %s hasta %s",
                                propietarioActual.getNombre(), nuevoProp.getNombre(), fechaAdq.minusDays(1))
                );
            }
            propietarioActual = nuevoProp;
            fechaAdquisicionActual = fechaAdq;
        }

        public List<String> getHistorialPropiedad() { return Collections.unmodifiableList(historialPropiedad); }

        /* --- Servicios (unicidad: avion + fecha + tipoTrabajo) --- */
        public Servicio registrarServicio(Mecanico mec, LocalDate fecha, double horas, String tipoTrabajo) {
            Servicio s = new Servicio(this, mec, fecha, horas, tipoTrabajo);
            if (!servicios.add(s)) {
                throw new IllegalArgumentException("Servicio duplicado (misma fecha y tipo de trabajo para este avión).");
            }
            return s;
        }

        public Set<Servicio> getServicios() { return Collections.unmodifiableSet(servicios); }

        @Override public boolean equals(Object o) { return (o instanceof Avion a) && a.matricula.equals(this.matricula); }
        @Override public int hashCode() { return matricula.hashCode(); }
        @Override public String toString() { return "Avion{" + matricula + ", tipo=" + tipo + "}"; }
    }

