package practicaprograii.ModeloJuego.Juego.Excepciones;

import java.io.IOException;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Excepciones extends IOException {

    private int i;

    public enum error {
        ERROR_EN_LA_SALUD
    }

    public Excepciones(int i) {
        super();
        this.i = i;
    }

    public String getError() {
        String mensaje = "";
        switch (i) {
            case 1:
                mensaje = "la salud esta por debajo del 75 %";
            case 2:
                mensaje = "no tine smonedas suficientes para trasladar al dinosaurio";
            default:
                mensaje = "ha habido algún error";

        }
        return mensaje;
    }
}
