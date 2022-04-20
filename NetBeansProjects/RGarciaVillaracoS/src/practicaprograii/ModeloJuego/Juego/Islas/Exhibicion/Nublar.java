package practicaprograii.ModeloJuego.Juego.Islas.Exhibicion;

import practicaprograii.ModeloJuego.Juego.NivelADquisitivo.NivelAdquisitivo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Nublar {

    private int Hectareas, Alimento, VisitantesMaximos;
    private NivelAdquisitivo NivelAdquisitivo;

    public Nublar(int Hectareas, int Comidadinosario) {
        this.Hectareas = 7700;
        this.Alimento = 10000;
        this.VisitantesMaximos = 1000;
        this.NivelAdquisitivo = NivelAdquisitivo.ALTO;
    }

}
