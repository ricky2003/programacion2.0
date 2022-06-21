package AlgoritmosDeOrdenacion;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class MetodoDeInserccion {

    private static int TAM = 100;

    private static void insercion(int[] datos) {
        int i, temp;
        for (int elementoQueInsertas = 1; elementoQueInsertas < TAM; elementoQueInsertas++) {
            temp = datos[elementoQueInsertas];
            int dondeInsertar = 0;
            while (datos[dondeInsertar] < temp) {
                dondeInsertar++;
            }
            if (dondeInsertar < elementoQueInsertas) {//Podría estar ya ordenado y no tener que moverles
                for (i = elementoQueInsertas; i > dondeInsertar; i--) {//Desde el elemento hasta la posición voy moviendo a la dch
                    datos[i] = datos[i - 1];
                }
                datos[dondeInsertar] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[TAM];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        System.out.println("Antes de ordenar: " + numeros);

        insercion(numeros);
        System.out.println("Despues de ordenar: " + numeros);

    }
}
