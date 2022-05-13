package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Instalaciones.TipoInstalacion;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.IslaExhibicion;
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

    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }

    public void setTipoMedio(TipoMedio tipoMedio) {
        this.tipoMedio = tipoMedio;
    }

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(TipoAlimentacion tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public int getCantidadAlimento() {
        return CantidadAlimento;
    }

    public void setCantidadAlimento(int CantidadAlimento) {
        this.CantidadAlimento = CantidadAlimento;
    }

    public int getEdadActual() {
        return edadActual;
    }

    public void setEdadActual(int edadActual) {
        this.edadActual = edadActual;
    }

    public int getApetito() {
        return Apetito;
    }

    public void setApetito(int Apetito) {
        this.Apetito = Apetito;
    }

    public int getEdadQueSeHaceAdulto() {
        return edadQueSeHaceAdulto;
    }

    public void setEdadQueSeHaceAdulto(int edadQueSeHaceAdulto) {
        this.edadQueSeHaceAdulto = edadQueSeHaceAdulto;
    }

    public int getNivelDESalud() {
        return nivelDESalud;
    }

    public void setNivelDESalud(int nivelDESalud) {
        this.nivelDESalud = nivelDESalud;
    }

    public void edadMensual() {

        this.edadActual++;

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

    public int IncremetarFavorito() {
        return this.numeroDeFavoritos++;
    }

    public int getValormedio() {
        int delta = 0;

        if (null != this.getTipoMedio()) {
            switch (this.getTipoMedio()) {
                case ACUATICO:
                    delta = 5;
                    break;
                case TERRESTRE:
                    delta = 15;
                    break;
                case VOLADOR:
                    delta = 25;
                    break;
                default:
                    break;
            }
        }
        return delta;
    }

    public int fav(IslaExhibicion IE) {
        int fav = 10 * this.getEdadQueSeHaceAdulto() * (this.getNivelDESalud() / 100) * IE.ValorAdquisitivo();
        return fav;
    }

    @Override
    public String toString() {
        return "Dinosaurio{" + "tipoMedio=" + tipoMedio + ", tipoAlimentacion=" + tipoAlimentacion + ", edadActual=" + edadActual + ", edadQueSeHaceAdulto=" + edadQueSeHaceAdulto + ", nivelDESalud=" + nivelDESalud + ", numeroDeFavoritos=" + numeroDeFavoritos + ", jugadorTipo=" + jugadorTipo + '}';
    }

}
