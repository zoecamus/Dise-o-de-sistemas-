package aero;

import java.util.*;


public class Mecanico extends Persona {


        public enum Turno { MANIANA, TARDE, NOCHE }
        private double salario;
        private Turno turno;
        private final Set<TipoAvion> habilitacionesMantenimiento = new HashSet<>();

        public Mecanico(String nss, String nombre, String dir, String tel,
                        double salario, Turno turno) {
            super(nss, nombre, dir, tel);
            this.salario = salario;
            this.turno = Objects.requireNonNull(turno);
        }

        public double getSalario() { return salario; }
        public void setSalario(double s) { this.salario = s; }
        public Turno getTurno() { return turno; }
        public void setTurno(Turno t) { this.turno = Objects.requireNonNull(t); }

        public void habilitarPara(TipoAvion tipo) { habilitacionesMantenimiento.add(Objects.requireNonNull(tipo)); }
        public boolean puedeMantener(TipoAvion tipo) { return habilitacionesMantenimiento.contains(tipo); }
        public Set<TipoAvion> getHabilitaciones() { return Collections.unmodifiableSet(habilitacionesMantenimiento); }
    }

