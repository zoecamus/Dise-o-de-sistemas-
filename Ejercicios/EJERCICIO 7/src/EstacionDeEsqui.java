import java.util.ArrayList;

public class EstacionDeEsqui {
    private String codigo;
    private String nombre;
    private String contacto;
    private String direccion;
    private String telefono;
    private double kmsEsquiables;
    private int numPistas;
    private ArrayList<Pista> pistas;
    private ArrayList<Federacion> federacionesAdmin;

    // Constructor
    public EstacionDeEsqui(String codigo, String nombre, String contacto, String direccion, String telefono, double kmsEsquiables, int numPistas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.kmsEsquiables = kmsEsquiables;
        this.numPistas = numPistas;
        this.pistas = new ArrayList<>();
        this.federacionesAdmin = new ArrayList<>();
    }

    // Métodos para manejar asociaciones
    public void agregarPista(Pista pista) {
        this.pistas.add(pista);
    }
    public void agregarFederacion(Federacion federacion) {
        this.federacionesAdmin.add(federacion);
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}

