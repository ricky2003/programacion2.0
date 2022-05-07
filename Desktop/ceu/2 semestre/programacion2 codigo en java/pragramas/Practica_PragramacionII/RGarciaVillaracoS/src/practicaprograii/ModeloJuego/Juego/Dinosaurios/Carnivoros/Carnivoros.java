package practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros;

import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Carnivoros extends Dinosaurio {

    private int nivelDESalud;
    private TipoMedio tipoMedio;
    private JugadorTipo jugadorTipo;

    public Carnivoros(TipoMedio TipoMedio, JugadorTipo JugadorTipo) {
        this.tipoMedio = TipoMedio;
        this.jugadorTipo = JugadorTipo;

    }
}
