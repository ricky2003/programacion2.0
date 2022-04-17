package practicaprograii.ModeloJuego.JugadorTipo.Dinosaurios;

import practicaprograii.ModeloJuego.JugadorTipo.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.JugadorTipo.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Velocirraptor {

    private int Id;
    private TipoMedio TipoMedio;
    private TipoAlimentacion TipoAlimentacion;
    private int EdadActual, EdadQueSeHaceAdulto/*va por meses*/, NivelDESalud, NumeroDeFavoritos;

    public Velocirraptor(int Id, TipoMedio TipoMedio, TipoAlimentacion TipoAlimentacion, int EdadActual, int EdadQueSeHaceAdulto, int NivelDESalud, int NumeroDeFavoritos) {
        this.Id = Id;
        this.TipoMedio = TipoMedio.TERRESTRE;
        this.TipoAlimentacion = TipoAlimentacion.CARNIVORO;
        this.EdadActual = 0;
        this.EdadQueSeHaceAdulto = 38;
        this.NivelDESalud = 100;
        this.NumeroDeFavoritos = 0;
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
        numeroAleatorio = (int) Math.random() * 100000000;
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
