package EjerciciosTema01.ejercicio12;

import EjerciciosTema01.utilidades.utilidades;

public class RVillaracoEntregaT1ejer12 {

    public static int LeeUnString(int contador_vocales) {

        String palabra = utilidades.LeeCadena("escribe una palabra =");

        for (int i = 0; i <= palabra.length() - 1; i++) {

            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                contador_vocales++;

            }
        }
        return contador_vocales;
    }

    ;

    public static void main(String[] args) {
        int contador_vocales = 0;
        contador_vocales = RVillaracoEntregaT1ejer12.LeeUnString(contador_vocales);

        System.out.println("la cantida de vocales son: " + contador_vocales);

    }

}
