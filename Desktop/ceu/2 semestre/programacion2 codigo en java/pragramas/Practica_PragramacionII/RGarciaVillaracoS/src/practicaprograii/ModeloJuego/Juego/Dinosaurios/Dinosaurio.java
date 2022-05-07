package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import java.util.Random;
import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Dinosaurio {
//variables en minusculas;

    private int id;
    private TipoMedio tipoMedio;
    private TipoAlimentacion tipoAlimentacion;
    private int edadActual;
    private int edadQueSeHaceAdulto/*va por meses*/;
    public int nivelDESalud;
    private int numeroDeFavoritos;
    private JugadorTipo jugadorTipo;

    public Dinosaurio(TipoMedio TipoMedio, TipoAlimentacion TipoAlimentacion, int EdadActual, int EdadQueSeHaceAdulto, int NivelDESalud, int NumeroDeFavoritos, JugadorTipo JugadorTipo) {
        this.id = IngenIDAleatorio();
        this.tipoMedio = TipoMedio;
        this.tipoAlimentacion = TipoAlimentacion;
        this.edadActual = EdadActual;
        this.edadQueSeHaceAdulto = EdadQueSeHaceAdulto;
        this.nivelDESalud = NivelDESalud;
        this.numeroDeFavoritos = NumeroDeFavoritos;
        this.jugadorTipo = JugadorTipo;
    }

    public int IngenIDAleatorio() {
        Random random = new Random();

        this.id = random.nextInt(Integer.MAX_VALUE);
        return this.id;

    }

    public int edadMensual() {
        int edad;
        edad = this.edadActual;
        for (int i = 0; i <= this.edadQueSeHaceAdulto; i++) {
            edad = edad + 1;
        }
        return edad;
    }

    public int NivelSalud() {

        int salud = 0;
        salud = salud--;
        return salud;
    }

    public int Favorito(int fav) {
        //si jugadorTipo le da a favoriyto a este dinosaurio el fav aumeta 1
        //numero de fav== this.NumeroFavoritos;
        /*if (this.jugadorTipo == this.numeroDeFavoritos) {
            this.numeroDeFavoritos++;
        }*/
        return fav;
    }

}
