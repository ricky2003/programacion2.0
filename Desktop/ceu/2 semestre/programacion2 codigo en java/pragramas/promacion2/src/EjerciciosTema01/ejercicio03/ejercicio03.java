package EjerciciosTema01.ejercicio03;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio03 {

    public static void main(String[] args) {
        int suma = 0;
        int numero = 0;
        int cantidad_numeros = 0;
        for (int i = 0; i <= numero; i++) {
            numero = 5 + numero;
            suma = suma + numero;
            cantidad_numeros++;
            if (numero <= 100) {
                System.out.println("la suma es = " + suma);
                System.out.println("la cantidad de mumero son = " + cantidad_numeros);
                System.out.println("el numero es : " + numero);
                System.out.println("\n");

            }
            if (numero >= 100) {
                break;
            }

        }

    }
}
