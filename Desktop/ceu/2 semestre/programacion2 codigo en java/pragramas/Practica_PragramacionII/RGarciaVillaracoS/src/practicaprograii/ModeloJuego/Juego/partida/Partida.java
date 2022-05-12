package practicaprograii.ModeloJuego.Juego.partida;

import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Escenario.Escenario;
import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Partida extends Entidad {

    private final Escenario escenario;
    private final JugadorTipo jugador;
    private boolean FinPartida;

    public Partida(Escenario escenario, JugadorTipo jugador, int id, boolean FinPartida) {
        super();//este super te da el id del jugador ;
        this.escenario = escenario;
        this.jugador = jugador;
        this.FinPartida = FinPartida;
    }

    public boolean Final_de_la_patdia() {
        if (this.FinPartida = true) {
            System.out.println("la partida ha terminado");
        }
        return this.FinPartida;
    }

}
