package practicaprograii.ModeloJuego.Juego.Jugador;

import practicaprograii.ModeloJuego.Juego.CuadroDeMandos.CuadrodDeMandos;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Escenario.Escenario;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Cria.*;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion.*;
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

    }

    public int fav(Dinosaurio d) {
        int fav = 10 * d.getEdadQueSeHaceAdulto() * (d.getNivelDeSalud() / 100) * this.Exhibicion.ValorAdquisitivo();
        return fav;
    }

    /**
     *
     * @param d
     * @param ie
     * @param ic
     * @param e
     * @throws
     * practicaprograii.ModeloJuego.Juego.Excepciones.ExceptionMonedasInsuficientes
     */
    public void trasladoDinosaurio(Dinosaurio d, Exhibicion ie, Cria ic, Escenario e) {

        int coste = 100 * (int) Math.pow(3, d.getEdadActual() - d.getEdadQueSeHaceAdulto()) * d.getValormedio();
        if (coste <= this.monedasQueTieneas) {
            ic.trasladaDinosaurio(d, ie);

        }

        if (d.getNivelDeSalud() <= 75) {
            //excepcion

        } else if (ie.Full()) {
            //excepcion
        } else if (e.getMonedasIniciales() < coste) {
            //excepcion
        }

    }

}
