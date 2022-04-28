package practicaprograii.ModeloJuego.Juego.Jugador;

import practicaprograii.ModeloJuego.Juego.Islas.Crianza.IslaCrianza;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JugadorTipo {

    private final String Alias;
    private final IslaCrianza Crianza;
    private final IslaExhibicion Exhibicion;
    private final int monedasQueTieneas;

    //centro de mando y el hsitorico
    //no se me ocurre como hacerlo
    public JugadorTipo(String Alias, IslaCrianza IslaCrianza, IslaExhibicion IslaExhibicion) {
        this.Alias = Alias;
        this.Crianza = IslaCrianza;
        this.Exhibicion = IslaExhibicion;
        this.monedasQueTieneas = 1000000;

    }

}
