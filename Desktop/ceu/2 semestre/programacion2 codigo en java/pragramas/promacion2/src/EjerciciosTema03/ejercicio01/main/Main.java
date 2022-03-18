package EjerciciosTema03.ejercicio01.main;

import EjerciciosTema03.ejercicio01.punto.Punto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Main {

    public static void main(String[] args) {
        double x = utilidades.utilidades.leeDouble("escribe un numero para la cordenada x");
        double y = utilidades.utilidades.leeDouble("escribe un numero para la cordenada y");
        double z = utilidades.utilidades.leeDouble("escribe un numero para la cordenada z");
        // se hace con nada dentro para mostrar ek que es por defecto
        Punto punto0 = new Punto();
        Punto punto1 = new Punto(x, y, z);
        Punto punto2 = new Punto(12, 13, 18);
        Punto punto3 = new Punto(8, 14, 0);
        System.out.println(punto0);
        System.out.println(punto1);
        System.out.println(punto2);
        System.out.println(punto3);
    }
}
