import java.util.Objects;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = Objects.requireNonNull(nombre);}
    public  abstract double area();
    public abstract double perimetro();

}
