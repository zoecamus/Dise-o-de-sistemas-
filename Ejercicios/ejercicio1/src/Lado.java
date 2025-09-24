public class Lado {
    private Punto p1;
    private Punto p2;

    public Lado(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punto getP1(){
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    public double longitud(){
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
