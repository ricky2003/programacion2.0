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

    public void trasladaDinosaurio(Dinosaurio d, Exhibicion ie) {
        if (this.existeDinosaurio(d)) {
            if (ie.hayHueco()) {
                ie.añadirDinosaurio(d);
                this.ElimnacionDinosaurio(d);
            } else {
                //excepcion
            }
        } else {
            //excepcion
        }
        //Si esta miro si hay sitio en exhibicion si es asi lo muevo (lo quito de esta instalacion y lo anado en exhibicion.
    }
}
