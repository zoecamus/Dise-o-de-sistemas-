import java.util.ArrayList;
import java.util.List;

public abstract class Poligono extends Figura {
    private List<Lado> lados = new ArrayList<>();

    public Poligono(String nombre, List<Lado> lados){
        super(nombre);
        if (lados.size() < 3)
            throw new IllegalArgumentException("Un poligono debe tener al menos 3 lados");
        this.lados.addAll(lados);
    }
    public  List<Lado> getLados(){
        return lados;
    }

    @Override
    public double perimetro(){
        return lados.stream().mapToDouble(Lado::longitud).sum();
    }
}
