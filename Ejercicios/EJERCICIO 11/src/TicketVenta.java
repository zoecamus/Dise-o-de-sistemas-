import java.util.Date;

public class TicketVenta {
    private Date fecha;
    private Producto producto;
    private double precio;

    // Constructor
    public TicketVenta(Date fecha, Producto producto, double precio) {
        this.fecha = fecha;
        this.producto = producto;
        this.precio = precio;
    }

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
