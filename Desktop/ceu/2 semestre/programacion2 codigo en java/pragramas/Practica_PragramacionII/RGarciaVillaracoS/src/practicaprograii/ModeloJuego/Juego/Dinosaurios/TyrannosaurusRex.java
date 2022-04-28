package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class TyrannosaurusRex extends Dinosaurio {

    public TyrannosaurusRex(JugadorTipo JugadorTipo) {
        super(TipoMedio.TERRESTRE, TipoAlimentacion.CARNIVORO, 0, 24, 100, 0, JugadorTipo);

    }

}
