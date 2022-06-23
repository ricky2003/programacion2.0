package EjemploArboles;

import java.util.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class main {

    public static void main(String[] args) {
        Set<Nombre> setOrdenNatural = new TreeSet();
        setOrdenNatural.add(new Nombre("Ricardo", "Carmen", 18));
        setOrdenNatural.add(new Nombre("Jesus", "Paula", 22));
        setOrdenNatural.add(new Nombre("Jesus", "Loreto", 50));

        Iterator<Nombre> it = setOrdenNatural.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        /*// esto que esta debajo no entoncedo lo que esta mal hecho;
        Set<Nombre> setOrdenMedianteComparador = new TreeSet<Nombre>( new ComparadorOrdenPorApellido());
        setOrdenMedianteComparador.addAll(setOrdenNatural);
         System.out.println("Ordenados por apellidos");
         for (Nombre elemento : setOrdenMedianteComparador) {
            System.out.println(elemento);
        }*/

    }

}
