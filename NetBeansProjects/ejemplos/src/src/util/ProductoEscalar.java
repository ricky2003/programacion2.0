package src.util;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ProductoEscalar {

    public static int productoEscalar() {
        int Ux = 0, Uy = 0, Uz = 0;
        int Vx = 0, Vy = 0, Vz = 0;

        System.out.println("escribe Ux");
        Ux = src.util.LeerNumeroPorTeclado1.leerNumero();
        System.out.println("escribe Uy");
        Uy = src.util.LeerNumeroPorTeclado1.leerNumero();
        System.out.println("escribe Uz");
        Uz = src.util.LeerNumeroPorTeclado1.leerNumero();
        System.out.println("\n");

        System.out.println("escribe Vx");
        Vx = src.util.LeerNumeroPorTeclado1.leerNumero();
        System.out.println("escribe Vy");
        Vy = src.util.LeerNumeroPorTeclado1.leerNumero();
        System.out.println("escribe Vz");
        Vz = src.util.LeerNumeroPorTeclado1.leerNumero();
        System.out.println("\n");

        int productoEscalar = Vx * Ux + Vy * Uy + Vz * Uz;
        System.out.println("el producto escalar es : " + productoEscalar);
        return productoEscalar;
    }
}
