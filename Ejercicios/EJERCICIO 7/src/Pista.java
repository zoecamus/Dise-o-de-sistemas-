public class Pista {
    private String codigoEstacion;
    private int numCorrelativo;
    private double longitudKm;
    private String nivelDificultad;
    private EstacionDeEsqui estacion;

    // Constructor
    public Pista(EstacionDeEsqui estacion, int numCorrelativo, double longitudKm, String nivelDificultad) {
        this.estacion = estacion;
        this.codigoEstacion = estacion.getCodigo();
        this.numCorrelativo = numCorrelativo;
        this.longitudKm = longitudKm;
        this.nivelDificultad = nivelDificultad;
    }

    // Getters y Setters
    public String getCodigoEstacion() { return codigoEstacion; }
    public int getNumCorrelativo() { return numCorrelativo; }
    public EstacionDeEsqui getEstacion() { return estacion; }
}

