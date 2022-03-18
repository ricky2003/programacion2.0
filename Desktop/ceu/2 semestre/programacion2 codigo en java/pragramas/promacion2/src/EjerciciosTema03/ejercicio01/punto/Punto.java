package EjerciciosTema03.ejercicio01.punto;

/**
 * Escribe un programa que cree una clase para representar un objeto Punto en
 * tres dimensiones. Proporcionar un constructor que inicialice los valores del
 * Punto al origen de coordenadas y otro que permita especificar las coordenadas
 * del Punto. Sobrescribe su método toString() para que muestre información
 * sobre los puntos Usa la clase en un programa donde crees objetos que
 * representen los puntos (12, 13, 18) y (8, 14, 0) y los muestres por consola.
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Punto {

    private double x;
    private double y;
    private double z;
//constructor por defecto

    public Punto() {
        this(0, 0, 0);
    }

    /**
     *
     * @param x
     * @param y
     * @param z
     */
    public Punto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

//GETTER AND SETTERS
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    // te proporciona el como quieres que se enseñe por pantalla
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }

}
