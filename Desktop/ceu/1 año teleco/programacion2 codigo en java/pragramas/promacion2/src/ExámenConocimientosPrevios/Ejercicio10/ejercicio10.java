package ExámenConocimientosPrevios.Ejercicio10;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio10 {

    public static void main(String[] args) {
        int[] vector = new int[13];
        //no hay otra forma de inicializar un array con datos en su interior
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = -2;
        vector[3] = 1;
        vector[4] = 3;
        vector[5] = -1;
        vector[6] = 5;
        vector[7] = 10;
        vector[8] = -5;
        vector[9] = 2;
        vector[10] = 3;
        vector[11] = 3;
        vector[12] = 12;
        int i = 0;
        int var = 0;
        while (vector[i] < 10) {
            var = var + vector[i];
            System.out.println("Vector: " + vector[i]);
            i += 2;
        }
        System.out.println("El resulatdo es: " + var);
    }

}
