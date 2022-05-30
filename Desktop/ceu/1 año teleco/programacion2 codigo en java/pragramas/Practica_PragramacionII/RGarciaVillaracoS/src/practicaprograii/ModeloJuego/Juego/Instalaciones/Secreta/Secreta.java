package practicaprograii.ModeloJuego.Juego.Instalaciones.Secreta;

import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Secreta extends Instalacion {

    public Secreta(int CosteDeContruccion, int numeroDinosaurio, int alimento, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        super(20000, numeroDinosaurio, alimento, Hectareas, TipoRecinto, TipoMedio, TipoDeAlimentacion);
    }

}
