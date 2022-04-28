package practicaprograii.ModeloJuego.Juego.Escenario;

import practicaprograii.ModeloJuego.Juego.Islas.Crianza.IslaCrianza;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.IslaExhibicion;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Escenario {

    private final int monedas;
    private final IslaCrianza islaCrianza;
    private final IslaExhibicion islaExhibicion;

    public Escenario(int monedas, IslaCrianza islaCrianza, IslaExhibicion islaExhibicion) {
        this.monedas = monedas;
        this.islaCrianza = islaCrianza;
        this.islaExhibicion = islaExhibicion;
    }

}
