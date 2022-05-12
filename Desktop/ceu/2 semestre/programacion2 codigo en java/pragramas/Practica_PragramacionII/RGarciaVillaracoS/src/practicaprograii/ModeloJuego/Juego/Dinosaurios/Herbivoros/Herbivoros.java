package practicaprograii.ModeloJuego.Juego.Dinosaurios.Herbivoros;

import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Herbivoros extends Dinosaurio {

    public Herbivoros(TipoMedio TipoMedio, int EdadActual, int EdadQueSeHaceAdulto, int NumeroDeFavoritos, int Apetito, JugadorTipo JugadorTipo) {
        super(TipoMedio, TipoAlimentacion.HERBIVORO, EdadActual, EdadQueSeHaceAdulto, 100, NumeroDeFavoritos, Apetito, JugadorTipo);

    }

}
