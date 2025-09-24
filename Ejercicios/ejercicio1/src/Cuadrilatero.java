public abstract class Cuadrilatero extends Poligono {
    public Cuadrilatero(String nombre, java.util.List<Lado> lados) {
        super(nombre, lados);
        if (lados.size() != 4)
            throw new IllegalArgumentException("Un cuadrilátero debe tener 4 lados");
    }
}

