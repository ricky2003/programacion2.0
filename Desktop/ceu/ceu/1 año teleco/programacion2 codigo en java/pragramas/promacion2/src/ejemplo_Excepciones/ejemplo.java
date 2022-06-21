package ejemplo_Excepciones;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejemplo {

    private static float tolerancia = 0.001F;

    public static float solve(FunctionInterface funcion, float start, float end) throws NON_VALID_INTERVAL_EXCEPTION {
        validaElIntervalo(funcion, start, end);
        while (differetSign(funcion, start, end) && (end - start) > getTolerancia()) {
            float middle = (start + end) / 2;
            if (differetSign(funcion, start, middle)) {
                start = middle;
            } else if (differetSign(funcion, end, middle)) {
                start = middle;
            } else {
                return middle;
            }
        }
        return (start + end) / 2;
    }

    public static boolean differetSign(FunctionInterface funcion, float i, float f) {
        return funcion.evaluate(i) * funcion.evaluate(f) < 0;
    }

    public static void validaElIntervalo(FunctionInterface funcion, float start, float end) throws NON_VALID_INTERVAL_EXCEPTION {
        if ((end - start) <= 0) {
            throw new NON_VALID_INTERVAL_EXCEPTION(funcion, start, end, NON_VALID_INTERVAL_EXCEPTION.Errortipe.NON_VALID_INTERVAL);
        }
        if (!differetSign(funcion, start, end)) {
            throw new NON_VALID_INTERVAL_EXCEPTION(funcion, start, end, NON_VALID_INTERVAL_EXCEPTION.Errortipe.INTERVAL_NOT_VALID);
        }
    }

    public static float getTolerancia() {
        return tolerancia;
    }

    public static void setTolerancia(float tolerancia) {
        ejemplo.tolerancia = tolerancia;
    }

}
