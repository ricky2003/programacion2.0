package src.util;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Divisores {

    public static void Divisores(int numero) {
        int divisor = 2;
        System.out.println("sus factores comunes son");
        while (numero != 1) {
            if (numero % divisor == 0) {
                System.out.print(divisor + " ");
                numero = numero / divisor;
            } else {
                divisor++;
            }
        }
        System.out.println("\n");
    }
}
