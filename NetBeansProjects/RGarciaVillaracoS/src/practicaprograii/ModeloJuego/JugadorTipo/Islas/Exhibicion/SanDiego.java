package practicaprograii.ModeloJuego.JugadorTipo.Islas.Exhibicion;

import practicaprograii.ModeloJuego.JugadorTipo.NivelADquisitivo.NivelAdquisitivo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class SanDiego {

    private int Hectareas, Alimento, VisitantesMaximos;
    private NivelAdquisitivo NivelAdquisitivo;

    public SanDiego(int Hectareas, int Alimento, int VisitantesMaximos, NivelAdquisitivo NivelAdquisitivo) {
        this.Hectareas = 100;
        this.Alimento = 5000;
        this.VisitantesMaximos = 2000;
        this.NivelAdquisitivo = NivelAdquisitivo.BAJO;
    }

}
