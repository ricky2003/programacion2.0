package practicaprograii.ModeloJuego.Juego.Escenario;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JurassicPark {

    private int monedas;
    //private int visitantes ;

    public JurassicPark(int monedas) {
        this.monedas = monedas;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public int QuitarMonedas(int monedasQuitadas) {
        monedasQuitadas = this.monedas;
        monedasQuitadas = 100000;

        return monedasQuitadas;
    }

}
