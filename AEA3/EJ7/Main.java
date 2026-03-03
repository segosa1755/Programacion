package AEA3.EJ7;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escull figura: triangle, quadrat, rectangle, trapezi, rombre, parallelogram, cercle");
        String opcio = sc.nextLine().toLowerCase();

        Figura figura = null;

        switch (opcio) {

            case "triangle":
                if (random.nextBoolean()) {
                    figura = new Triangle();
                } else {
                    figura = new Triangle(1, 1);
                }
                break;

            case "rectangle":
                figura = new Rectangle();
                break;

            case "quadrat":
                figura = new Quadrat();
                break;

            case "trapezi":
                figura = new Trapezi();
                break;

            case "rombre":
                figura = new Rombe();
                break;

            case "parallelogram":
                figura = new Parallelogram();
                break;

            case "cercle":
                figura = new Cercle();
                break;

            default:
                System.out.println("Figura no valida");
                return;
        }

        figura.llegirDades();
        figura.calcularArea();
        figura.mostrarArea();
        figura.seguentFigura();
    }
}