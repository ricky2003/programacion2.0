package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Branchiosaurio extends Dinosaurio {

    private int Id;
    private TipoMedio TipoMedio;
    private TipoAlimentacion TipoAlimentacion;
    private int EdadActual, EdadQueSeHaceAdulto/*va por meses*/, NivelDESalud, NumeroDeFavoritos;
    private JugadorTipo JugadorTipo;

    public Branchiosaurio(int Id, TipoMedio TipoMedio, TipoAlimentacion TipoAlimentacion, int EdadActual, int EdadQueSeHaceAdulto, int NivelDESalud, int NumeroDeFavoritos, JugadorTipo JugadorTipo) {
        super(Id, TipoMedio.TERRESTRE, TipoAlimentacion.HERBIVORO, 0, 12, 100, 0, JugadorTipo);

    }

    /**
     *
     * @param numeroAleatorio
     * @return
     *
     *
     */
    public int IngenIDAleatorio(int numeroAleatorio) {
        numeroAleatorio = this.Id;
        numeroAleatorio = (int) (Math.random() * 100000000);
        return numeroAleatorio;

    }

    public int edadMensual(int edad) {
        edad = this.EdadActual;
        for (int i = 0; i <= this.EdadQueSeHaceAdulto; i++) {
            edad = edad + 1;
        }
        return edad;
    }

    public int NivelSalud(int salud) {

        salud = salud--;
        return salud;
    }

    public int Favorito(int fav) {
        //si jugadorTipo le da a favoriyto a este dinosaurio el fav aumeta 1
        //numero de fav== this.NumeroFavoritos;
        /*if (this.JugadorTipo == this.NumeroDeFavoritos) {
            this.NumeroDeFavoritos++;
        }*/
        return fav;
    }

}
