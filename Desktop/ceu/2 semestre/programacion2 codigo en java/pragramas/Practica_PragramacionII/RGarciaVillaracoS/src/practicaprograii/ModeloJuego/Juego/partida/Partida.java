package practicaprograii.ModeloJuego.Juego.partida;

import java.util.Random;
import practicaprograii.ModeloJuego.Juego.Escenario.Escenario;
import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Partida {

    private final Escenario escenario;
    private final JugadorTipo jugador;
    private int id;
    private boolean FinPartida;

    public Partida(Escenario escenario, JugadorTipo jugador, int id, boolean FinPartida) {
        this.escenario = escenario;
        this.jugador = jugador;
        this.id = IngenIDAleatorio();
        this.FinPartida = FinPartida;
    }

    public int IngenIDAleatorio() {
        Random random = new Random();

        this.id = random.nextInt(Integer.MAX_VALUE);
        return id;

    }

    public boolean Final_de_la_patdia() {
        if (this.FinPartida = true) {
            System.out.println("la partida ha terminado");
        }
        return this.FinPartida;
    }

}
