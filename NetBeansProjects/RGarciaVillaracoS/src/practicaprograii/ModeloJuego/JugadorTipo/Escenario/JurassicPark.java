package practicaprograii.ModeloJuego.JugadorTipo.Escenario;

import practicaprograii.ModeloJuego.JugadorTipo.Islas.Exhibicion.Nublar;
import practicaprograii.ModeloJuego.JugadorTipo.JugadorTipo.JugadorTipo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JurassicPark {

    private int monedas;
    private Nublar IslaNublar;
    private JugadorTipo JugadorQueLaUtiliza;

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
