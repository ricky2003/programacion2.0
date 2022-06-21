package EjemploTablasHash;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Ejemplo {

    private int valor;

    public Ejemplo(int valor) {
        this.valor = valor;
    }

    /**
     *
     * @param objeto
     * @return
     */
    @Override
    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }
        if (!(objeto instanceof Ejemplo)) {
            return false;
        }
        if (((Ejemplo) objeto).valor == this.valor) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return valor;
    }
}
