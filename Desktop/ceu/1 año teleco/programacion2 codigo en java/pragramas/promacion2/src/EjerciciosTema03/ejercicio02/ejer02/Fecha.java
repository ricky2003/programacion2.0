package EjerciciosTema03.ejercicio02.ejer02;

/**
 *
 * Crea una clase fecha que almacene el día, el mes y el año de una fecha.
 * Proporciona funciones miembro para acceder a estos atributos (getDia(),
 * getMes() y getAño()) y para modificarlos (setDia(int dia), setMes(int mes) y
 * setAño(int año)). Sobrescribe su método toString(). Crea la fecha 20/10/2018.
 * Muéstrala por pantalla. Después cambia el año 2019. Muéstrala por pantalla.
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        this(20, 10, 18);
    }

    /**
     *
     * @param dia
     * @param mes
     * @param año
     */
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }

    //GETTERS AND SETTERS
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Fecha=" + "" + dia + "/" + mes + "/" + año;
    }
}
