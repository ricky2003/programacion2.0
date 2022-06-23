package EjemploMapasóDiccionario;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class mapa2 {

    public static void main(String[] args) {
        Map<Persona, String> mapas = new HashMap<Persona, String>();

        Persona p1 = new Persona(18, 1, "jorge");
        Persona p2 = new Persona(19, 2, "jaime");
        Persona p3 = new Persona(20, 3, "luis");

        mapas.put(p1, "caballo");
        mapas.put(p2, "perro");
        mapas.put(p3, "gato");
        System.out.println(mapas);

        System.out.println(mapas.get(p2));
        System.out.println(mapas.get(new Persona(42, 4, "alberto")));
        mapas.put(new Persona(42, 2, "alberto"), "vaca");
        System.out.println(mapas);

    }
}
