package practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class TyrannosaurusRex extends Carnivoros {

    public TyrannosaurusRex(JugadorTipo JugadorTipo) {
        super(TipoMedio.TERRESTRE, 0, 24, 0, JugadorTipo);

    }

}
