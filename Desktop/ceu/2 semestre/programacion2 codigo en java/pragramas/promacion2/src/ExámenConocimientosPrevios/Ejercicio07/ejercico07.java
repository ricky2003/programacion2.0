package ExámenConocimientosPrevios.Ejercicio07;

import utilidades.utilidades;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercico07 {

    public static float multiplicacionReales(float resultado) {
        float numero1 = (float) utilidades.LeeDouble("escriba el primer numero= ");
        System.out.println("el numero es :" + numero1);
        float numero2 = (float) utilidades.LeeDouble("escriba el segundo numero= ");
        System.out.println("el numero es :" + numero2);
        resultado = numero1 * numero2;
        return resultado;

    }

    public static void main(String[] args) {
        int resultado = 0;
        System.out.println("la multiplicacion es :" + multiplicacionReales(resultado));
        // esto es la forma de crear numero random com el limite en 75(el mayor) y 25(el menor)
        float suma = (int) (Math.floor(Math.random() * (75 - 25 + 1)) + 25);
        suma = suma + multiplicacionReales(resultado);
        System.out.println("la suma es :" + suma);

    }

}
