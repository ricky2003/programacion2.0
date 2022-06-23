package AlgoritmoDeBusqueda.SinCentinela;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class algoritmo {

    public static int TAM = 10;

    private static int BusquedaSecuencial(int[] ConjuntoBusqueda, int dato) {
        int i = 0;//lo que falla es esto y no se porque ocurre
        while ((ConjuntoBusqueda[i] != dato) && (i < TAM)) {
            i++;
        }

        return i;
    }

    private static int BusquedaSecuencial2(int[] ConjuntoBusqueda, int dato) {
        int r = 1000;
        for (int i = 0; i < ConjuntoBusqueda.length; i++) {
            if (ConjuntoBusqueda[i] == dato) {
                r = i;
            }
        }

        return r;
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
        posicion = BusquedaSecuencial2(ConjuntoBusqueda, dato2);

        if (posicion != 1000) {
            System.out.println("Posicion = " + posicion);
            System.out.println("el elemento es= " + dato2);
        } else {
            System.out.println("Elelemento no esta en el array");
            System.out.println("el elemento es= " + dato2);
        }

    }

}
