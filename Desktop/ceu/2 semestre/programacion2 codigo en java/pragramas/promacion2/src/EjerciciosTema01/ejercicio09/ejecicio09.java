package EjerciciosTema01.ejercicio09;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejecicio09 {

    public static int prductoEscalar(int producto) {
        int x1 = utilidades.utilidades.leeEntero("escribe el vaor de la cordenada x del vector 1");
        int y1 = utilidades.utilidades.leeEntero("escribe el vaor de la cordenada y del vector 1");
        int z1 = utilidades.utilidades.leeEntero("escribe el vaor de la cordenada z del vector 1");
        int x2 = utilidades.utilidades.leeEntero("escribe el vaor de la cordenada x del vector 2");
        int y2 = utilidades.utilidades.leeEntero("escribe el vaor de la cordenada y del vector 2");
        int z2 = utilidades.utilidades.leeEntero("escribe el vaor de la cordenada z del vector 3");
        producto = x1 * x2 + y1 * y2 + z1 * z2;
        return producto;
    }

    public static void main(String[] args) {
        int producto = 0;
        producto = ejecicio09.prductoEscalar(producto);
        System.out.println("el producto escal;ra de los vectores 1 y dos es : " + producto);

    }
}
