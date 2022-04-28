package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Pteranodon extends Dinosaurio {

    public Pteranodon(JugadorTipo JugadorTipo) {
        super(TipoMedio.VOLADOR, TipoAlimentacion.CARNIVORO, 0, 16, 100, 0, JugadorTipo);

    }
}
