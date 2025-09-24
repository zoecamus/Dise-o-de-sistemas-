package aero;

import java.util.Objects;


public abstract class Persona {

        private final String nss;         // nº de seguridad social
        private String nombre;
        private String direccion;
        private String telefono;

        protected Persona(String nss, String nombre, String direccion, String telefono) {
            this.nss = Objects.requireNonNull(nss);
            this.nombre = Objects.requireNonNull(nombre);
            this.direccion = Objects.requireNonNull(direccion);
            this.telefono = Objects.requireNonNull(telefono);
        }

        public String getNss() { return nss; }
        public String getNombre() { return nombre; }
        public String getDireccion() { return direccion; }
        public String getTelefono() { return telefono; }
        public void setNombre(String v) { nombre = Objects.requireNonNull(v); }
        public void setDireccion(String v) { direccion = Objects.requireNonNull(v); }
        public void setTelefono(String v) { telefono = Objects.requireNonNull(v); }

        @Override public boolean equals(Object o) { return (o instanceof Persona p) && p.nss.equals(this.nss); }
        @Override public int hashCode() { return nss.hashCode(); }
        @Override public String toString() { return getClass().getSimpleName()+"{"+nombre+"}"; }
    }

