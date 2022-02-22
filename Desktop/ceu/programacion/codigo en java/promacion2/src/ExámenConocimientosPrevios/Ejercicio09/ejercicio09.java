package ExámenConocimientosPrevios.Ejercicio09;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio09 {

    public static void main(String[] args) {
        char[][] C = new char[10][5];

        for (int i = 0; i < 10; i++) {
            C[i] = 'z';
            System.out.println("esto es lo que aparecera en la priemro fila: " + C[i]);
            for (int j = 0; j < 10; j++) {
                C[j] = 'z';
                System.out.println("esto es lo que aparecera en la priemro fila: " + C[j]);
            }

        }
    }

}
