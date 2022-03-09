package ExámenConocimientosPrevios.Ejercicio05;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
import EjerciciciosTema01.ejercicio06.utilidades;

public class ejercicio05 {

    /**
     *
     * @param numero numero que dice si es o no primo
     * @return truen si es verdadero si no es false
     */
    public static boolean esPrimo(int numero) {
        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;

            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }

    ;

    public static void main(String[] args) {
        int numero = utilidades.leeEntero("introduce un numero: ");
        System.out.println("El numero es :" + numero);
        System.out.println("El numero es primo :" + esPrimo(numero));

    }

}
