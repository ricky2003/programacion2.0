package practicaprograii.ModeloJuego.Juego.Escenario;

import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.Nublar;
import practicaprograii.ModeloJuego.Juego.JugadorTipo.JugadorTipo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JurassicParkSanDiego {

    private int monedas;
    private Nublar IslaDeSanDiego;
    private JugadorTipo JugadorQueLaUtiliza;

    public JurassicParkSanDiego(int monedas, JugadorTipo JugadorQueLaUtiliza) {
        this.monedas = monedas;
        this.JugadorQueLaUtiliza = JugadorQueLaUtiliza;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public int QuitarMonedas(int monedasQuitadas) {
        monedasQuitadas = this.monedas;
        monedasQuitadas = 50000;
        return monedasQuitadas;
    }
}
