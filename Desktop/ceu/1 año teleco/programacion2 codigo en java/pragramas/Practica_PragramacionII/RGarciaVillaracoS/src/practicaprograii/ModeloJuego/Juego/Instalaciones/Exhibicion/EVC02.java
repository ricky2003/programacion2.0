package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class EVC02 extends Exhibicion {

    public EVC02() {
        super(15000, 0, 2, 200, TipoRecinto.ELECTRIFICADO, TipoMedio.ACUATICO, TipoAlimentacion.CARNIVORO);
    }

}
