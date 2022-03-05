package EjerciciciosTema01.ejercicio12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio12ParaEntregar {

    public static String LeeUnString(String palabra) {

        try {
            int contador_vocales = 0;
            int contador_consonantes = 0;

            System.out.println("Escribe una cadena de texto :");

            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            palabra = consola.readLine();
            System.out.println("La cadena de texto leida es:" + palabra);

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

        } catch (IOException ex) {
            System.out.println("ha habido un error");
        }
        return palabra;
    }

    ;

    public static void main(String[] args) {
        String palabra = "";
        ejercicio12ParaEntregar.LeeUnString(palabra);

    }

}
