import java.util.ArrayList;

public class Equipo extends Participante {
    private String nombre;
    private String entrenador;
    private ArrayList<Esquiador> esquiadores;

    // Constructor
    public Equipo(String codigo, String nombre, String entrenador) {
        super(codigo);
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.esquiadores = new ArrayList<>();
    }

    // Método para agregar esquiadores al equipo
    public void agregarEsquiador(Esquiador esquiador) {
        this.esquiadores.add(esquiador);
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getTipoParticipante() {
        return "Equipo";
    }

    // Getters y Setters
    public String getEntrenador() { return entrenador; }
    public int getCantidadEsquiadores() { return esquiadores.size(); }
    public ArrayList<Esquiador> getEsquiadores() { return esquiadores; }
}

