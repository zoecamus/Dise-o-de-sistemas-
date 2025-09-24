public class Rectangulo extends Cuadrilatero {
    public Rectangulo(String nombre, java.util.List<Lado> lados) {
        super(nombre, lados);
    }

    @Override
    public double area() {
        double base = getLados().get(0).longitud();
        double altura = getLados().get(1).longitud();
        return base * altura;
    }
}

