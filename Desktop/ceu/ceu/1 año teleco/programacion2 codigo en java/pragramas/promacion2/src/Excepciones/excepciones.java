package Excepciones;

import java.io.IOException;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class excepciones {

    public static void main(String[] args) throws IOException {
        try {

            int x;
            x = 3;
            int y;
            y = 2;
            int s;
            s = x / y;
            System.out.println("resultado " + s);
            throw new Exception("lanzando excepcion");
        } catch (ArithmeticException ex) {
            System.out.println("ha habido algun problema aritmetico");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("ha habido algun problema");
            ex.printStackTrace();
        }

    }

}
