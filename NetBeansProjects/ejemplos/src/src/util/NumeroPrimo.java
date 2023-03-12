package src.util;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class NumeroPrimo {

    public static boolean esPrimo(int numero) {
        boolean primo = true;
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;//aqui lo que te dice la cantidad de divisores tiene
            }
        }
        if (contador == 2) {
            primo = true;
            System.out.println(numero);

        } else {
            primo = false;
        }
        return primo;
    }
}
