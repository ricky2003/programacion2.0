package practicaprograii.ModeloJuego.Juego.Instalaciones.Cria;

import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Instalaciones.TipoInstalacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Cria extends Instalacion {

    private int numeroDeEjemplares;

    public Cria(int CosteDeContruccion, int numerosDeEjemplares, int alimento, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion, TipoInstalacion tipoInstalacion) {
        super(CosteDeContruccion, alimento, Hectareas, TipoRecinto, TipoMedio, TipoDeAlimentacion, tipoInstalacion);
        this.numeroDeEjemplares = numerosDeEjemplares;
    }

    public int Nacimento() {
        //no esta terminado mirar los apuntes
        int i = 0;
        if (i < this.numeroDeEjemplares) {
            i++;
        }
        return i;
    }

}
