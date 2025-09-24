package aero;

import java.util.*;


public class Piloto extends Persona {

        private final String numeroLicencia;
        private String restricciones;
        private final Set<TipoAvion> habilitacionesVuelo = new HashSet<>();

        public Piloto(String nss, String nombre, String dir, String tel,
                      String numeroLicencia, String restricciones) {
            super(nss, nombre, dir, tel);
            this.numeroLicencia = Objects.requireNonNull(numeroLicencia);
            this.restricciones = Objects.requireNonNullElse(restricciones, "");
        }

        public String getNumeroLicencia() { return numeroLicencia; }
        public String getRestricciones() { return restricciones; }
        public void setRestricciones(String r) { this.restricciones = r; }

        public void habilitarPara(TipoAvion tipo) { habilitacionesVuelo.add(Objects.requireNonNull(tipo)); }
        public boolean puedeVolar(TipoAvion tipo) { return habilitacionesVuelo.contains(tipo); }
        public Set<TipoAvion> getHabilitaciones() { return Collections.unmodifiableSet(habilitacionesVuelo); }
    }

