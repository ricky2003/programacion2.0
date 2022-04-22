package practicaprograii.ModeloJuego.Juego.Instalaciones;

import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Instalaciones {

    private final int CosteDeContruccion;
    private final int UnidadesDeAlimentacion;
    private final int NumerosDeEjemplares;
    private final int Hectareas;
    private final TipoRecinto TipoRecinto;
    private final TipoMedio TipoMedio;
    private final TipoAlimentacion TipoDeAlimentacion;

    public Instalaciones(int CosteDeContruccion, int UnidadesDeAlimentacion, int NumerosDeEjemplares, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        this.CosteDeContruccion = CosteDeContruccion;
        this.UnidadesDeAlimentacion = UnidadesDeAlimentacion;
        this.NumerosDeEjemplares = NumerosDeEjemplares;
        this.Hectareas = Hectareas;
        this.TipoRecinto = TipoRecinto;
        this.TipoMedio = TipoMedio;
        this.TipoDeAlimentacion = TipoDeAlimentacion;
    }

}
