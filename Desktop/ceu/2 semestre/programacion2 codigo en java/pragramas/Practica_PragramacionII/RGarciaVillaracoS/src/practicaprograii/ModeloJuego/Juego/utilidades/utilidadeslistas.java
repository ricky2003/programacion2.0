package practicaprograii.ModeloJuego.Juego.utilidades;

import java.util.ArrayList;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class utilidadeslistas {

    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList();
        //lo siguiente te dice el que hay dntro del array list
        System.out.println("el contenido de la cadena es : " + cadena.size());
        //lo siguiente te pone contenido
        cadena.add("mi nuevo elemento ");
        System.out.println("el contenido de la cadena es : " + cadena.size());
        System.out.println(" la cadena es : " + cadena);
        cadena.add(0, "mi nuevo elemento ");
        System.out.println("el contenido de la cadena es : " + cadena.size());
        System.out.println(" la cadena es : " + cadena);
        cadena.remove(0);
        System.out.println("el contenido de la cadena es : " + cadena.size());
        System.out.println(" la cadena es : " + cadena);
        cadena.remove("mi nuevo elemento");
        System.out.println("el contenido de la cadena es : " + cadena.size());
        System.out.println(" la cadena es : " + cadena);
        cadena.add("uno");
        cadena.add("dos");
        cadena.add("tres");
        cadena.add("cuatro");
        cadena.add("cinco");
        cadena.add("seis");
        cadena.add("siete");
        System.out.println("el contenido de la cadena es : " + cadena.size());
        System.out.println(" la cadena es : " + cadena);
        System.out.println("el elemento en la posicion 3 es:" + cadena.get(3));
        //para r5eccorrer las listas
        for (int i = 0; i <= cadena.size(); i++) {
            System.out.println("el elemento en la posicion " + i + " es:" + cadena.get(i));
        }
        for (String cadena2 : cadena) {
            System.out.println("los elementos de la cadena es :" + cadena);
        }

    }

}
