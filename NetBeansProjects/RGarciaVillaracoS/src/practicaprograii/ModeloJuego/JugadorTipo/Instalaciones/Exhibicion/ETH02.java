package practicaprograii.ModeloJuego.JugadorTipo.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.JugadorTipo.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.JugadorTipo.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.JugadorTipo.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ETH02 {

    private final int CosteDeContruccion;
    private final int UnidadesDeAlimentacion;
    private final int NumerosDeEjemplares;
    private final int Hectareas;
    private final TipoRecinto TipoRecinto;
    private final TipoMedio TipoMedio;
    private final TipoAlimentacion TipoDeAlimentacion;

    public ETH02(int CosteDeContruccion, int UnidadesDeAlimentacion, int NumerosDeEjemplares, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        this.CosteDeContruccion = 21000;
        this.UnidadesDeAlimentacion = 0;
        this.NumerosDeEjemplares = 2;
        this.Hectareas = 200;
        this.TipoRecinto = TipoRecinto.MADERA;
        this.TipoMedio = TipoMedio.TERRESTRE;
        this.TipoDeAlimentacion = TipoAlimentacion.HERBIVORO;
    }

}
