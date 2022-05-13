package practicaprograii.ModeloJuego.Juego.Islas;

import java.util.ArrayList;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Islas extends Entidad {

    public int UnidadAlimento;
    public int MovimientosAlimento;
    public int moendad_Por_Unida_de_Alimento;
    public int hectareas;
    private ArrayList<Instalacion> InstalacionesDeLaIsla;

    public Islas(int UnidadAlimento, int hectareas, int MovimietosAlimento) {
        super();//este super te da el id del jugador ;
        this.UnidadAlimento = UnidadAlimento;
        this.moendad_Por_Unida_de_Alimento = 5;
        this.MovimientosAlimento = MovimietosAlimento;
        this.hectareas = hectareas;
        //this.InstalacionesDeLaIsla = new ArrayList();
    }

    public int UnidadesDeAlimento() {
        return this.UnidadAlimento = this.hectareas * 3;
    }

    public int MovimietosAlimento() {
        return this.MovimientosAlimento = this.UnidadAlimento / 4;
    }

    public void añadirIstalacion() {
        //forEach;
        for (Instalacion i : this.InstalacionesDeLaIsla) {
            this.InstalacionesDeLaIsla.add(i);
        }

    }

    public int DonacionFav(Dinosaurio d) {
        int DonFav;
        DonFav = 100 * (int) Math.pow(3, d.getEdadActual() - d.getEdadQueSeHaceAdulto()) * d.getValormedio();
        return DonFav;
    }

}
