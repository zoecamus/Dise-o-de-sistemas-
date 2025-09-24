package model;

public class Demo {
    public static void main(String[] args) {
        Continente america = new Continente("América");
        Pais argentina = new Pais("Argentina");
        Pais chile = new Pais("Chile");

        america.agregarPais(argentina);
        america.agregarPais(chile);

        // frontera
        argentina.agregarFronteraCon(chile);

        // provincias y ciudades
        Provincia mendoza = argentina.crearProvincia("Mendoza");
        Ciudad mzaCapital = mendoza.crearCiudad("Ciudad de Mendoza", true);

        Provincia bsas = argentina.crearProvincia("Buenos Aires");
        Ciudad caba = bsas.crearCiudad("CABA", true);

        // capital del país
        argentina.definirCapital(caba);

        // salida
        System.out.println("Continente: " + argentina.getContinente().get().getNombre());
        System.out.println("Capital de Argentina: " + argentina.getCapital().get().getNombre());
        System.out.println("Países limítrofes con Argentina: " + argentina.getLimitrofes());
        System.out.println("Provincias de Argentina: " + argentina.getProvincias());
        System.out.println("Ciudades de Mendoza: " + mendoza.getCiudades());
        System.out.println("¿Ciudad de Mendoza es capital de provincia? " + mzaCapital.isCapitalDeProvincia());
    }
}
