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

    private int costeDeContruccion;
    private int unidadesDeAlimentacion;
    private int numerosDeEjemplares;
    private int hectareas;
    private TipoInstalacion tipoInstalacion;
    private TipoRecinto tipoRecinto;
    private TipoMedio tipoMedio;
    private TipoAlimentacion tipoDeAlimentacion;
    private List<Dinosaurio> poblacion;

    public Instalaciones(int CosteDeContruccion, int UnidadesDeAlimentacion, int NumerosDeEjemplares, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion, TipoInstalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
        this.costeDeContruccion = CosteDeContruccion;
        this.unidadesDeAlimentacion = UnidadesDeAlimentacion;
        this.hectareas = Hectareas;
        this.tipoRecinto = TipoRecinto;
        this.tipoMedio = TipoMedio;
        this.tipoDeAlimentacion = TipoDeAlimentacion;
        this.poblacion = new ArrayList();//disnos que hay en las intalaciones

    }

}
