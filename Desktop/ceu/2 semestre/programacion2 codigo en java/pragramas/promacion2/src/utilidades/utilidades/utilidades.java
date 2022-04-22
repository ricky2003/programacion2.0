package practicaprograii.ModeloJuego.Juego.utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ricardogarciavillaraco
 */
public class utilidades {

    /**
     * lee una cadena de strings
     *
     * @param Pregunta
     * @return
     */
    public static String LeeCadena(String Pregunta) {
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Pregunta);

        String cadena;//ponerlo siempre fuera de el try-catch
        try {
            cadena = consola.readLine();//es el scanf de c

        } catch (IOException ex) {
            cadena = "";
        }

        return cadena;

    }

    ;

    /**
     * esta funcion lee un entero por consola
     *
     * @param Pregunta la pregunta ha realizar el usuario
     * @return entero leido o 0 si hubo error
     */
    public static int LeeEntero(String Pregunta) {
        String CadenaNumero = LeeCadena(Pregunta);
        int elNumero = 0;
        boolean incorrecto = true;
        while (incorrecto) {
            try {
                elNumero = Integer.parseInt(CadenaNumero);
                incorrecto = false;
            } catch (NumberFormatException nfe) {
                elNumero = 0;

            }
        }
        return elNumero;

    }

    ;
    /**
     * lee un doble del la pregunta
     * @param Pregunta
     * @return
     */

    public static double LeeDouble(String Pregunta) {
        String CadenaNumero = LeeCadena(Pregunta);
        double elNumero = 0;
        boolean incorrecto = true;
        while (incorrecto) {
            try {
                elNumero = Double.parseDouble(CadenaNumero);
                incorrecto = false;
            } catch (NumberFormatException nfe) {
                elNumero = 0;
            }
        }
        return elNumero;

    }

;

}
