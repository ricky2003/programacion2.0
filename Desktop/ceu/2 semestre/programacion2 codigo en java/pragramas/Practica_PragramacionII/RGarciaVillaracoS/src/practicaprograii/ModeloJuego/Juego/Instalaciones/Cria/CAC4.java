package practicaprograii.ModeloJuego.Juego.Instalaciones.Cria;

import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalaciones;
import practicaprograii.ModeloJuego.Juego.Instalaciones.TipoInstalacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class CAC4 extends Instalaciones {

    public CAC4() {
        super(3500, 100, 4, 25, TipoRecinto.VIDRIO, TipoMedio.ACUATICO, TipoAlimentacion.CARNIVORO, TipoInstalacion.CRIA);

    }

}
