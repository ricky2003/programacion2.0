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

    public Escenario(int monedas, int Visitantes) {
        super();//este super te da el id del jugador ;
        this.VisitantesIniciales = Visitantes;
        this.monedasIniciales = monedas;
    }

    public Sorna getSorna() {
        Sorna s = new Sorna();
        return s;
    }

    public void setSorna(Sorna sorna) {
        this.sorna = sorna;
    }

    public Nublar getNublar() {
        Nublar n = new Nublar();
        return n;
    }

    public void setNublar(Nublar nublar) {
        this.nublar = nublar;
    }

    public SanDiego getSanDiego() {
        SanDiego sd = new SanDiego();
        return sd;
    }

    public void setSanDiego(SanDiego sanDiego) {
        this.sanDiego = sanDiego;
    }

    public Matanceros getMatanceros() {
        Matanceros m = new Matanceros();
        return m;
    }

    public void setMatanceros(Matanceros matanceros) {
        this.matanceros = matanceros;
    }

    public IslaCrianza getIslaCrianzaD() {
        Escenario Escenario = null;
        IslaCrianza ic = null;

        if (Escenario == new JurassicPark()) {

            ic = sorna;

        } else if (Escenario == new JurassicParkSanDiego()) {

            ic = sorna;

        } else if (Escenario == new JurassicWorld()) {

            ic = sorna;

        }
        return islaCrianza;
    }

    public IslaExhibicion getEscenarioIslaExhibicion() {
        Escenario Escenario = null;
        IslaExhibicion ie = null;

        if (Escenario == new JurassicPark()) {

            ie = nublar;

        } else if (Escenario == new JurassicParkSanDiego()) {

            ie = sanDiego;

        } else if (Escenario == new JurassicWorld()) {

            ie = matanceros;

        }

        return ie;
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
