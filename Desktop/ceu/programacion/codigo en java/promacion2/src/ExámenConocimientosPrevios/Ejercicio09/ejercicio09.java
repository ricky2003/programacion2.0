package ExámenConocimientosPrevios.Ejercicio09;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio09 {

    public static void main(String[] args) {
        char[][] C = new char[10][5];

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 5; j++) {
                C[i][j] = 'z';
                System.out.print(" " + C[i][j]);
            }

            System.out.print(" \n");
        }
    }

}
