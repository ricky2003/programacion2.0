package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ETC02 {

    private final int CosteDeContruccion;
    private final int UnidadesDeAlimentacion;
    private final int NumerosDeEjemplares;
    private final int Hectareas;
    private final TipoRecinto TipoRecinto;
    private final TipoMedio TipoMedio;
    private final TipoAlimentacion TipoDeAlimentacion;

    public ETC02(int CosteDeContruccion, int UnidadesDeAlimentacion, int NumerosDeEjemplares, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        this.CosteDeContruccion = 12500;
        this.UnidadesDeAlimentacion = 0;
        this.NumerosDeEjemplares = 3;
        this.Hectareas = 300;
        this.TipoRecinto = TipoRecinto.ELECTRIFICADO;
        this.TipoMedio = TipoMedio.TERRESTRE;
        this.TipoDeAlimentacion = TipoDeAlimentacion;
    }

}
