package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class EAC03 {

    private final int CosteDeContruccion;
    private final int UnidadesDeAlimentacion;
    private final int NumerosDeEjemplares;
    private final int Hectareas;
    private final TipoRecinto TipoRecinto;
    private final TipoMedio TipoMedio;
    private final TipoAlimentacion TipoDeAlimentacion;

    public EAC03(int CosteDeContruccion, int UnidadesDeAlimentacion, int NumerosDeEjemplares, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        this.CosteDeContruccion = 25000;
        this.UnidadesDeAlimentacion = 0;
        this.NumerosDeEjemplares = 3;
        this.Hectareas = 400;
        this.TipoRecinto = TipoRecinto.VIDRIO;
        this.TipoMedio = TipoMedio.ACUATICO;
        this.TipoDeAlimentacion = TipoDeAlimentacion.CARNIVORO;
    }

}
