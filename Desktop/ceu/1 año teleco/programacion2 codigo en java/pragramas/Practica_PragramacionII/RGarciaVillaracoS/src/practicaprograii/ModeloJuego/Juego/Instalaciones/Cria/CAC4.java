package practicaprograii.ModeloJuego.Juego.Instalaciones.Cria;

import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class CAC4 extends Cria {

    public CAC4() {
        super(3500, 100, 4, 25, TipoRecinto.VIDRIO, TipoMedio.ACUATICO, TipoAlimentacion.CARNIVORO);

    }

    public static void main(String[] args) {
        CAC4 ca = new CAC4();
        System.out.println("" + ca);
    }

}
