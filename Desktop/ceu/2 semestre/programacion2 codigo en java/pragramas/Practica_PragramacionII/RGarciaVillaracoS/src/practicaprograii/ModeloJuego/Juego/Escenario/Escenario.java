package practicaprograii.ModeloJuego.Juego.Escenario;

import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Islas.Crianza.IslaCrianza;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.IslaExhibicion;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Escenario extends Entidad {

    private int monedasIniciales;
    private int VisitantesIniciales;
    private IslaCrianza islaCrianza;
    private IslaExhibicion islaExhibicion;

    public Escenario(int monedas, int Visitantes, IslaCrianza islaCrianza, IslaExhibicion islaExhibicion) {
        super();//este super te da el id del jugador ;
        this.VisitantesIniciales = Visitantes;
        this.monedasIniciales = monedas;
        this.islaCrianza = islaCrianza;
        this.islaExhibicion = islaExhibicion;
    }

}
