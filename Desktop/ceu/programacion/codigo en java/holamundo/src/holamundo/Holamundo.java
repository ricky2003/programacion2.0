package holamundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ricardogarciavillaraco
 */
public class Holamundo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("introduce tu nombre");
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        String name;//ponerlo simprefuera de el try-catch
        try {
            name = consola.readLine();

        } catch (IOException ex) {
            name = "pepito grillo";
        }
        System.out.println("el nombre ha sido: " + name);

    }

}
