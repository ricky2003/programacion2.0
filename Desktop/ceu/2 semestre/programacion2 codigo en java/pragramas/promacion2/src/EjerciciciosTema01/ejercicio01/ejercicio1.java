package EjerciciciosTema01.ejercicio01;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejercicio1 {

    public static void main(String[] args) {
        int numero_dias = 1;//nuero de dias en un año
        int numero_horas = 1;//numero de horas en un dia
        int numero_minutos = 1;//numero de minutos en una hora
        int numero_segundos = 1;//numero de segundos en un minuto
        int numero_segundos2 = 1;//numero de segundos en un año
        numero_minutos = 60 * numero_segundos;
        numero_horas = 60 * numero_minutos;
        numero_dias = 24 * numero_horas;
        numero_segundos2 = 365 * numero_dias;
        System.out.println("el numero de segundos que tiene un año son:" + numero_segundos2);

    }

}
