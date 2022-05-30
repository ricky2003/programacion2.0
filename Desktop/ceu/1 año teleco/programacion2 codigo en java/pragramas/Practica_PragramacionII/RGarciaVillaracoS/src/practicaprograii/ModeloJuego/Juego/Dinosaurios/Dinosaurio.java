package practicaprograii.ModeloJuego.Juego.Dinosaurios;

import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
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
    private int nivelDeSalud;
    private int numeroDeFavoritos;

    public Dinosaurio(TipoMedio TipoMedio, TipoAlimentacion TipoAlimentacion, int EdadActual, int EdadQueSeHaceAdulto, int NumeroDeFavoritos, int Apetito) {
        super();//este super te da el id del dinosaurio ;
        this.tipoMedio = TipoMedio;
        this.tipoAlimentacion = TipoAlimentacion;
        this.edadActual = EdadActual;
        this.edadQueSeHaceAdulto = EdadQueSeHaceAdulto;
        this.nivelDeSalud = 100;
        this.numeroDeFavoritos = NumeroDeFavoritos;
        this.CantidadAlimento = 100;
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

    public int getNivelDeSalud() {
        return nivelDeSalud;
    }

    public void setNivelDeSalud(int nivelDESalud) {
        this.nivelDeSalud = nivelDESalud;
    }

    public int edadMensual() {

        return this.edadActual++;

    }

    public void comer(int cantidad) {
        int porcentaje = cantidad * 100 / this.Apetito;

        if (porcentaje < 25) {
            this.nivelDeSalud = this.nivelDeSalud - 30;
        } else if (porcentaje > 25 && porcentaje < 75) {
            this.nivelDeSalud = this.nivelDeSalud - 20;

        } else if (porcentaje > 75 && porcentaje < 100) {
            this.nivelDeSalud = this.nivelDeSalud - 10;
        } else if (porcentaje > 100) {
            this.nivelDeSalud = this.nivelDeSalud + 5;
        }

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

    public int IncremetarFavorito() {
        return this.numeroDeFavoritos++;
    }

    public int getValormedio() {
        int delta = 0;

        if (null != this.getTipoMedio()) {
            switch (this.getTipoMedio()) {
                case ACUATICO:
                    delta = 1;
                    break;
                case TERRESTRE:
                    delta = 15;
                    break;
                case VOLADOR:
                    delta = 30;
                    break;
                default:
                    break;
            }
        }
        return delta;
    }

    @Override
    public String toString() {
        return "Dinosaurio{" + "tipoMedio=" + tipoMedio + ", tipoAlimentacion=" + tipoAlimentacion
                + ", edadActual=" + edadActual + ", edadQueSeHaceAdulto=" + edadQueSeHaceAdulto
                + ", nivelDESalud=" + nivelDeSalud + ", numeroDeFavoritos=" + numeroDeFavoritos
                + ", apetito= " + Apetito + '}';
    }

}
