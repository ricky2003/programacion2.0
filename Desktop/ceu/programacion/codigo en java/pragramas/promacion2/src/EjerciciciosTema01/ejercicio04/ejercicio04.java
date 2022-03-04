package EjerciciciosTema01.ejercicio04;

import java.util.ArrayList;
import java.util.List;
import utilidades.utilidades;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio04 {

    public static void main(String[] args) {

        List<Double> t = new ArrayList<>();
        int[] ArrayList = null;
        for (int i = 0; i <= 100; i++) {

            ArrayList[i] = utilidades.leeEntero("introduce  numero en posicion " + i + " del array: ");
            if (ArrayList[i] <= 0) {
                double max = 0;
                for (int j = 0; j < t.size(); j++) {
                    if (t.get(j) > max) {
                        max = t.get(j);
                    }
                }
                double min = max;
                for (int k = 0; k < t.size(); k++) {
                    if (t.get(k) < min) {
                        min = t.get(k);
                    }
                }
                System.out.println("Máximo: " + max);
                System.out.println("Mínimo: " + min);

            } else {

            }
        }

    }

}
