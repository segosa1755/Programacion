package AEA4.ej4;

public class RegistreTemperatures {
    public static void main(String[] args) {
        int[] temperatures = new int[5];

        try {
            for (int i = 0; i <= temperatures.length; i++) {
                temperatures[i] = i * 10;
                System.out.println("Temperatura " + i + ": " + temperatures[i]);
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
