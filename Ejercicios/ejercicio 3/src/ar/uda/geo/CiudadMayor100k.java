package ar.uda.geo;

public final class CiudadMayor100k extends Ciudad {
    public CiudadMayor100k(String nombre, int poblacion) {
        super(nombre, poblacion);
        if (poblacion < 100_000) {
            throw new IllegalArgumentException("CiudadMayor100k requiere población >= 100.000");
        }
    }

    @Override
    public void setPoblacion(int poblacion) {
        super.setPoblacion(poblacion);
        if (poblacion < 100_000) {
            throw new IllegalArgumentException("No se puede bajar de 100.000 habitantes");
        }
    }
}
