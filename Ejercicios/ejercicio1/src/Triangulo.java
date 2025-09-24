import java.util.List;

public class Triangulo extends Poligono{
    public Triangulo(String nombre, java.util.List <Lado> lados) {
        super(nombre, lados);
        if (lados.size() != 3)
            throw new IllegalArgumentException("Un triangulo debe tener 3 lados");
    }
    @Override
    public double area() {
        double s = perimetro() / 2.0;
        double a = getLados().get(0).longitud();
        double b = getLados().get(1).longitud();
        double c = getLados().get(2).longitud();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
