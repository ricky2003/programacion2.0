package practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Mosasaurio extends Carnivoros {

    public Mosasaurio(JugadorTipo JugadorTipo) {
        super(TipoMedio.ACUATICO, 0, 42, 0, JugadorTipo);

    }

}
