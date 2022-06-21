package Colecciones;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Equlasmain {

    public static void main(String[] args) {
        Persona p1 = new Persona(18, 1, "juan");
        Persona p2 = new Persona(18, 2, "juan");
        Persona p3 = new Persona(33, 1, "pedro");
        Persona p4 = new Persona(22, 1, "juan");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));

    }

}
