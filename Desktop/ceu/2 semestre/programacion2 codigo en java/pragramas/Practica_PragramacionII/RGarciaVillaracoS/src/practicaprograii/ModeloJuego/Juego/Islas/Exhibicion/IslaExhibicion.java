package practicaprograii.ModeloJuego.Juego.Islas.Exhibicion;

import java.util.Random;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Islas.Islas;
import practicaprograii.ModeloJuego.Juego.NivelADquisitivo.NivelAdquisitivo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class IslaExhibicion extends Islas {

    private int visitantesMaximos;
    private int VisitamtesDeLLegada;
    private int VisitantesDeSalida;
    private int VisitantesAlMes;
    private NivelAdquisitivo nivelAdquisitivo;
    private Dinosaurio InstanciasDinosaurio;

    public IslaExhibicion(int Alimento, int movimientoAlimento, int Hectareas, int VisitantesMaximos, NivelAdquisitivo NivelAdquisitivo) {

        super(Alimento, Hectareas, movimientoAlimento);
        this.visitantesMaximos = VisitantesMaximos;
        this.nivelAdquisitivo = NivelAdquisitivo;
        this.VisitamtesDeLLegada = 0;
        this.VisitantesDeSalida = 0;

    }

    public int Visitantes_al_mes() {
        Random numeroRandom = new Random();
        this.VisitantesAlMes = numeroRandom.nextInt(Integer.MAX_VALUE);
        return VisitantesAlMes;
    }

    public int Visitamtes_Que_entran() {
        //no se como llamara a la instancia Salud De la Clase Dinosaurio
        int VQE = this.VisitamtesDeLLegada;
        int SaludDinosaurios = 100;//no se comocalcularlo
        VQE = ((this.VisitantesAlMes * 1100) / this.hectareas) * SaludDinosaurios;
        return VQE;
    }

    public int Visitantes_Que_Salen() {
        this.Visitamtes_Que_entran();
        int SaludDinosaurios = 100;//no se como calcularlo
        int VSalida = this.VisitantesDeSalida;
        int VisitantesIsla = VSalida - this.Visitamtes_Que_entran();
        int VisitantesQueSalen = ((VisitantesIsla * 1100) / this.hectareas) * SaludDinosaurios;
        return VisitantesQueSalen;

    }

}
