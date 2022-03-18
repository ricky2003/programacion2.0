package EjerciciciosTema01.ejercicio11;

import java.util.Arrays;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio11 {

    static void inicializarMatriz1(int[][] matriz1) {
        int i1 = 0;
        i1 = utilidades.utilidades.leeEntero("escribe la dimesion i de la atriz");
        int j1 = 0;
        j1 = utilidades.utilidades.leeEntero("escribe la dimension j de la matriz");

        for (int i = 0; i <= i1; i++) {
            for (int j = 0; j <= j1; j++) {
                matriz1[i1][j1] = utilidades.utilidades.leeEntero("escribe un numero");
            }
        }

    }

    static void inicializarMatriz2(int[][] matriz2) {
        int i2 = 0;
        i2 = utilidades.utilidades.leeEntero("escribe la dimesion i de la atriz");
        int j2 = 0;
        j2 = utilidades.utilidades.leeEntero("escribe la dimension j de la matriz");
        for (int i = 0; i <= i2; i++) {
            for (int j = 0; j <= j2; j++) {
                matriz2[i2][j2] = utilidades.utilidades.leeEntero("escribe un numero");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz1 = null;
        int[][] matriz2 = null;

        ejercicio11.inicializarMatriz1(matriz1);
        ejercicio11.inicializarMatriz2(matriz2);
        System.out.println("la matriz 2 es : " + Arrays.toString(matriz1));
        System.out.println("la matriz 2 es : " + Arrays.toString(matriz2));
    }
}
