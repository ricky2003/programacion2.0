package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Instalaciones.TipoInstalacion;
import practicaprograii.ModeloJuego.Juego.NivelADquisitivo.NivelAdquisitivo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Exhibicion extends Instalacion {

    private NivelAdquisitivo NivelAdquisitivo;
    private TipoMedio TipoMedio;

    public Exhibicion(int SaludDinosaurio, int edadDinosaurio, int CosteDeContruccion, int alimento, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion, TipoInstalacion tipoInstalacion) {
        super(CosteDeContruccion, alimento, Hectareas, TipoRecinto, TipoMedio, TipoDeAlimentacion, tipoInstalacion);
    }

}
