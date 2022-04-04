package EjerciciciosTema01.ejercicio10;

import java.util.Random;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio10 {

    static void inicializarMatriz(int[][] matriz) {
        Random r = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(25) + 1;
                matriz[j][i] = matriz[i][j];
            }
        }
    }

    static void visualizarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numero = utilidades.utilidades.LeeEntero("escribe el tamano de la matriz cuadrada ");
        int[][] matrizNumeros = new int[numero][numero];
        inicializarMatriz(matrizNumeros);
        visualizarMatriz(matrizNumeros);
    }

}
