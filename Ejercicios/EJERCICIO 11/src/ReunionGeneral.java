import java.util.Date;

public class ReunionGeneral {
    private Date fechaUltimaReunion;
    private Date fechaProximaReunion;
    private double comisionFija;

    // Constructor
    public ReunionGeneral(Date fechaUltimaReunion, Date fechaProximaReunion, double comisionFija) {
        this.fechaUltimaReunion = fechaUltimaReunion;
        this.fechaProximaReunion = fechaProximaReunion;
        this.comisionFija = comisionFija;
    }

    // Getters y setters
    public Date getFechaUltimaReunion() {
        return fechaUltimaReunion;
    }

    public void setFechaUltimaReunion(Date fechaUltimaReunion) {
        this.fechaUltimaReunion = fechaUltimaReunion;
    }

    public Date getFechaProximaReunion() {
        return fechaProximaReunion;
    }

    public void setFechaProximaReunion(Date fechaProximaReunion) {
        this.fechaProximaReunion = fechaProximaReunion;
    }

    public double getComisionFija() {
        return comisionFija;
    }

    public void setComisionFija(double comisionFija) {
        this.comisionFija = comisionFija;
    }
}
