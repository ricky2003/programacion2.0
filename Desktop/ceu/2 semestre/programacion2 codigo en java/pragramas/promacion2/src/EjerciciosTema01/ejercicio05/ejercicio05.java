package EjerciciosTema01.ejercicio05;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio05 {

    public static void imprimirTabla(int numeroDeTabla) {
        for (int x = 1; x <= 10; x++) {
            String formato = "%d x %d = %d";
            String linea = String.format(formato, numeroDeTabla, x, numeroDeTabla * x);
            System.out.println(linea);
        }
    }

    public static void main(String[] args) {
        int numeroTabla = 0;

        for (int i = 0; i <= 10; i++) {
            numeroTabla = i;
            System.out.println("\n");
            System.out.println("la tabal del numero: " + i);
            imprimirTabla(numeroTabla);
        }

    }
}
