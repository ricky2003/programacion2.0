package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Branchiosaurio extends Dinosaurio {

    public Branchiosaurio(JugadorTipo JugadorTipo) {
        super(TipoMedio.TERRESTRE, TipoAlimentacion.HERBIVORO, 0, 12, 100, 0, JugadorTipo);

    }

}
