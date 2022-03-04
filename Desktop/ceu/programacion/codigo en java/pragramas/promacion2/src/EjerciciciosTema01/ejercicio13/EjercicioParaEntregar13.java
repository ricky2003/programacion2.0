package EjerciciciosTema01.ejercicio13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class EjercicioParaEntregar13 {

    public static String invertirpalabra(String palabra) {
        try {
            System.out.println("Escribe una cadena de texto :");

            String palabra_invertida = "";

            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            palabra = consola.readLine();

            // Recorremos la cadena original del final al inicio
            for (int i = palabra.length() - 1; i >= 0; i--) {
                //el operador += sirve para concatenar cadenas
                palabra_invertida += palabra.charAt(i);
            }
            System.out.println("la cadena al derecho es : " + palabra);
            System.out.println("la cadena al reves es: " + palabra_invertida);

        } catch (IOException ex) {
            System.out.println("Se ha producido un error" + ex);
        }
        return palabra;
    }

    ;

    public static void main(String[] args) {
        String palabra = "";
        EjercicioParaEntregar13.invertirpalabra(palabra);

    }

}
