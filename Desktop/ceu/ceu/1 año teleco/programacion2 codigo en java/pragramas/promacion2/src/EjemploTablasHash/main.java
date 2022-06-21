package EjemploTablasHash;

import java.util.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class main {

    public static void main(String[] args) {
        Set<Ejemplo> set = new HashSet();
        Ejemplo e = new Ejemplo(33);
        set.add(new Ejemplo(25));
        set.add(new Ejemplo(7));
        set.add(new Ejemplo(72));

        System.out.println(set.contains(new Ejemplo(5)));

        System.out.println(set.contains(new Ejemplo(25)));
        System.out.println(e.hashCode());

    }
}
