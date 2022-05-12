package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Instalaciones.TipoInstalacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ETH02 extends Exhibicion {

    public ETH02(int SaludDinosaurio, int EdadDinosaurio) {

        super(SaludDinosaurio, EdadDinosaurio, 21000, 2, 200, TipoRecinto.MADERA, TipoMedio.TERRESTRE, TipoAlimentacion.HERBIVORO, TipoInstalacion.EXHIBICION);

    }

}
