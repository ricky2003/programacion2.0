package practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Pteranodon extends Carnivoros {

    public Pteranodon(JugadorTipo JugadorTipo) {
        super(TipoMedio.VOLADOR, 0, 16, 0, JugadorTipo);

    }
}
