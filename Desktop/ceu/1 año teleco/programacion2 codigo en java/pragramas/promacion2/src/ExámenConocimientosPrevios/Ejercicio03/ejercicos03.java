package ExámenConocimientosPrevios.Ejercicio03;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicos03 {

    public static void main(String[] args) {
        int numero = 0;
        int pares = 0;
        int impares = 0;
        while (numero < 100) {
            if (numero % 2 == 0) {
                pares = pares + numero;

            } else {
                impares = impares + numero;

            }
            numero++;
        }
        System.out.println("La suma de los numero pares es : " + pares);
        System.out.println("La suma de los numero impares es : " + impares);
    }

}
