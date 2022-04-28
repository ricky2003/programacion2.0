package practicaprograii.ModeloJuego.Juego.Instalaciones;

import java.util.ArrayList;
import java.util.List;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Instalaciones {

    private final int costeDeContruccion;
    private final int unidadesDeAlimentacion;
    private final int numerosDeEjemplares;
    private final int hectareas;
    private final TipoInstalacion tipoInstalacion;
    private final TipoRecinto tipoRecinto;
    private final TipoMedio tipoMedio;
    public final TipoAlimentacion tipoDeAlimentacion;
    private final List<Dinosaurio> poblacion;

    public Instalaciones(int CosteDeContruccion, int UnidadesDeAlimentacion, int NumerosDeEjemplares, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion, TipoInstalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
        this.costeDeContruccion = CosteDeContruccion;
        this.unidadesDeAlimentacion = UnidadesDeAlimentacion;
        this.numerosDeEjemplares = NumerosDeEjemplares;
        this.hectareas = Hectareas;
        this.tipoRecinto = TipoRecinto;
        this.tipoMedio = TipoMedio;
        this.tipoDeAlimentacion = TipoDeAlimentacion;
        this.poblacion = new ArrayList();//disnos que hay en las intalaciones

    }

}
