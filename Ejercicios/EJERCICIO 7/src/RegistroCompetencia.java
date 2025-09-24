import java.util.Date;

public class RegistroCompetencia {
    private Participante participante;
    private Prueba prueba;
    private Date[] fechasCompeticion;
    private double tiempoEmpleado;
    private int posicionObtenida;

    // Constructor
    public RegistroCompetencia(Participante participante, Prueba prueba, Date[] fechasCompeticion, double tiempoEmpleado, int posicionObtenida) {
        this.participante = participante;
        this.prueba = prueba;
        this.fechasCompeticion = fechasCompeticion;
        this.tiempoEmpleado = tiempoEmpleado;
        this.posicionObtenida = posicionObtenida;
    }

    // Getters y Setters
    public Participante getParticipante() { return participante; }
    public Prueba getPrueba() { return prueba; }
}

