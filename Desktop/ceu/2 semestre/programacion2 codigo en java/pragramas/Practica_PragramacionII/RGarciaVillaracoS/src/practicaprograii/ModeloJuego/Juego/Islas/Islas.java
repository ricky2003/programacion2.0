package practicaprograii.ModeloJuego.Juego.Islas;

import practicaprograii.ModeloJuego.Juego.Entidad;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Islas extends Entidad {

    public int UnidadAlimento;
    public int MovimientosAlimento;
    public int moendad_Por_Unida_de_Alimento;
    public int hectareas;
    //private ArrayList<Intalacion> InstalacionesDeLaIsla;

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

}
