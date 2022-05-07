package practicaprograii.ModeloJuego.Juego.Islas;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Islas extends Alimento {

    public int UnidadAlimento;
    public int MovimientosAlimento;
    public int hectareas;

    //private List<Dinosaurio> DinosauriosIsla;
    public Islas(int UnidadAlimento, int hectareas, int MovimietosAlimento) {
        super(UnidadAlimento, MovimietosAlimento);
        this.hectareas = hectareas;
        //DinosauriosIsla = new DinosauriosIsla();
    }

    public int UnidadesDeAlimento() {
        return this.UnidadAlimento = this.hectareas * 3;
    }

    public int MovimietosAlimento() {
        return this.MovimientosAlimento = this.UnidadAlimento / 4;
    }

}
