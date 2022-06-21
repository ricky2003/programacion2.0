package ExámenConocimientosPrevios.Ejercicio04;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio04 {

    public static void main(String[] args) {
        int numero = 0;
        int suma_pares = 0;
        while (suma_pares < 100) {
            if (numero % 2 == 0) {
                suma_pares = suma_pares + numero;
            }
            numero++;
        }

        System.out.println("La suma de los pares hasta llegar a el 100 es: " + suma_pares);
    }

}
