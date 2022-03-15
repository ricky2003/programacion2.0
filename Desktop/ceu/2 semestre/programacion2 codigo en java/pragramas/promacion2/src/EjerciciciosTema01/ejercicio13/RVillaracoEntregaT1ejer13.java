package EjerciciciosTema01.ejercicio13;

import EjerciciciosTema01.utilidades;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class RVillaracoEntregaT1ejer13 {

    public static String invertirpalabra(String palabra_invertida) {
        String palabra = utilidades.LeeCadena("la palabra es= ");
        // Recorremos la cadena original del final al inicio
        for (int i = palabra.length() - 1; i >= 0; i--) {
            //el operador += sirve para concatenar cadenas
            palabra_invertida += palabra.charAt(i);
        }

        return palabra_invertida;
    }

    ;

    public static void main(String[] args) {
        String invertida = "";
        invertida = RVillaracoEntregaT1ejer13.invertirpalabra(invertida);

        System.out.println("la cadena al reves es: " + invertida);
    }

}
