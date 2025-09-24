public class Elipse extends Figura {
    private double radioMayor;
    private double radioMenor;

    public Elipse(String nombre, double radioMayor, double radioMenor) {
        super(nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double getRadioMayor() { return radioMayor; }
    public double getRadioMenor() { return radioMenor; }

    @Override
    public double area() {
        return Math.PI * radioMayor * radioMenor;
    }

    @Override
    public double perimetro() {
        // Aproximación de Ramanujan
        return Math.PI * (3*(radioMayor + radioMenor) - Math.sqrt((3*radioMayor + radioMenor)*(radioMayor + 3*radioMenor)));
    }
}
