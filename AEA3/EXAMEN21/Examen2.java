package EXAMEN21;

import java.util.Scanner;

public class Examen2 {
    public static double[] notes = new double[50];
    public int MARCA_NOTES = -1;
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 0;
    public double min = 10;
    public double mitj = 0;

    private final CalculArrays calculador = new CalculArrays();
    // private final CercaDicotomica cerca = new CercaDicotomica(); LO PONGO EN
    // COMENTARIO PORQUE NO LO HE UTILIZADO Y ASI NO DA ERROR
    private final NotaAText transformar = new NotaAText();

    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
    }

    public void inici() {
        Scanner sc = new Scanner(System.in);

        PreguntarNotes();
        ImprimirArrayNotes();

        while (!fi) {

            MostrarMenu();
            String opcio = sc.nextLine();

            if (opcio.equalsIgnoreCase(MARCA_FI)) {
                fi = true;
            } else {
                TractarOpcio(opcio);
            }
        }
    }

    // Param. entr:no tiene
    // Param. sort:no tiene
    // FUNCIÓ: Aqui lo que ahcemos es leer las notas yo he escogido la ocpion de no
    // pasar por terminal pero bueno ponemos als notas a mano y ya
    private void PreguntarNotes() {
        // OPCIÓ 1 --> Les dades les definim DIRECTAMENT al programa
        notes[0] = 1;
        notes[1] = 4;
        notes[2] = 7;
        notes[3] = 8;
        notes[4] = 0;
        notes[5] = 9;
        notes[6] = 10;
        NUM_NOTES = 7;
        // -----------------------
        // OPCIÓ 2 --> PUNTUACIÓ EXTRA (1p+). Agafem les dades de terminal
        // Comenceu per l'opció 1!!
        // System.out.println("\nAbans de començar, escriu tantes notes ENTERES com
        // vulguis.");
        // System.out.println("\nQuan hagis acabat d'escriure les notes, escriu un
        // -1.");
        // System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
    }

    // Param. entr: no tiene
    // Param. sort: no tiene
    // FUNCIÓ: Pues aqui imprimimos las notas de la array que hemso creado en lo de
    // preguntar notas.
    private void ImprimirArrayNotes() {
        System.out.print("L'array de notes avaluat és: [ ");
        for (int i = 0; i < NUM_NOTES; i++) {
            System.out.print(notes[i] + " ");
        }
        System.out.println("]");
    }

    // Param. entr: no tiene
    // Param. sort: no tiene
    private void MostrarMenu() {
        System.out.println("\nBenvinguda al càlcul de notes de classe.");
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("[MAX] Saber la nota màxima de classe");
        System.out.println("[MIN] Saber la nota mínima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    // Param. entr: no tiene
    // Param. sort: Iene el void pero como es privado pues esta vacio el pobre
    // FUNCIÓ: Pues aqui tartamos cada una de las opciones ya se maximo, minimo o
    // mediano.
    private void TractarOpcio(String opcio) {
        double resultat = 0;
        if (opcio.equalsIgnoreCase("MAX")) {
            resultat = calculador.calcularMaxim(notes);
        } else if (opcio.equalsIgnoreCase("MIN")) {
            resultat = calculador.calcularMinim(notes);
        } else if (opcio.equalsIgnoreCase("MIT")) {
            resultat = calculador.calcularMitjana(notes, NUM_NOTES);
        }
        String text = PrepararSortida(resultat);
        ImprimirResultat(resultat, text, opcio);
    }

    // Param. entr: El parametro de entarda es el double valor que n0os da el valor
    // que emeos escogido del array en el menu.
    // Param. sort: El parametro de salida es el string que es el que hace que nos
    // devuelva el etxto de la nota que queremos en formato texto en vez de formato
    // nuemro
    // FUNCIÓ: llamamos a la funcion de otro archivo para poder hacer de traductor y
    // cambair el numeor de la nota a texto.
    private String PrepararSortida(double valor) {
        return transformar.notaAText(valor);
    }

    // Param. entr: NO HECHO
    // Param. sort: NO HECHO
    // FUNCIÓ: NO HECHO
    private boolean MirarSiAlgu8() {
    }

    // Param. entr:jojo en este tenemos 3 diferente (lo que no tenemos en otros los
    // tenemos aqui tu) de parametros de entrada tenemo el double valor nota que es
    // el que nos diec el valor de la nota, luego tenemos string text que es el que
    // nos dice al nota tarducida a texto, y luego esta el string opcio que es con
    // el que sabemos que ha elejido el usuario si max min o mitja. (3x1 ni en los
    // supermercados)
    // Param. sort: y aqui no tenemos ni uno esta el void pero al ser private esta
    // vacio y no nos devuelve nada.
    // FUNCIÓ: pues en esta lo que ahcemos es imprimir el resultado de la opcion que
    // hemos elejido
    private void ImprimirResultat(double valornota, String text, String opcio) {
        String opcioescollida = "";
        if (opcio.equalsIgnoreCase("MAX")) {
            opcioescollida = "màxim";
        } else if (opcio.equalsIgnoreCase("MIN")) {
            opcioescollida = "mínim";
        } else {
            opcioescollida = "mitjà";
        }
        System.out.print("El valor " + opcioescollida + " de l'array que has escrit és " + valornota);
        System.out.println(" que equival a un " + text + ".\n");
    }
}
