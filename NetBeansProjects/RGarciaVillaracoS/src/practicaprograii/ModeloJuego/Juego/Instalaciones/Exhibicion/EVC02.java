package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class EVC02 {

    private final int CosteDeContruccion;
    private final int UnidadesDeAlimentacion;
    private final int NumerosDeEjemplares;
    private final int Hectareas;
    private final TipoRecinto TipoRecinto;
    private final TipoMedio TipoMedio;
    private final TipoAlimentacion TipoDeAlimentacion;

    public EVC02(int CosteDeContruccion, int UnidadesDeAlimentacion, int NumerosDeEjemplares, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        this.CosteDeContruccion = 15000;
        this.UnidadesDeAlimentacion = 0;
        this.NumerosDeEjemplares = 2;
        this.Hectareas = 200;
        this.TipoRecinto = TipoRecinto.ELECTRIFICADO;
        this.TipoMedio = TipoMedio.ACUATICO;
        this.TipoDeAlimentacion = TipoAlimentacion.CARNIVORO;
    }

}
