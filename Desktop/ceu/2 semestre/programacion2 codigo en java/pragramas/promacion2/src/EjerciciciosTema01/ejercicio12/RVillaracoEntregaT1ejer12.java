package EjerciciciosTema01.ejercicio12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class RVillaracoEntregaT1ejer12 {

    public static String LeeUnString(String palabra) {

        int contador_vocales = 0;
        int contador_consonantes = 0;

        for (int i = 0; i <= palabra.length() - 1; i++) {

            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                contador_vocales++;

            } else {
                contador_consonantes++;

            }
        }
        System.out.println("la cantida de vocales son: " + contador_vocales);
        System.out.println("la cantidad de consonantes es: " + contador_consonantes);

        return palabra;
    }

    ;

    public static void main(String[] args) {

        try {
            String palabra = "";
            System.out.println("Escribe una cadena de texto :");
            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            palabra = consola.readLine();
            RVillaracoEntregaT1ejer12.LeeUnString(palabra);
        } catch (IOException ex) {
            Logger.getLogger(RVillaracoEntregaT1ejer12.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
