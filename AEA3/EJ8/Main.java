package AEA3.EJ8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Allotjament> hotel = new ArrayList<>();

        hotel.add(new Habitacio("Habitacio1", 2, 2));
        hotel.add(new Habitacio("Habitacio2", 4, 4));
        hotel.add(new Apartament("Apartament1", 4, 3, true));
        hotel.add(new CasaRural("CasaRural1", 6, true, true));

        int opcio = 0;

        while (opcio != 4) {

            System.out.println("\n1 Mostrar allotjaments disponibles");
            System.out.println("2 Reservar allotjament");
            System.out.println("3 Alliberar allotjament");
            System.out.println("4 Sortir");

            opcio = sc.nextInt();
            sc.nextLine();

            if (opcio == 1) {

                for (Allotjament a : hotel) {

                    if (a.isDisponible()) {
                        System.out.println(a.mostrarInformacio());
                    }
                }
            }

            if (opcio == 2) {

                System.out.print("Nom allotjament: ");
                String nom = sc.nextLine();

                for (Allotjament a : hotel) {

                    if (a.getNom().equalsIgnoreCase(nom)) {

                        if (a.reservar()) {
                            System.out.println("Reservat correctament");
                        } else {
                            System.out.println("No disponible");
                        }
                    }
                }
            }

            if (opcio == 3) {

                System.out.print("Nom allotjament: ");
                String nom = sc.nextLine();

                for (Allotjament a : hotel) {

                    if (a.getNom().equalsIgnoreCase(nom)) {
                        a.alliberar();
                        System.out.println("Allotjament alliberat");
                    }
                }
            }
        }

        System.out.println("Programa finalitzat");
    }
}