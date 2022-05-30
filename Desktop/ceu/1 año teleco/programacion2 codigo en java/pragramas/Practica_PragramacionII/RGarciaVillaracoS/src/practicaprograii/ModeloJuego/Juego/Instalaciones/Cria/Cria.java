package practicaprograii.ModeloJuego.Juego.Instalaciones.Cria;

import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion.Exhibicion;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Cria extends Instalacion {

    public Cria(int CosteDeContruccion, int numerosDeEjemplares, int alimento, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        super(CosteDeContruccion, numerosDeEjemplares, alimento, Hectareas, TipoRecinto, TipoMedio, TipoDeAlimentacion);
    }

}
