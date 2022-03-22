package EjerciciosTema03.ejercicio03.CalculadoraRacionales;

import EjerciciosTema03.ejercicio03.NumeroRacional.NumeroRacional;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Main {

    public static void main(String[] args) {
        try {
            NumeroRacional f1 = new NumeroRacional(124, 24);
            NumeroRacional f2 = new NumeroRacional(15, 3);
            System.out.println("el resultado de la suma de" + f1 + " + " + f2 + " es : " + f1.suma(f2));
            System.out.println("el resultado de la multiplicacion de" + f1 + " " + f2 + " es : " + f1.mult(f2));
            System.out.println("el resultado de la simplificacion  de " + f2 + " fraciones es : " + f2.simplificar(f2));
            System.out.println("el resultado de la simplificacion  de " + f1 + " fraciones es : " + f1.simplificar(f1));
        } catch (Exception ex) {
            System.out.println("ha habido un fallo");
        }

    }

}
