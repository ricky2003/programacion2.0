package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Instalaciones.TipoInstalacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ETC02 extends Exhibicion {

    public ETC02(int SaludDinosaurio, int EdadDinosaurio) {
        super(SaludDinosaurio, EdadDinosaurio, 12500, 3, 300, TipoRecinto.ELECTRIFICADO, TipoMedio.TERRESTRE, TipoAlimentacion.CARNIVORO, TipoInstalacion.EXHIBICION);

    }

}
