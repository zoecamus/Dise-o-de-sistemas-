import java.util.Date;

public class Cliente extends Persona {
    private Date fechaIngreso;

    // Constructor
    public Cliente(String nombre, String direccion, String telefono, Date fechaNacimiento, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.fechaIngreso = fechaIngreso;
    }

    // Getters y setters
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}

