package practicaprograii.ModeloJuego.Juego.Escenario;

import practicaprograii.ModeloJuego.Juego.Islas.Crianza.Sorna;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.Matanceros;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JurassicWorld extends Escenario {

    public JurassicWorld() {
        super(150000, 0, new Sorna(), new Matanceros());

    }

}
