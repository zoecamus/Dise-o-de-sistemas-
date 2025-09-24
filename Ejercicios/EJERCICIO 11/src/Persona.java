import java.util.Date;

public abstract class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected Date fechaNacimiento;

    // Constructor
    public Persona(String nombre, String direccion, String telefono, Date fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }
}