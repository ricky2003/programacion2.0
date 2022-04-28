package practicaprograii.ModeloJuego.Juego.Escenario;

import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.Matanceros;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JurassicWorld {

    private int monedas;
    //private int visitantes;

    public JurassicWorld(int monedas, Matanceros Matanceros) {
        this.monedas = monedas;

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
