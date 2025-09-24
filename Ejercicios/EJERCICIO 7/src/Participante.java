import java.util.ArrayList;

public abstract class Participante {
    private String codigo;

    // Constructor
    public Participante(String codigo) {
        this.codigo = codigo;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public abstract String getNombre();
    public abstract String getTipoParticipante();
}

