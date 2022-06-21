package AlgoritmoDeBusquedaBinaria;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejemplo {

    static int TAM = 100;

    static int busquedaDicotomica(int[] conjuntoBusqueda, int dato) {
        int inicio = 0, fin = TAM - 1, mitad;
        mitad = (inicio + fin) / 2;
        while ((inicio <= fin) && (conjuntoBusqueda[mitad] != dato)) {
            if (dato < conjuntoBusqueda[mitad]) {
                fin = mitad - 1;
            } else {
                inicio = mitad + 1;
            }
            mitad = (inicio + fin) / 2;
        }
        if (dato == conjuntoBusqueda[mitad]) {

            return mitad;
        } else {
            return -1;
        }
    }

}
