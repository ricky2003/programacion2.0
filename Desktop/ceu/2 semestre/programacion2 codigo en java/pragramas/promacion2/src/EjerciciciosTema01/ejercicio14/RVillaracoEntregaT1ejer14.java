package EjerciciciosTema01.ejercicio14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class RVillaracoEntregaT1ejer14 {

    public static String Palindomas(String palabra) {

        String palabra_invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabra_invertida += palabra.charAt(i);
        }
        if (palabra_invertida.equals(palabra)) {
            System.out.println("la palabra es palindroma");
        } else {
            System.out.println("la palabra no es palindroma");
        }

        return palabra;
    }

    ;

    public static void main(String[] args) {
        String palabra = "";

        try {
            System.out.println("Escribe una cadena de texto :");
            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            palabra = consola.readLine();

            RVillaracoEntregaT1ejer14.Palindomas(palabra);
        } catch (IOException ex) {
            Logger.getLogger(RVillaracoEntregaT1ejer14.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
