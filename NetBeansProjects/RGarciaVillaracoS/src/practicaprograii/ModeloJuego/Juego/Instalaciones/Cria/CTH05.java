package practicaprograii.ModeloJuego.Juego.Instalaciones.Cria;

import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class CTH05 {

    private final int CosteDeContruccion;
    private final int UnidadesDeAlimentacion;
    private final int NumerosDeEjemplares;
    private final int Hectareas;
    private final TipoRecinto TipoRecinto;
    private final TipoMedio TipoMedio;
    private final TipoAlimentacion TipoDeAlimentacion;

    public CTH05(int CosteDeContruccion, int UnidadesDeAlimentacion, int NumerosDeEjemplares, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        this.CosteDeContruccion = 1000;
        this.UnidadesDeAlimentacion = 200;
        this.NumerosDeEjemplares = 5;
        this.Hectareas = 10;
        this.TipoRecinto = TipoRecinto.MADERA;
        this.TipoMedio = TipoMedio.TERRESTRE;
        this.TipoDeAlimentacion = TipoAlimentacion.HERBIVORO;
    }

}
