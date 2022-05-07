package practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros;

import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Carnivoros extends Dinosaurio {

    public Carnivoros(TipoMedio TipoMedio, int EdadActual, int EdadQueSeHaceAdulto, int NumeroDeFavoritos, JugadorTipo JugadorTipo) {
        super(TipoMedio, TipoAlimentacion.CARNIVORO, EdadActual, EdadQueSeHaceAdulto, 100, NumeroDeFavoritos, JugadorTipo);

    }
}
