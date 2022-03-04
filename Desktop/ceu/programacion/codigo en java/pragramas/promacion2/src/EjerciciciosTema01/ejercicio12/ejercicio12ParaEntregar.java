package EjerciciciosTema01.ejercicio12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio12ParaEntregar {

    public static String cantidadvocales(String palabra) {
        try {

            System.out.println("Escribe una cadena de texto :");

            int contador_vocales = 0;
            int contador_consonantes = 0;
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
        } catch (IOException ex) {
            System.out.println("Se ha producido un error" + ex);
        }
        return palabra;
    }

    ;

    public static void main(String[] args) throws IOException {
        String palabra = "";
        ejercicio12ParaEntregar.cantidadvocales(palabra);

    }

}
