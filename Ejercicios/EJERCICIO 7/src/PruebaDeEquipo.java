import java.util.ArrayList;
import java.util.Date;

public class PruebaDeEquipo extends Prueba {
    // Constructor
    public PruebaDeEquipo(String nombre, Date[] fechasRealizacion, EstacionDeEsqui estacion, ArrayList<Pista> pistas) {
        super(nombre, "Por Equipo", fechasRealizacion, estacion, pistas);
    }
}
