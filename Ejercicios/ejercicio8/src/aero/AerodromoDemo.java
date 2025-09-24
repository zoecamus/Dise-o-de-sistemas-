package aero;

import java.time.LocalDate;


public class AerodromoDemo {

        public static void main(String[] args) {
            // Tipos
            aero.TipoAvion a320 = new aero.TipoAvion("A320", 180, 73500);
            aero.TipoAvion b738 = new aero.TipoAvion("B738", 189, 79000);

            // Hangares
            aero.Hangar h1 = new aero.Hangar("H1", 2, "Sector Norte");
            aero.Hangar h2 = new aero.Hangar("H2", 1, "Sector Sur");

            // Personas
            aero.Propietario acme = new aero.Propietario("NSS001","ACME SA","Av. Siempre Viva 742","+54 261 123");
            aero.Piloto juan = new aero.Piloto("NSS010","Juan Perez","Calle 1","111", "LIC-1234", "Lentes");
            aero.Mecanico ana = new aero.Mecanico("NSS020","Ana Gomez","Calle 2","222", 900000, aero.Mecanico.Turno.MANIANA);
            juan.habilitarPara(a320);
            ana.habilitarPara(a320);
            ana.habilitarPara(b738);

            // Aviones
            aero.Avion lvabc = new aero.Avion("LV-ABC", a320, h1);
            aero.Avion lvxyz = new aero.Avion("LV-XYZ", b738, h1);

            // Propiedad
            lvabc.transferirA(acme, LocalDate.of(2023, 5, 10));
            lvxyz.transferirA(acme, LocalDate.of(2024, 3, 1));

            // Servicios (unicidad por avión+fecha+tipoTrabajo)
            lvabc.registrarServicio(ana, LocalDate.of(2024, 6, 1), 5.5, "Chequeo A");
            lvabc.registrarServicio(ana, LocalDate.of(2024, 6, 1), 2.0, "Cambio filtro");
            // lvabc.registrarServicio(ana, LocalDate.of(2024, 6, 1), 1.0, "Chequeo A"); // <- arroja excepción por duplicado

            // Mover avión a otro hangar
            lvxyz.setHangar(h2);

            System.out.println(lvabc);
            System.out.println("Propietario actual: " + lvabc.getPropietarioActual() + " desde " + lvabc.getFechaAdquisicionActual());
            System.out.println("Servicios: " + lvabc.getServicios());
            System.out.println("H1 contiene: " + h1.getAviones());
            System.out.println("H2 contiene: " + h2.getAviones());
            System.out.println("Juan puede volar A320? " + juan.puedeVolar(a320));
        }
    }
