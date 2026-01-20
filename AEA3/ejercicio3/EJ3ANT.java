package ejercicio3;

import java.util.Scanner;

public class EJ3ANT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figura;
        while (true) {
            System.out.print(
                    "Escribe una figura (triangulo, circulo, trapecio, rombo, paralelogramo) o 'salir' para terminar: ");
            figura = sc.nextLine();
            if (figura.equals("salir")) {
                System.out.println("¡Programa terminado!");
                break;
            }
            switch (figura) {
                case "triangulo":
                    double baseT = leerNumero(sc, "Introduce la base: ");
                    double alturaT = leerNumero(sc, "Introduce la altura: ");
                    sc.nextLine();
                    System.out.println("Área del triángulo: " + calcularAreaTriangulo(baseT, alturaT));
                    break;
                case "circulo":
                    double radio = leerNumero(sc, "Introduce el radio: ");
                    sc.nextLine();
                    System.out.println("Área del círculo: " + calcularAreaCirculo(radio));
                    break;
                case "trapecio":
                    double baseMayor = leerNumero(sc, "Introduce la base mayor: ");
                    double baseMenor = leerNumero(sc, "Introduce la base menor: ");
                    double alturaTrap = leerNumero(sc, "Introduce la altura: ");
                    sc.nextLine();
                    System.out.println("Área del trapecio: " + calcularAreaTrapecio(baseMayor, baseMenor, alturaTrap));
                    break;
                case "rombo":
                    double diagMayor = leerNumero(sc, "Introduce la diagonal mayor: ");
                    double diagMenor = leerNumero(sc, "Introduce la diagonal menor: ");
                    sc.nextLine();
                    System.out.println("Área del rombo: " + calcularAreaRombo(diagMayor, diagMenor));
                    break;
                case "paralelogramo":
                    double baseP = leerNumero(sc, "Introduce la base: ");
                    double alturaP = leerNumero(sc, "Introduce la altura: ");
                    sc.nextLine();
                    System.out.println("Área del paralelogramo: " + calcularAreaParalelogramo(baseP, alturaP));
                    break;
                default:
                    System.out.println("Figura no válida");
            }
            System.out.println();
        }
    }

    public static double leerNumero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularAreaTrapecio(double baseMayor, double baseMenor, double altura) {
        return (baseMayor + baseMenor) * altura / 2;
    }

    public static double calcularAreaRombo(double diagonalMayor, double diagonalMenor) {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public static double calcularAreaParalelogramo(double base, double altura) {
        return base * altura;
    }
}
