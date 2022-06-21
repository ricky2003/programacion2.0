package Ejemplo_para_listas;

import java.util.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class estructuraDeDatos {

    public static void main(String[] args) {
        List<String> lista = new LinkedList();
        lista.add("Carmen");
        lista.add("Raquel");
        lista.add("juan");
        lista.add("ricardo");

        Iterator<String> iterador = lista.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());

        }
        System.out.println();
        System.out.println(lista.size());

        lista.remove("ricardo");
        lista.add("juanjo");
        System.out.println("ricardo se acaba de borrar");
        System.out.println("juanjo se acaba de añadir");

        System.out.println();

        //te dice la posicion del String que tu le pongas como argumento
        System.out.println("la posicion de Raquel es: " + Collections.binarySearch(lista, "Raquel"));

        System.out.println();

        /*ListIterator<String> it = lista.listIterator(lista.size());

        while (it.hasPrevious()) {

            System.out.println(it.previous());

        } */
        Collections.sort(lista);

        System.out.println("la lista en orden puesto arriba");

        for (String elemento : lista) {

            System.out.println(elemento);
        }
    }

}
