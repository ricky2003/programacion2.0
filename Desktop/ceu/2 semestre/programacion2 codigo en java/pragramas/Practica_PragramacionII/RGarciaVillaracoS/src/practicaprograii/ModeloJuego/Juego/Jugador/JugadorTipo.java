package practicaprograii.ModeloJuego.Juego.Jugador;

import practicaprograii.ModeloJuego.Juego.CuadroDeMandos.CuadroDeMandos;
import practicaprograii.ModeloJuego.Juego.Islas.Crianza.IslaCrianza;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JugadorTipo {

    private String Alias;
    private IslaCrianza Crianza;
    private IslaExhibicion Exhibicion;
    private int monedasQueTieneas;
    private CuadroDeMandos CuadroDeMandos;
    //private final CuadrodeMados DashBoard;

    //centro de mando y el hsitorico
    //no se me ocurre como hacerlo
    public JugadorTipo(String Alias, IslaCrianza IslaCrianza, IslaExhibicion IslaExhibicion) {
        this.Alias = Alias;
        this.Crianza = IslaCrianza;
        this.Exhibicion = IslaExhibicion;
        this.monedasQueTieneas = 1000000;

    }

}
