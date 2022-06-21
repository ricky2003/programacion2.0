package EjemploMapasóDiccionario;

import java.util.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class mapa {

    public static void main(String[] args) {
        Map<Integer, String> mapaDeEnterosYStrings = new HashMap();
        mapaDeEnterosYStrings.put(11, "Once");//te añde un valor con la clave y el valor que le corresponde en el mapa
        mapaDeEnterosYStrings.put(22, "Veintidos");
        mapaDeEnterosYStrings.put(7, "Siete");

        Iterator<Integer> it = mapaDeEnterosYStrings.keySet().iterator();

        System.out.println(" " + mapaDeEnterosYStrings.containsKey(11));//te dice si contiene la clave
        System.out.println(" " + mapaDeEnterosYStrings.containsValue("Treinta"));//si el valor esta te devolvera verdadero

        while (it.hasNext()) {//mietras tenga siguite

            System.out.println(mapaDeEnterosYStrings.get(it.next()));// te imprime el siguiete valor del mapa

        }
        Map<Integer, String> mapaDeEnterosYStrings2 = new TreeMap();

        mapaDeEnterosYStrings2.putAll(mapaDeEnterosYStrings);

        System.out.println("Ordenados: ");

        for (String elemento : mapaDeEnterosYStrings2.values()) {

            System.out.println(elemento);
        }

    }
}
