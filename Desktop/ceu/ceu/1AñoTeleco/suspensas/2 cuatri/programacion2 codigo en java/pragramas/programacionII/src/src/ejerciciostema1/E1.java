package src.ejerciciostema1;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class E1 {

    /**
     * @param args Escribir un programa que defina variables que representen el
     * número de días de un año, el número de horas que tiene un día, el número
     * de minutos que tiene una hora y el número de segundos que tiene un
     * minuto. Emplear las variables que ocupen el mínimo espacio de memoria
     * posible. A continuación, calcular el número de segundos que tiene un año
     * y almacenar el valor del cálculo en otra variable.
     */
    public static void main(String args[]) {
        int dias = 1, años = 1, meses = 1, horas = 1, minutos = 1, segundos = 1;
        minutos = 60 * segundos;
        horas = 60 * minutos;
        dias = 24 * horas;
        años = 365 * dias;
        System.out.println("segundosen un año " + años + "\n");

    }
}
