package practicaprograii.ModeloJuego.JugadorTipo.Escenario;

import practicaprograii.ModeloJuego.JugadorTipo.Islas.Exhibicion.Nublar;
import practicaprograii.ModeloJuego.JugadorTipo.JugadorTipo.JugadorTipo;

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
