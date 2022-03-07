package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ricardogarciavillaraco
 */
public class utilidades {

    public static String LeeCadena(String Pregunta) {
        System.out.println(Pregunta);
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        String name;//ponerlo siempre fuera de el try-catch
        try {
            name = consola.readLine();//es el scanf de c

        } catch (IOException ex) {
            name = "pepito grillo";
        }

        return name;

    }

    /**
     * esta funcion lee un entero por consola
     *
     * @param Pregunta la pregunta ha realizar el usuario
     * @return entero leido o 0 si hubo error
     */
    public static int leeEntero(String Pregunta) {
        String CadenaNumero = LeeCadena(Pregunta);
        int elNumero;
        try {
            elNumero = Integer.parseInt(CadenaNumero);
        } catch (NumberFormatException nfe) {
            elNumero = 0;
        }
        return elNumero;

    }

    public static double leeDouble(String Pregunta) {
        String CadenaNumero = LeeCadena(Pregunta);
        double elNumero;
        try {
            elNumero = Double.parseDouble(CadenaNumero);
        } catch (NumberFormatException nfe) {
            elNumero = 0;
        }
        return elNumero;

    }

}
