package practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Velocirraptor extends Carnivoros {

    public Velocirraptor(JugadorTipo JugadorTipo) {
        super(TipoMedio.TERRESTRE, 0, 38, 0, JugadorTipo);

    }

}
