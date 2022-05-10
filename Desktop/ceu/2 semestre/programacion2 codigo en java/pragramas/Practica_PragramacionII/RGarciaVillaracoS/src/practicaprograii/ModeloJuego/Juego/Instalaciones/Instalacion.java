package practicaprograii.ModeloJuego.Juego.Instalaciones;

import java.util.ArrayList;
import java.util.List;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Entidad;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Instalacion extends Entidad {

    public int MovimientosAlimento;
    public int moendad_Por_Unida_de_Alimento;
    private int costeDeContruccion;
    private int unidadesAlimentacion;
    private int numerosDeEjemplares;
    private int hectareas;
    private TipoInstalacion tipoInstalacion;
    private TipoRecinto tipoRecinto;
    private TipoMedio tipoMedio;
    private TipoAlimentacion tipoDeAlimentacion;
    private List<Dinosaurio> poblacion;

    public Instalacion(int CosteDeContruccion, int NumerosDeEjemplares, int alimento, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion, TipoInstalacion tipoInstalacion) {
        super();//este super te da el id del jugador ;
        this.tipoInstalacion = tipoInstalacion;
        this.costeDeContruccion = CosteDeContruccion;
        this.hectareas = Hectareas;
        this.tipoRecinto = TipoRecinto;
        this.tipoMedio = TipoMedio;
        this.tipoDeAlimentacion = TipoDeAlimentacion;
        this.unidadesAlimentacion = alimento;
        this.moendad_Por_Unida_de_Alimento = 5;
        this.poblacion = new ArrayList();//disnos que hay en las intalaciones

    }

}
