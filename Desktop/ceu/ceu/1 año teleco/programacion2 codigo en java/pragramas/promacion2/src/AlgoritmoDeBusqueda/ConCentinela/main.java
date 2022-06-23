package AlgoritmoDeBusqueda.ConCentinela;

import static AlgoritmoDeBusqueda.SinCentinela.algoritmo.TAM;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class main {

    /*
    buscar las ;osicion de arrayen donde esta el dato que quieres buscar.
    busqueda con centinela
    lo primero que hay qie hacer seria ver que el ultimo elemtento del array sea igual al elemneto buscado
    y si es asi dar el valor de la posicion

    lo segundo es ue si no esta en el array pondras el numero buscado en la ultima posicio del array
    tra esto recorrer el array y ver si ese numero no esta en ese arraya y si esta dar la posicion
     */
    public static int BusquedaSecuencial(int[] ConjuntoBusqueda, int dato) {
        int i = 0;
        if (ConjuntoBusqueda[ConjuntoBusqueda.length - 1] == dato) {
            i = ConjuntoBusqueda.length - 1;

        } else {
            ConjuntoBusqueda[ConjuntoBusqueda.length - 1] = dato;

            while (ConjuntoBusqueda[i] != dato) {
                i++;
            }

            if (i == ConjuntoBusqueda.length - 1) {
                i = 17;//hacemos este if para decri que en el caso de que no este el dato en el array orioginal
                //la funcion devolvera este if para decirte que no estaba en el array.

            }
        }
        return i;
    }

    public static void main(String[] args) {
        int posicion, dato = 0;
        int[] ConjuntoBusqueda = new int[TAM];

        for (int i = 0; i < ConjuntoBusqueda.length; i++) {
            dato = (int) (Math.random() * 10) + 1;

            ConjuntoBusqueda[i] = dato;
            System.out.println(dato);

        }

        int dato2 = (int) (Math.random() * 10) + 1;
        posicion = BusquedaSecuencial(ConjuntoBusqueda, dato2);

        if (posicion != 17) {
            System.out.println("Posicion = " + posicion);
            System.out.println("el elemento es= " + dato2);
        } else {
            System.out.println("Elelemento no esta en el array");
            System.out.println("el elemento es= " + dato2);
        }

    }
}
