package src.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class LeerNumeroPorTeclado1 {

    public static int leerNumero() {
        int numero = 0;
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        try {
            String stringleido = consola.readLine();
            numero = Integer.parseInt(stringleido);

        } catch (IOException ex) {
            System.out.println("fallo en alguna parte del programa");
        }
        return numero;
    }

    public static double leerDouble() {
        double numero = 0.0;
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        try {
            String stringleido = consola.readLine();
            numero = Double.parseDouble(stringleido);

        } catch (IOException ex) {
            System.out.println("fallo en alguna parte del programa");
        }
        return numero;
    }

    public static Boolean leerBool() {
        boolean numero = true;
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        try {
            String stringleido = consola.readLine();
            numero = Boolean.parseBoolean(stringleido);

        } catch (IOException ex) {
            System.out.println("fallo en alguna parte del programa");
        }
        return numero;
    }

    public static float leerfloat() {
        float numeroreal = 0;
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

        try {
            String stringleido = consola.readLine();
            numeroreal = Float.parseFloat(stringleido);

        } catch (IOException ex) {
            System.out.println("fallo en alguna parte del programa");
        }
        return numeroreal;
    }

    public static String leerString(String mensaje) {
        String palabra = " ";
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(mensaje + ": ");
        try {
            palabra = consola.readLine();
        } catch (IOException ex) {
            System.out.println("fallo en alguna parte del programa");
        }
        return palabra;
    }

}
