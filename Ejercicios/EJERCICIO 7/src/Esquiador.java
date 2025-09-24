import java.util.Date;
import java.util.ArrayList;

public class Esquiador extends Participante {
    private String dni;
    private String nombre;
    private Date fechaNacimiento;
    private int edad;
    private Federacion federacion;
    private Equipo equipo; // Opcional, si pertenece a un equipo

    // Constructor para esquiador individual
    public Esquiador(String codigo, String dni, String nombre, Date fechaNacimiento, int edad, Federacion federacion) {
        super(codigo);
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.federacion = federacion;
        this.equipo = null; // No pertenece a equipo
    }

    // Constructor para esquiador en equipo
    public Esquiador(String codigo, String dni, String nombre, Date fechaNacimiento, int edad, Federacion federacion, Equipo equipo) {
        super(codigo);
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.federacion = federacion;
        this.equipo = equipo;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getTipoParticipante() {
        return "Individual";
    }

    // Getters y Setters
    public String getDni() { return dni; }
    public Federacion getFederacion() { return federacion; }
    public Equipo getEquipo() { return equipo; }
}
