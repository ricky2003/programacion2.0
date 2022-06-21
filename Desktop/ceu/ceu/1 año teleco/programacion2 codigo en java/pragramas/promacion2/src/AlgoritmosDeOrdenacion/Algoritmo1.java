package AlgoritmosDeOrdenacion;

import java.util.Random;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Algoritmo1 {

    private static int TAM = 10;

    public static int sequencial(int[] ConjuntoDeBusqueda, int dato) {
        int i = 0;
        while ((ConjuntoDeBusqueda[i] != dato) && (i < TAM)) {
            i++;
        }
        return i;

    }

    public static int[] GenerarNumerosAleatorios() {
        int[] numeros = new int[TAM];
        int aleatorio = (int) (Math.random() * TAM) + 1;
        for (int i = 0; i < 9; i++) {
            numeros[i] = aleatorio;
        }
        return numeros;

    }

    public static void main(String[] args) {
        int pos, dato;
        Random ran = new Random(TAM);
        dato = (int) (Math.random());
        int[] ConjuntoDeBusqueda = GenerarNumerosAleatorios();
        pos = sequencial(ConjuntoDeBusqueda, dato);
        if (ConjuntoDeBusqueda[pos] == dato) {
            System.out.println("Posicion del dato= " + pos);
        } else {
            System.out.println("Elemento no esta en el array");
        }
    }
}
