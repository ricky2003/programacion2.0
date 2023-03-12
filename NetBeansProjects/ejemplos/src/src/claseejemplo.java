package src;




import java.io.*;
import java.util.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class claseejemplo {

    public static void main(String[] args) {

        try {
            //parea escribir en consola

            System.out.println("hola mundo hoy es :\n");
            System.out.println(new Date());
            // para leer de consola haces dos cosas
            //primera es crear lo siguiente
            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            //segundo se podra hacer siempre
            String stringleido = consola.readLine();
            System.out.println("el estring es :" + stringleido + "\n");

            String stringleido2 = consola.readLine();
            int entero = Integer.parseInt(stringleido2);
            System.out.println("el entero es: " + entero + "\n");

            String stringleido3 = consola.readLine();
            double doble = Double.parseDouble(stringleido3);
            System.out.println("el numero double es :" + doble + "\n");

            String stringleido4 = consola.readLine();
            float numerof = Float.parseFloat(stringleido4);
            System.out.println("el numero float:" + numerof + "\n");

        } catch (IOException ex) {
            System.out.println("fallo en el sistema");
        }

    }

}
