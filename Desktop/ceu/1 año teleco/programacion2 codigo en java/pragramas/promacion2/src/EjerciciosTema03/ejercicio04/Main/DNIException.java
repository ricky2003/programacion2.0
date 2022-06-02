package EjerciciosTema03.ejercicio04.Main;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class DNIException extends Exception {

    private Errores error0;

    public DNIException(Errores error) {
        super();
        this.error0 = Errores.LETRA;

    }

    public Errores getError0() {
        return error0;
    }

    public void setError0(Errores error0) {
        this.error0 = error0;
    }

    @Override
    public String toString() {
        switch (getError0()) {
            case LETRA -> {
                return "la letra puesta no vale ";
            }
            case NUMERO -> {
                return "el numero puesto no es valido";
            }
        }
        return "ha habido algun problema ?";

    }

}
