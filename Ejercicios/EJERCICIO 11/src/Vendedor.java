import java.util.ArrayList;
import java.util.Date;

public class Vendedor extends RepresentanteVentas {
    private double montoVentasDesdeUltimaReunion;
    private ArrayList<TicketVenta> ticketsVenta;

    // Constructor
    public Vendedor(String nombre, String direccion, String telefono, Date fechaNacimiento, String CUIT, Date fechaIncorporacion) {
        super(nombre, direccion, telefono, fechaNacimiento, CUIT, fechaIncorporacion);
        this.montoVentasDesdeUltimaReunion = 0.0;
        this.ticketsVenta = new ArrayList<>();
    }

    // Método para registrar una venta y actualizar el monto
    public void registrarVenta(TicketVenta ticket) {
        this.ticketsVenta.add(ticket);
        this.montoVentasDesdeUltimaReunion += ticket.getPrecio();
    }

    // Implementación del método abstracto para calcular la comisión
    @Override
    public void calcularComision(double porcentajeComision) {
        this.comision = this.montoVentasDesdeUltimaReunion * porcentajeComision;
    }

    // Getters y setters
    public double getMontoVentasDesdeUltimaReunion() {
        return montoVentasDesdeUltimaReunion;
    }
}
