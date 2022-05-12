package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Instalaciones.TipoInstalacion;
import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Dinosaurio extends Entidad {
//variables en minusculas;

    private TipoMedio tipoMedio;
    private TipoAlimentacion tipoAlimentacion;
    private int CantidadAlimento;
    private int edadActual;
    private int Apetito;
    private int edadQueSeHaceAdulto/*va por meses*/;
    public int nivelDESalud;
    private int numeroDeFavoritos;
    private JugadorTipo jugadorTipo;
    private TipoInstalacion tipoInstalacion;

    public Dinosaurio(TipoMedio TipoMedio, TipoAlimentacion TipoAlimentacion, int EdadActual, int EdadQueSeHaceAdulto, int NivelDESalud, int NumeroDeFavoritos, int Apetito, JugadorTipo JugadorTipo) {
        super();//este super te da el id del dinosaurio ;
        this.tipoMedio = TipoMedio;
        this.tipoAlimentacion = TipoAlimentacion;
        this.edadActual = EdadActual;
        this.edadQueSeHaceAdulto = EdadQueSeHaceAdulto;
        this.nivelDESalud = NivelDESalud;
        this.numeroDeFavoritos = NumeroDeFavoritos;
        this.jugadorTipo = JugadorTipo;
        this.CantidadAlimento = 100;//no se como hacer variar este parametro ;
        this.Apetito = Apetito;
    }

    public int edadMensual() {
        int edad;
        edad = this.edadActual;
        for (int i = 0; i <= this.edadQueSeHaceAdulto; i++) {
            edad = edad + 1;
        }
        return edad;
    }

    public int Apetito() {
        int edad = this.edadActual;
        int CantidadIngerir = 0;

        if (edad < this.edadQueSeHaceAdulto) {
            CantidadIngerir = this.Apetito * this.edadActual;
        } else if (edad == this.edadQueSeHaceAdulto) {
            CantidadIngerir = this.Apetito * 2 ^ (this.edadActual - this.edadQueSeHaceAdulto) * 1;
        } else {
            CantidadIngerir = this.Apetito * 2 ^ (2 * this.edadQueSeHaceAdulto) * 1;
        }
        return CantidadIngerir;
    }

    public int NivelSalud() {
        //la cantidad de laimento sera simepre 100 porque no se como cambiarlo ;
        int salud = 100;
        salud = salud--;
        return salud;
    }

    public int Favorito() {
        int fav = 0;
        fav = fav + this.numeroDeFavoritos;
        return fav;
    }

    @Override
    public String toString() {
        return "Dinosaurio{" + "tipoMedio=" + tipoMedio + ", tipoAlimentacion=" + tipoAlimentacion + ", edadActual=" + edadActual + ", edadQueSeHaceAdulto=" + edadQueSeHaceAdulto + ", nivelDESalud=" + nivelDESalud + ", numeroDeFavoritos=" + numeroDeFavoritos + ", jugadorTipo=" + jugadorTipo + '}';
    }

}
