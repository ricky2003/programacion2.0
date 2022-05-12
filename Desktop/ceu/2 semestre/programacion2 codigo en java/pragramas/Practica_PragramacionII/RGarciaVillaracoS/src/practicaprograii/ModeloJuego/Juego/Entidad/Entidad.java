package practicaprograii.ModeloJuego.Juego.Entidad;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Entidad {

    private static int contador = 0;
    private int id;

    public Entidad() {
        this.id = contador++;
    }

    public int getId() {
        return id;
    }

}
