package practicaprograii.ModeloJuego.Juego.Jugador;

import practicaprograii.ModeloJuego.Juego.CuadroDeMandos.CuadrodDeMandos;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Escenario.Escenario;
import practicaprograii.ModeloJuego.Juego.Excepciones.Excepcioines;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Cria.*;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion.*;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Islas.Crianza.IslaCrianza;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.*;
import practicaprograii.ModeloJuego.Juego.Islas.Islas;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JugadorTipo extends Entidad {

    private IslaCrianza Crianza;
    private IslaExhibicion Exhibicion;
    private int monedasQueTienes;
    private CuadrodDeMandos CuadroDeMandos;

    public JugadorTipo(String Alias, IslaCrianza IslaCrianza, IslaExhibicion IslaExhibicion) {
        super();//este super te da el id del jugador ;
        this.Crianza = IslaCrianza;
        this.Exhibicion = IslaExhibicion;

    }

    public int fav(Dinosaurio d) {
        int fav = 10 * d.getEdadQueSeHaceAdulto() * (d.getNivelDeSalud() / 100) * this.Exhibicion.ValorAdquisitivo();
        return fav;
    }

    public void TrasladoComidaIslaInstalacion(Islas i, Instalacion ins, int cantidad) {
        int trasladar = 0;
        if (this.monedasQueTienes > 0) {
            i.trasladarComidaAInstalacion(cantidad, ins);
            trasladar = trasladar - cantidad;
        } else {
            //
        }

    }

    public void AñadirInstalacionAIslaExhibicion(Islas i, Instalacion ins) {
        if (this.monedasQueTienes >= ins.getCosteDeContruccion()) {
            i.añadirIstalacion(ins);
            this.monedasQueTienes = this.monedasQueTienes - ins.getCosteDeContruccion();
        }
    }

    public void trasladoDinosaurio(Dinosaurio d, Exhibicion ie, Cria ic, Escenario e) throws Excepcioines {

        int coste = 100 * (int) Math.pow(3, d.getEdadActual() - d.getEdadQueSeHaceAdulto()) * d.getValormedio();
        if (coste <= this.monedasQueTienes) {
            ic.trasladaDinosaurio(d, ie);

        }

        if (d.getNivelDeSalud() <= 75) {
            throw new Excepcioines();

        } else if (ie.Full()) {
            throw new Excepcioines();
        } else if (e.getMonedasIniciales() < coste) {
            throw new Excepcioines();
        }

    }

}
