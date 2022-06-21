package practicaprograii.ModeloJuego.Juego.Escenario;

import practicaprograii.ModeloJuego.Juego.Islas.Crianza.Sorna;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.SanDiego;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JurassicParkSanDiego extends Escenario {

    //private int visitantes;
    public JurassicParkSanDiego() {
        super(50000, 0, new Sorna(), new SanDiego());
    }

}
