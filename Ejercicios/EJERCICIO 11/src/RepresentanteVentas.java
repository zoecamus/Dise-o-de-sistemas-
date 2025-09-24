import java.util.Date;
import java.util.ArrayList;

public abstract class RepresentanteVentas extends Persona {
    protected String CUIT;
    protected Date fechaIncorporacion;
    protected double comision;
    protected ArrayList<Cliente> carteraClientes;

    // Constructor
    public RepresentanteVentas(String nombre, String direccion, String telefono, Date fechaNacimiento, String CUIT, Date fechaIncorporacion) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.CUIT = CUIT;
        this.fechaIncorporacion = fechaIncorporacion;
        this.carteraClientes = new ArrayList<>();
    }

    // Método abstracto para calcular la comisión, debe ser implementado por las subclases
    public abstract void calcularComision(double porcentajeComision);
}
