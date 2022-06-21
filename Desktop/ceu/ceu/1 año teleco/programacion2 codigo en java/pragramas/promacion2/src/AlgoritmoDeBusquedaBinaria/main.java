package AlgoritmoDeBusquedaBinaria;

import java.util.Arrays;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class main {

    public static void main(String[] args) {

        int posicion, dato;
        int[] conjuntoBusqueda = {1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 34, 556, 67, 78};
        dato = 5;
        System.out.println("Dato a buscar " + dato);
        Arrays.sort(conjuntoBusqueda);
        System.out.println(Arrays.toString(conjuntoBusqueda));
        posicion = ejemplo.busquedaDicotomica(conjuntoBusqueda, dato);
        if (posicion != -1) {
            System.out.println("Posicion " + posicion);
        } else {
            System.out.println("Elemento no esta en el array");
        }
    }

}
