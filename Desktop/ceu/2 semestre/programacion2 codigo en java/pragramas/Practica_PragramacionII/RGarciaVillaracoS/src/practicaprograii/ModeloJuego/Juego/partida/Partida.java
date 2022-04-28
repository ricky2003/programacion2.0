package practicaprograii.ModeloJuego.Juego.partida;

import practicaprograii.ModeloJuego.Juego.Escenario.Escenario;
import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Partida {

    private final Escenario escenario;
    private final JugadorTipo jugador;

    public Partida(Escenario escenario, JugadorTipo jugador) {
        this.escenario = escenario;
        this.jugador = jugador;
    }

}
