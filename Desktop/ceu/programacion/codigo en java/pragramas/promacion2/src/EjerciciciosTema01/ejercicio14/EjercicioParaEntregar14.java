package EjerciciciosTema01.ejercicio14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class EjercicioParaEntregar14 {

    public static String Palindomas(String palabra) {
        try {
            System.out.println("Escribe una cadena de texto :");

            String palabra_invertida = "";

            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            palabra = consola.readLine();

            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabra_invertida += palabra.charAt(i);
            }
            if (palabra_invertida.equals(palabra)) {
                System.out.println("la palabra es palindroma");
            } else {
                System.out.println("la palabra no es palindroma");
            }

        } catch (IOException ex) {
            System.out.println("Se ha producido un error" + ex);
        }
        return palabra;
    }

    ;

    public static void main(String[] args) {
        String palabra = "";

        EjercicioParaEntregar14.Palindomas(palabra);
    }
}
