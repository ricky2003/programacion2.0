package EjerciciosTema03.ejercicio03.NumeroRacional;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class DenominadorCeroException extends Exception {

    int numero;

    public DenominadorCeroException(int numero) {
        this.numero = numero;
    }

    public int getnumero() {
        return this.numero;
    }

    @Override
    public String toString() {
        return "debes tener un numero que sea mayor que cero ";
    }

}
