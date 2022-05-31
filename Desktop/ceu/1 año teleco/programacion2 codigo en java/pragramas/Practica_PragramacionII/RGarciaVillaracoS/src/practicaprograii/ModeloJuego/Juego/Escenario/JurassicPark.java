package practicaprograii.ModeloJuego.Juego.Escenario;

import practicaprograii.ModeloJuego.Juego.Islas.Crianza.Sorna;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.Nublar;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JurassicPark extends Escenario {

    public JurassicPark() {
        super(0, 100000, new Sorna(), new Nublar());
        //super(0, 100000, new IslaCrianza(), new IslaExhibicion());

    }
}
