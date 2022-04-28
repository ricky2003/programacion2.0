package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Velocirraptor extends Dinosaurio {

    public Velocirraptor(JugadorTipo JugadorTipo) {
        super(TipoMedio.TERRESTRE, TipoAlimentacion.CARNIVORO, 0, 38, 100, 0, JugadorTipo);

    }

}
