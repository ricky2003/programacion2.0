package practicaprograii.ModeloJuego.JugadorTipo.Islas.Exhibicion;

import practicaprograii.ModeloJuego.JugadorTipo.NivelADquisitivo.NivelAdquisitivo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Matanceros {

    private final int Alimento;
    private final int Hectareas;
    private final int Visitantes;
    private final NivelAdquisitivo NivelAdquisitivo;

    public Matanceros(int Alimento, int Hectareas, int Visitantes, NivelAdquisitivo NivelAdquisitivo) {
        this.Alimento = 25000;
        this.Hectareas = 10000;
        this.Visitantes = 3000;
        this.NivelAdquisitivo = NivelAdquisitivo.MEDIO;
    }

}
