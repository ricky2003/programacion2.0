package practicaprograii.ModeloJuego.Juego.Instalaciones.Cria;

import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class CTH05 extends Cria {

    public CTH05() {
        super(1000, 5, 200, 10, TipoRecinto.MADERA, TipoMedio.TERRESTRE, TipoAlimentacion.HERBIVORO);
    }

}
