package practicaprograii.ModeloJuego.Juego.Excepciones;

import java.io.IOException;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Excepciones extends IOException {

    private String error;

    public void error(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
