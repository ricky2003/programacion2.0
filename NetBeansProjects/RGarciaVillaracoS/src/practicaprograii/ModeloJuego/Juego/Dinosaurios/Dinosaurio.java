package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Dinosaurio {

    private int Id;
    private TipoMedio TipoMedio;
    private TipoAlimentacion TipoAlimentacion;
    private int EdadActual, EdadQueSeHaceAdulto/*va por meses*/, NivelDESalud, NumeroDeFavoritos;
    private JugadorTipo JugadorTipo;

    public Dinosaurio(int Id, TipoMedio TipoMedio, TipoAlimentacion TipoAlimentacion, int EdadActual, int EdadQueSeHaceAdulto, int NivelDESalud, int NumeroDeFavoritos, JugadorTipo JugadorTipo) {
        this.Id = Id;
        this.TipoMedio = TipoMedio;
        this.TipoAlimentacion = TipoAlimentacion;
        this.EdadActual = EdadActual;
        this.EdadQueSeHaceAdulto = EdadQueSeHaceAdulto;
        this.NivelDESalud = NivelDESalud;
        this.NumeroDeFavoritos = NumeroDeFavoritos;
        this.JugadorTipo = JugadorTipo;
    }

}
