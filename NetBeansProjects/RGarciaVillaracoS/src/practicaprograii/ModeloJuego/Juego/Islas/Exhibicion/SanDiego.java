package practicaprograii.ModeloJuego.Juego.Islas.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Islas.Islas;
import practicaprograii.ModeloJuego.Juego.NivelADquisitivo.NivelAdquisitivo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class SanDiego extends Islas {

    public SanDiego(int Hectareas, int Alimento, int VisitantesMaximos, NivelAdquisitivo NivelAdquisitivo) {
        super(100, 5000, 2000, NivelAdquisitivo.ALTO);
    }

}
