package practicaprograii.ModeloJuego.Juego.Jugador;

import practicaprograii.ModeloJuego.Juego.CuadroDeMandos.CuadrodDeMandos;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
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

    //no se me ocurre como hacerlo
    public JugadorTipo(String Alias, IslaCrianza IslaCrianza, IslaExhibicion IslaExhibicion) {
        super();//este super te da el id del jugador ;
        this.Crianza = IslaCrianza;
        this.Exhibicion = IslaExhibicion;
        this.monedasQueTieneas = 1000000;

    }

    //islaCRianza debe tenr un metodo quente quite un dinosaurio
    //IslaExhibiciojn tiene un metodo que te añade un dinosaurio
    public void trasladoDinosaurio(Dinosaurio d, IslaExhibicion ie, IslaCrianza ic) {
        int coste = 100 * (int) Math.pow(3, d.getEdadActual() - d.getEdadQueSeHaceAdulto()) * d.getValormedio();

    }

}
