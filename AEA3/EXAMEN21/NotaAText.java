package EXAMEN21;

public class NotaAText {
    // Param. entr:
    // Param. sort:
    public String notaAText(double nota) {
        if (nota < 5) {
            return "Suspes";
        } else if (nota < 7) {
            return "Aprovat";
        } else if (nota < 9) {
            return "Notable";
        } else {
            return "Excellent";
        }
    }
}
