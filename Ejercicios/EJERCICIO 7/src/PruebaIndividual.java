import java.util.ArrayList;
import java.util.Date;

public class PruebaIndividual extends Prueba {
    // Constructor
    public PruebaIndividual(String nombre, Date[] fechasRealizacion, EstacionDeEsqui estacion, ArrayList<Pista> pistas) {
        super(nombre, "Individual", fechasRealizacion, estacion, pistas);
    }
}
