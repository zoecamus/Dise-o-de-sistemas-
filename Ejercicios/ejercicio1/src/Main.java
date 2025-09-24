//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Punto a = new Punto(0, 0);
        Punto b = new Punto(4, 0);
        Punto c = new Punto(4, 3);

        Triangulo t = new Triangulo("Mi Triángulo", List.of(
                new Lado(a, b),
                new Lado(b, c),
                new Lado(c, a)
        ));

        System.out.println("Area triangulo: " + t.area());
        System.out.println("Perimetro triangulo: " + t.perimetro());

        Circulo circ = new Circulo("Mi circulo" , 5);
        System.out.println("Area circulo: " + circ.area());
        System.out.println("Perimetro circulo: " + circ.perimetro());
    }
}