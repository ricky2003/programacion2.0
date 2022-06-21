package practicaprograii.ModeloJuego.Juego.Instalaciones.Cria;

import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class CVC02 extends Cria {

    public CVC02() {
        super(5000, 2, 500, 100, TipoRecinto.ELECTRIFICADO, TipoMedio.VOLADOR, TipoAlimentacion.CARNIVORO);
    }

}
