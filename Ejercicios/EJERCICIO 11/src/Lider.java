import java.util.ArrayList;
import java.util.Date;

public class Lider extends Vendedor {
    private Date fechaPromocionLider;
    private ArrayList<Vendedor> equipoVendedores;

    // Constructor
    public Lider(String nombre, String direccion, String telefono, Date fechaNacimiento, String CUIT, Date fechaIncorporacion, Date fechaPromocionLider) {
        super(nombre, direccion, telefono, fechaNacimiento, CUIT, fechaIncorporacion);
        this.fechaPromocionLider = fechaPromocionLider;
        this.equipoVendedores = new ArrayList<>();
    }

    // Método para agregar un vendedor al equipo
    public void agregarVendedor(Vendedor vendedor) {
        this.equipoVendedores.add(vendedor);
    }

    // Implementación del método abstracto para calcular la comisión
    @Override
    public void calcularComision(double porcentajeComision) {
        // Calcular la comisión del líder por sus propias ventas (heredado de Vendedor)
        super.calcularComision(porcentajeComision);

        // Calcular la comisión adicional por las ventas de su equipo
        double montoTotalEquipo = 0.0;
        for (Vendedor vendedor : equipoVendedores) {
            montoTotalEquipo += vendedor.getMontoVentasDesdeUltimaReunion();
        }
        this.comision += montoTotalEquipo * porcentajeComision;
    }

    // Getters y setters
}
