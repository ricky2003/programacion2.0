package EjerciciciosTema01.ejercicio11;

/**
 * me faltarioa solo que el usuar5io da los numeros de los tama;os y el interior
 * de las matrices
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio11 {

    public static void main(String[] args) {
        int[][] matrizA = {
            {3, 2, 1},
            {1, 1, 3},
            {0, 2, 1},};
        int[][] matrizB = {
            {2, 1},
            {1, 0},
            {3, 2},};

        //Lugar en donde se almacena el resultado
        int[][] producto = new int[matrizB.length][matrizB[0].length];

        // Necesitamos hacer esto por cada columna de la segunda matriz (B)
        for (int a = 0; a < matrizB[0].length; a++) {
            // Dentro recorremos las filas de la primera (A)
            for (int i = 0; i < matrizA.length; i++) {
                int suma = 0;
                // Y cada columna de la primera (A)
                for (int j = 0; j < matrizA[0].length; j++) {
                    // Multiplicamos y sumamos resultado
                    suma += matrizA[i][j] * matrizB[j][a];
                }
                // Lo acomodamos dentro del producto
                producto[i][a] = suma;
            }
        }

        // Recorrer producto
        System.out.print("Imprimiendo producto\n");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.printf("%d ", producto[i][j]);
            }
            System.out.print("\n");
        }
    }

}
