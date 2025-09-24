public class Cuadrado extends Rectangulo {
    public Cuadrado(String nombre, java.util.List<Lado> lados) {
        super(nombre, lados);
    }

    @Override
    public double area() {
        double lado = getLados().get(0).longitud();
        return lado * lado;
    }
}
