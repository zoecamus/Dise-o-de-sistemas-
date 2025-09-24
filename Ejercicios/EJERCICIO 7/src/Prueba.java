import java.util.ArrayList;
import java.util.Date;

public abstract class Prueba {
    private String nombre;
    private String tipo;
    private Date[] fechasRealizacion;
    private Participante vencedor;
    private double tiempoVencedor;
    private EstacionDeEsqui estacion;
    private ArrayList<Pista> pistas;

    // Constructor
    public Prueba(String nombre, String tipo, Date[] fechasRealizacion, EstacionDeEsqui estacion, ArrayList<Pista> pistas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechasRealizacion = fechasRealizacion;
        this.estacion = estacion;
        this.pistas = pistas;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setVencedor(Participante vencedor, double tiempoVencedor) {
        this.vencedor = vencedor;
        this.tiempoVencedor = tiempoVencedor;
    }
}
