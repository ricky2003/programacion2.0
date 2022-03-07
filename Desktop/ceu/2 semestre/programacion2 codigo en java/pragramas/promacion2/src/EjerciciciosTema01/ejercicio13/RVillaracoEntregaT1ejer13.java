package EjerciciciosTema01.ejercicio13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class RVillaracoEntregaT1ejer13 {

    public static String invertirpalabra(String palabra, String palabra_invertida) {

        // Recorremos la cadena original del final al inicio
        for (int i = palabra.length() - 1; i >= 0; i--) {
            //el operador += sirve para concatenar cadenas
            palabra_invertida += palabra.charAt(i);
        }
        System.out.println("la cadena al derecho es : " + palabra);
        System.out.println("la cadena al reves es: " + palabra_invertida);

        return palabra;
    }

    ;

    public static void main(String[] args) {
        String palabra = "";
        String palabra_invertida = "";
        try {
            System.out.println("la palabra es : ");
            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            palabra = consola.readLine();
            RVillaracoEntregaT1ejer13.invertirpalabra(palabra, palabra_invertida);
        } catch (IOException ex) {
            Logger.getLogger(RVillaracoEntregaT1ejer13.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
