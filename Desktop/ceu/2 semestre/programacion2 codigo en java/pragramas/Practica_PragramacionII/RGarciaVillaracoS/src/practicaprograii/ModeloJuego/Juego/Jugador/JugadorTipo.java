package practicaprograii.ModeloJuego.Juego.Jugador;

import practicaprograii.ModeloJuego.Juego.CuadroDeMandos.CuadrodDeMandos;
import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Islas.Crianza.IslaCrianza;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JugadorTipo extends Entidad {

    //el alias es el id
    private IslaCrianza Crianza;
    private IslaExhibicion Exhibicion;
    private int monedasQueTieneas;
    private CuadrodDeMandos CuadroDeMandos;
    //private final CuadrodeMados DashBoard;

    //centro de mando y el hsitorico
    //no se me ocurre como hacerlo
    public JugadorTipo(String Alias, IslaCrianza IslaCrianza, IslaExhibicion IslaExhibicion) {
        super();//este super te da el id del jugador ;
        this.Crianza = IslaCrianza;
        this.Exhibicion = IslaExhibicion;
        this.monedasQueTieneas = 1000000;

    }

}
