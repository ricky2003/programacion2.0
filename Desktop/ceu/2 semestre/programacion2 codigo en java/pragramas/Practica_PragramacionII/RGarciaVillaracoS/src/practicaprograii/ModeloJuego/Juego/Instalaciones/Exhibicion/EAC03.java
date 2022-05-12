package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Instalaciones.TipoInstalacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class EAC03 extends Exhibicion {

    public EAC03(int SaludDinosaurio, int EdadDinosaurio) {
        super(SaludDinosaurio, EdadDinosaurio, 25000, 3, 400, TipoRecinto.VIDRIO, TipoMedio.ACUATICO, TipoAlimentacion.CARNIVORO, TipoInstalacion.EXHIBICION);

    }

}
