package practicaprograii.ModeloJuego.Juego.Islas;

import practicaprograii.ModeloJuego.Juego.NivelADquisitivo.NivelAdquisitivo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Islas {

    private final int alimento;
    private final int hectareas;
    private final int visitantes;
    private final NivelAdquisitivo nivelAdquisitivo;

    public Islas(int Alimento, int Hectareas, int Visitantes, NivelAdquisitivo NivelAdquisitivo) {
        this.alimento = Alimento;
        this.hectareas = Hectareas;
        this.visitantes = Visitantes;
        this.nivelAdquisitivo = NivelAdquisitivo;
    }

}
