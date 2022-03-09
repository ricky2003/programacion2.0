package EjerciciciosTema01.ejercicio04;

import java.util.ArrayList;
import EjerciciciosTema01.ejercicio06.utilidades;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio04 {

    public static void main(String[] args) {
        int maximo = 0;
        int minimo = 0;
        int numero = 0;
        ArrayList<Integer> cadenaEnteros = new ArrayList();
        utilidades.leeEntero("escribe un numero= ");
        while (cadenaEnteros.get(numero) < 0) {
            utilidades.leeEntero("escribe un numero= ");
            cadenaEnteros.add(numero);

        }
        for (numero = 0; numero < cadenaEnteros.size(); numero++) {
            if (cadenaEnteros.get(numero) < minimo) {
                minimo = cadenaEnteros.get(numero);
            }
        }
        for (numero = 0; numero < cadenaEnteros.size(); numero++) {
            if (cadenaEnteros.get(numero) > maximo) {
                maximo = cadenaEnteros.get(numero);
            }
        }

        System.out.println("el máximo de la lista es : " + maximo);
        System.out.println("el mínimo de la lista es : " + minimo);

    }

}
