package Lectura_datos_por_Consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class LecturaDeDatos {

    public static void main(String[] args) {
        InputStreamReader inputSteeamReader = null;
        BufferedReader bufferedReader = null;
        try {
            inputSteeamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputSteeamReader);
            int Entero = Integer.parseInt(bufferedReader.readLine());
            double realDouble = Double.parseDouble(bufferedReader.readLine());
            boolean logico = Boolean.parseBoolean(bufferedReader.readLine());
            float real = Float.parseFloat(bufferedReader.readLine());

            System.out.println(Entero + " " + realDouble + " " + logico + " " + real);
        } catch (IOException ex) {
            System.out.println("error durante el proceso");
            ex.printStackTrace();
        } finally {
            if (inputSteeamReader != null) {
                try {
                    inputSteeamReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();

                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
