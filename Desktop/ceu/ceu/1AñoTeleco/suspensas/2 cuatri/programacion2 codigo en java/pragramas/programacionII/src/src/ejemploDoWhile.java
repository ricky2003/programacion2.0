
import java.util.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejemploDoWhile {

    public static void main(String[] args) {
        Random rand = new Random();

        int i = rand.nextInt() % 100;//hacer un random de 0 a 100
        int contador = 0;

        do {
            contador++;
        } while (contador
                < 100);
        System.out.println(
                "la cantidad de veces que se repite el bucle es " + contador + "\n");
    }

}
