package practicaprograii.ModeloJuego.Juego.Excepciones;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ExceptionMonedasInsuficientes extends Exception {

    private int Errormonedas;

    public ExceptionMonedasInsuficientes(int error) {
        super();
        this.Errormonedas = error;
    }

    public String toString() {
        String mensaje = "";
        switch (Errormonedas) {
            case 1:
                mensaje = "tus monedas no son suficientes";
                break;
        }
        return mensaje;
    }

    public int getErrormonedas() {
        return Errormonedas;
    }

    public void setErrormonedas(int Errormonedas) {
        this.Errormonedas = Errormonedas;
    }

}
