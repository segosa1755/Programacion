package AEA3.EJ7;

public class Main {

    public static void main(String[] args) {

        Triangle t = new Triangle(5, 4);
        Quadrat q = new Quadrat(4);
        Rectangle r = new Rectangle();
        Trapezi tr = new Trapezi(6, 4, 3);
        Rombe ro = new Rombe(5, 3);
        Parallelogram p = new Parallelogram(5, 4);
        Cercle c = new Cercle(3);

        t.mostrarArea();
        q.mostrarArea();
        r.mostrarArea();
        tr.mostrarArea();
        ro.mostrarArea();
        p.mostrarArea();
        c.mostrarArea();
    }
}