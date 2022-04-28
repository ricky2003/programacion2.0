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
public class CTC03 extends Instalaciones {

    public CTC03() {
        super(2500, 300, 3, 50, TipoRecinto.ELECTRIFICADO, TipoMedio.TERRESTRE, TipoAlimentacion.CARNIVORO, TipoInstalacion.CRIA);

    }

}
