package ejemplo_Excepciones;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class NON_VALID_INTERVAL_EXCEPTION extends RuntimeException {

    public enum Errortipe {
        NON_VALID_INTERVAL, INTERVAL_NOT_VALID
    };

    private FunctionInterface funcion;
    private float start, end;
    private Errortipe error;

    NON_VALID_INTERVAL_EXCEPTION(FunctionInterface funcion, float start, float end, Errortipe error) {
        this.funcion = funcion;
        this.start = start;
        this.end = end;
        this.error = error;
    }

    public FunctionInterface getFuncion() {
        return funcion;
    }

    public float getStart() {
        return start;
    }

    public float getEnd() {
        return end;
    }

    public Errortipe getError() {
        return error;
    }

    @Override
    public String toString() {
        switch (getError()) {
            case NON_VALID_INTERVAL:
                return "no es un intervalo valido , inicio poteriro al final ";
            case INTERVAL_NOT_VALID:
                return "no es un intervalo valido, valor de funcion principio" + getFuncion().evaluate(getStart()) + "y el valor inicial" + getFuncion().evaluate(getEnd());
            default:
                return "se produjo algn error";
        }
    }

}
