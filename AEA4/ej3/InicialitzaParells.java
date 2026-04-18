package AEA4.ej3;

public class InicialitzaParells {
    public static void main(String[] args) {
        int[] arrayParells = new int[100];

        try {
            for (int i = 0; i <= arrayParells.length; i++) {
                arrayParells[i] = 2 * i;
                System.out.println(arrayParells[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: s'ha intentat accedir fora dels límits de l'array");
        } catch (Exception e) {
            System.out.println("Error inesperat: " + e.getMessage());
        } finally {
            System.out.println("Programa finalitzat");
        }
    }
}
