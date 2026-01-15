import java.util.Scanner;

public class EJ3 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        EJ3 programa = new EJ3();
        programa.inici();
    }

    public void inici() {
        String figura = "";

        while (!figura.equalsIgnoreCase("fi")) {

            mostrarMenu();
            figura = sc.nextLine();

            switch (figura.toLowerCase()) {
                case "triangulo":
                    areaTriangulo();
                    break;
                case "circulo":
                    areaCirculo();
                    break;
                case "trapecio":
                    areaTrapecio();
                    break;
                case "rombo":
                    areaRombo();
                    break;
                case "paralelogramo":
                    areaParalelogramo();
                    break;
                case "fi":
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Figura no válida.");
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("De que figura quieres calcular el area?");
        System.out.println("Opciones: triangulo, circulo, trapecio, rombo, paralelogramo");
        System.out.println("Para acabar el programa: fi");
    }

    public void areaTriangulo() {
        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        double area = base * altura / 2;
        System.out.println("Area del triangulo: " + area);
    }

    public void areaCirculo() {
        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();
        sc.nextLine();

        double area = Math.PI * radio * radio;
        System.out.println("Area del circulo: " + area);
    }

    public void areaTrapecio() {
        System.out.print("Introduce la base mayor: ");
        double baseMayor = sc.nextDouble();
        System.out.print("Introduce la base menor: ");
        double baseMenor = sc.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        double area = (baseMayor + baseMenor) * altura / 2;
        System.out.println("Area del trapecio: " + area);
    }

    public void areaRombo() {
        System.out.print("Introduce la diagonal mayor: ");
        double dMayor = sc.nextDouble();
        System.out.print("Introduce la diagonal menor: ");
        double dMenor = sc.nextDouble();
        sc.nextLine();

        double area = dMayor * dMenor / 2;
        System.out.println("Area del rombo: " + area);
    }

    public void areaParalelogramo() {
        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        double area = base * altura;
        System.out.println("Area del paralelogramo: " + area);
    }
}
