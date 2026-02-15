package AEA3.Ejercicio6;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Angel david", "Madrird", 2000);
        Manager manager = new Manager("Juan carlos", "Jerez", 3000, 5);
        Developer developer = new Developer("Hector magana", "Villanueva del rey", 2500, "Java");

        programmer.debug();
        manager.gestionProyecto();
        developer.escribirCodigo();

        System.out.println();
        System.out.println(programmer.generarReport());
        System.out.println(manager.generarReport());
        System.out.println(developer.generarReport());
    }
}