package practicaprograii.ModeloJuego.Juego.Escenario;

import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Islas.Crianza.IslaCrianza;
import practicaprograii.ModeloJuego.Juego.Islas.Crianza.Sorna;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.IslaExhibicion;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.Matanceros;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.Nublar;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.SanDiego;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Escenario extends Entidad {

    private int monedasIniciales;
    private int VisitantesIniciales;
    private IslaCrianza islaCrianza;
    private IslaExhibicion islaExhibicion;
    private Sorna sorna;
    private Nublar nublar;
    private SanDiego sanDiego;
    private Matanceros matanceros;

    public Escenario(int monedas, int Visitantes, IslaCrianza c, IslaExhibicion e) {
        super();//este super te da el id del jugador ;
        this.VisitantesIniciales = Visitantes;
        this.monedasIniciales = monedas;
        this.islaCrianza = c;
        this.islaExhibicion = e;

    }

    public int getVisitantesIniciales() {
        return VisitantesIniciales;
    }

    public void setVisitantesIniciales(int VisitantesIniciales) {
        this.VisitantesIniciales = VisitantesIniciales;
    }

    public int getMonedasIniciales() {
        return monedasIniciales;
    }

    public void setMonedasIniciales(int monedasIniciales) {
        this.monedasIniciales = monedasIniciales;
    }

    @Override
    public String toString() {
        return "Escenario{" + "monedasIniciales=" + monedasIniciales
                + ", VisitantesIniciales=" + VisitantesIniciales
                + ", islaCrianza=" + islaCrianza + ", islaExhibicion="
                + islaExhibicion + '}';
    }

}
