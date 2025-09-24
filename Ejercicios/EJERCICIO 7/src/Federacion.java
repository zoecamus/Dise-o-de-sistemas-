import java.util.ArrayList;

public class Federacion {
    private String nombre;
    private int numFederados;
    private ArrayList<Esquiador> esquiadores;
    private ArrayList<EstacionDeEsqui> estaciones;

    // Constructor
    public Federacion(String nombre) {
        this.nombre = nombre;
        this.esquiadores = new ArrayList<>();
        this.estaciones = new ArrayList<>();
        this.numFederados = 0;
    }

    // Métodos para manejar asociaciones
    public void agregarEsquiador(Esquiador esquiador) {
        this.esquiadores.add(esquiador);
        this.numFederados++;
    }
    public void agregarEstacion(EstacionDeEsqui estacion) {
        this.estaciones.add(estacion);
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getNumFederados() { return numFederados; }
}

