public class EJ1 {
    public static void main(String[] args) {
        imprimir('*', 5);
        imprimir('#', 3);
        imprimir('A', 4);
    }
    public static void imprimir(char caracter, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}
