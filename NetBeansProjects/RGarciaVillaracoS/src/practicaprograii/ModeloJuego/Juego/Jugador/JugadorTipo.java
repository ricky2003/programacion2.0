package practicaprograii.ModeloJuego.Juego.Jugador;

import practicaprograii.ModeloJuego.Juego.Islas.Crianza.Sorna;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.*;
import practicaprograii.ModeloJuego.Juego.utilidades.utilidades;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JugadorTipo {

    private final String Alias;
    private final Sorna Crianza;
    private final SanDiego Exhibicion3;
    private final int monedasQueTieneas;

    //centro de mando y el hsitorico
    //no se me ocurre como hacerlo
    public JugadorTipo(String Alias, Sorna Sorna, SanDiego SanDiego) {
        this.Alias = utilidades.LeeCadena("escribe tu nombre ");
        this.Crianza = Sorna;
        this.Exhibicion3 = SanDiego;
        this.monedasQueTieneas = 1000000;

    }

}
