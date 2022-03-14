package EjerciciciosTema01.ejercicio07;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio07 {

    public static int factoreprimos(int factoresprimos) {
        int n = utilidades.utilidades.leeEntero("esctribe un numero");
        System.out.print(n + ":");
        while (n != 1) {
            if (n % factoresprimos == 0) {

                n = n / factoresprimos;
                System.out.println(+factoresprimos + "");

            } else {
                factoresprimos++;
            }
        }

        return factoresprimos;
    }

    public static void main(String[] args) {
        int factoresprimos = 2;
        int n = 0;
        ejercicio07.factoreprimos(factoresprimos);

    }

}
