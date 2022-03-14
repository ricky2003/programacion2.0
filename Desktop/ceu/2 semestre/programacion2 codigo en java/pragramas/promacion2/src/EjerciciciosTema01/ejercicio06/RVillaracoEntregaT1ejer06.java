package EjerciciciosTema01.ejercicio06;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class RVillaracoEntregaT1ejer06 {

    /**
     *
     * @param primos
     * @return
     */
    public static String Primos(String primos) {
        int i = 0;
        int num = 0;
        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primos = primos + i + "\n";

            }
        }
        return primos;

    }

    ;

    public static void main(String[] args) {

        String primos = "";

        System.out.println("" + RVillaracoEntregaT1ejer06.Primos(primos));

    }
}
