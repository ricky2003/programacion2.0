package EjerciciciosTema01.ejercicio04;

/**
 * solo falta que los datos los de le usuario
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio04 {

    public static void main(String[] ARGS) {
        int[] myList = {5, 4, 8, 6, 3, 2, 9};

        int i, max, min;

        min = max = myList[0];

        for (i = 0; i < myList.length; i++) {
            if (min > myList[i]) {
                min = myList[i];
            }
            if (max < myList[i]) {
                max = myList[i];
            }
        }

        System.out.println("El máximo es " + max + " y el minimo es " + min);
    }

}
