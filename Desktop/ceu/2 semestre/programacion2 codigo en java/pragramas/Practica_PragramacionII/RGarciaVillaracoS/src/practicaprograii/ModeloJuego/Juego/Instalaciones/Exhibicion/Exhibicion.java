package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Secreta.Secreta;
import practicaprograii.ModeloJuego.Juego.NivelADquisitivo.NivelAdquisitivo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Exhibicion extends Instalacion {

    private NivelAdquisitivo NivelAdquisitivo;
    private TipoMedio TipoMedio;

    public Exhibicion(int numeroDinosaraurio, int CosteDeContruccion, int alimento, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        super(CosteDeContruccion, numeroDinosaraurio, alimento, Hectareas, TipoRecinto, TipoMedio, TipoDeAlimentacion);
    }

    public void trasladaDinosaurio(Dinosaurio d, Secreta is) {
        if (this.existeDinosaurio(d)) {
            if (is.hayHueco()) {
                is.añadirDinosaurio(d);
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
