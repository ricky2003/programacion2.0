package EjerciciosTema01.ejercicio08;

import java.util.Scanner;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        int mayor = 0;
        int menor = 0;
        int media = 0;
        int suma = 0;

        int lista[] = new int[100];

        for (int i = 0; numero > 0; i++) {
            System.out.println("introduce numeros");
            numero = teclado.nextInt();
            lista[i] = numero;
            i += 1;

            for (int j = 0; j < lista.length; j++) {
                if (lista[j] > mayor) {
                    mayor = lista[j];
                }

                if (lista[j] < menor) {
                    menor = lista[j];
                }
            }

            for (int k = 0; k < lista.length; k++) {
                suma = lista[k] + suma;

            }

            if (numero == 0) {
                break;

            }
        }
        media = suma / lista.length;
        System.out.println("El numero mayor es:" + mayor);
        System.out.println("El numero menor es:" + menor);
        System.out.println("La media es:" + media);
    }

}
