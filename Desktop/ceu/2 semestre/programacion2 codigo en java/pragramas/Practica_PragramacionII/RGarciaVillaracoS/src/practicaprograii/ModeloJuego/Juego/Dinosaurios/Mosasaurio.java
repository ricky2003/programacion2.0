package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Mosasaurio extends Dinosaurio {

    public Mosasaurio(JugadorTipo JugadorTipo) {
        super(TipoMedio.ACUATICO, TipoAlimentacion.CARNIVORO, 0, 42, 100, 0, JugadorTipo);

    }

}
