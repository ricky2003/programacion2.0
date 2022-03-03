package EjerciciciosTema01.ejercicio06;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicioparaentregar06 {

    public static void main(String[] args) {
        boolean numero;
        System.out.println("Son números primos del 1 al 100:\n");
        //estructura para saber si es primo o no
        for (int esPrimo = 2; esPrimo <= 100; esPrimo++) {
            numero = true;
            for (int j = 2; j > 1; j--) {
                //si si es primo es divisible entre 2 este no se te pondra en la pantalla
                if (esPrimo % j == 0) {
                    numero = false;
                    break;
                }
            }
            //este bucle te ense;a todos los primos del 1 al 100
            if (numero == true) {
                System.out.println("el numero " + esPrimo + " es primo");
            }
        }

    }

}
