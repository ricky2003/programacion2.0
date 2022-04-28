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
public class CVC02 extends Instalaciones {

    public CVC02(int CosteDeContruccion, int UnidadesDeAlimentacion, int NumerosDeEjemplares, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        super(5000, 500, 2, 100, TipoRecinto.ELECTRIFICADO, TipoMedio.VOLADOR, TipoAlimentacion.CARNIVORO, TipoInstalacion.CRIA);
    }

}
