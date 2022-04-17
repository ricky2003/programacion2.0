package practicaprograii.ModeloJuego.JugadorTipo.Escenario;

import practicaprograii.ModeloJuego.JugadorTipo.Islas.Exhibicion.Matanceros;
import practicaprograii.ModeloJuego.JugadorTipo.JugadorTipo.JugadorTipo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JurassicWorld {

    private int monedas;
    private Matanceros IslaDeCrianza;
    private JugadorTipo JugadorQueLaUtiliza;

    public JurassicWorld(int monedas, Matanceros Matanceros) {
        this.monedas = monedas;
        this.IslaDeCrianza = Matanceros;

    }

    public int MonedasQuitadas(int MonedasQuitadas) {
        MonedasQuitadas = 150000;
        return MonedasQuitadas;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

}
