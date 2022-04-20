package practicaprograii.ModeloJuego.Juego.Instalaciones.Cria;

import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class CAC4 {

    private final int CosteDeContruccion;
    private final int UnidadesDeAlimentacion;
    private final int NumerosDeEjemplares;
    private final int Hectareas;
    private final TipoRecinto TipoRecinto;
    private final TipoMedio TipoMedio;
    private final TipoAlimentacion TipoDeAlimentacion;

    public CAC4(int CosteDeContruccion, int UnidadesDeAlimentacion, int NumerosDeEjemplares, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        this.CosteDeContruccion = 3500;
        this.UnidadesDeAlimentacion = 100;
        this.NumerosDeEjemplares = 4;
        this.Hectareas = 25;
        this.TipoRecinto = TipoRecinto.VIDRIO;
        this.TipoMedio = TipoMedio.ACUATICO;
        this.TipoDeAlimentacion = TipoAlimentacion.CARNIVORO;
    }

}
