package EjerciciciosTema01.ejercicio14;

import EjerciciciosTema01.utilidades;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class RVillaracoEntregaT1ejer14 {

    //esto esta bien
    public static boolean esPalindomas(String palabra) {
        palabra = utilidades.LeeCadena("escribe una palbra");
        String palabra_invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabra_invertida += palabra.charAt(i);
        }
        if (palabra_invertida.equals(palabra)) {
            return true;
        } else {
            return false;
        }

    }

    ;

    public static void main(String[] args) {
        String palabra = "";

        if (RVillaracoEntregaT1ejer14.esPalindomas(palabra) == true) {

            System.out.println("la palabra es palindroma");
        } else {
            System.out.println("la palabra no es palindroma");
        }

    }
}
