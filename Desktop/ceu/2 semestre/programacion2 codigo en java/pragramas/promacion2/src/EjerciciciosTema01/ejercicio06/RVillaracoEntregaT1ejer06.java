package EjerciciciosTema01.ejercicio06;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class RVillaracoEntregaT1ejer06 {

    public static int esPrimo(int Primo) {
        boolean numero = true;

        for (int j = 2; j > 1; j--) {
            //si si es primo es divisible entre 2 este no se te pondra en la pantalla
            if (Primo % j == 0) {

                numero = false;
                break;
            }
        }

        return Primo;
    }

    ;

    public static boolean cienPrimos(boolean numero) {
        int Primo = 0;

        //estructura para saber si es primo o no
        for (Primo = 2; Primo <= 100; Primo++) {

            numero = true;

            for (int j = 2; j > 1; j--) {

                //si si es primo es divisible entre 2 este no se te pondra en la pantalla
                if (Primo % j == 0) {

                    numero = false;
                    break;
                }
            }

            //este bucle te ense;a todos los primos del 1 al 100
            if (numero == true) {

                System.out.println("" + Primo);
            }

        }

        return numero;
    }

    ;

    public static void main(String[] args) {

        boolean numero = true;

        System.out.println("los primos del 1 al 100:\n");

        RVillaracoEntregaT1ejer06.cienPrimos(numero);

    }

}
