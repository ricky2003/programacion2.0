package practicaprograii.ModeloJuego.Juego.Islas;

import practicaprograii.ModeloJuego.Juego.NivelADquisitivo.NivelAdquisitivo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Islas {

    private int Alimento;
    private int Hectareas;
    private int Visitantes;
    private NivelAdquisitivo NivelAdquisitivo;

    public Islas(int Alimento, int Hectareas, int Visitantes, NivelAdquisitivo NivelAdquisitivo) {
        this.Alimento = Alimento;
        this.Hectareas = Hectareas;
        this.Visitantes = Visitantes;
        this.NivelAdquisitivo = NivelAdquisitivo;
    }

}
