package EjerciciciosTema01.ejercicio02;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicicio02 {

    public static void main(String[] args) {
        char numero1 = 0;
        short numero2 = 0;
        int numero3 = 0;

        numero3 = Integer.MAX_VALUE;
        numero1 = (char) Integer.MAX_VALUE;
        numero2 = (short) Integer.MAX_VALUE;

        System.out.println("el mayor entero en un entero es :" + numero3);
        System.out.println("el mayor entero en un short es :" + numero2);
        System.out.println("el mayor entero en un char es :" + numero1);
    }

}
