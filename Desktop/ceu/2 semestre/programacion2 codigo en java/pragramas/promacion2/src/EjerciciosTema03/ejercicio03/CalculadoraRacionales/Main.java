package EjerciciosTema03.ejercicio03.CalculadoraRacionales;

import EjerciciosTema03.ejercicio03.NumeroRacional.DenominadorCeroException;
import EjerciciosTema03.ejercicio03.NumeroRacional.NumeroRacional;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Main {

    public static void main(String[] args) throws DenominadorCeroException {

        showMenu();
    }

    /**
     *
     * @return @throws DenominadorCeroException
     */
    public static NumeroRacional leerRacional() {
        Boolean correcto = false;
        NumeroRacional resultado = null;

        int numerador = utilidades.utilidades.leeEntero("introduzca el numerador");
        int denominador = 1;
        while (!correcto) {
            denominador = utilidades.utilidades.leeEntero("introduzca el denominador");
            try {

                resultado = new NumeroRacional(numerador, denominador);
                correcto = true;

            } catch (DenominadorCeroException ex) {

                System.out.println("El denominador no pude ser 0. introduce otro numero");
            }
        }
        return resultado;
    }

    public static void showMenu() throws DenominadorCeroException {
        NumeroRacional r1 = null;
        NumeroRacional r2 = null;
        NumeroRacional resultado = null;

        boolean salir = false;

        while (!salir) {
            System.out.println("esto sera la calculador de racionales");
            System.out.println("       1.Suma dos racionales");
            System.out.println("        2.Multiplica 2 racionales");
            System.out.println("        3.simplifica el racional al maximo");
            System.out.println("        4.para poder salir");
            System.out.println("\n\n");
            int opcion = utilidades.utilidades.leeEntero("escribe la opcion que quires");
            switch (opcion) {

                case 1://suma
                    r1 = leerRacional();
                    r2 = leerRacional();
                    resultado = r1.suma(r2);
                    break;

                case 2://Multiplicacion
                    r1 = leerRacional();
                    r2 = leerRacional();
                    resultado = r1.mult(r2);
                    break;

                case 3://simplificacion
                    r1 = leerRacional();
                    resultado = r1.simplificar(r1);
                    break;

                case 4://salir
                    salir = true;
                    break;

            }

            if (resultado != null) {
                System.out.println("El resultado es : " + resultado);
                resultado = null;
            }
        }
    }
}
