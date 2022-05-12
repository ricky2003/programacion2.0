package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Instalaciones.TipoInstalacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class EVC02 extends Exhibicion {

    public EVC02(int SaludDinosaurio, int EdadDinosaurio) {
        super(SaludDinosaurio, EdadDinosaurio, 15000, 2, 200, TipoRecinto.ELECTRIFICADO, TipoMedio.ACUATICO, TipoAlimentacion.CARNIVORO, TipoInstalacion.EXHIBICION);
    }

}
