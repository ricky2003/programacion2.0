package practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion;

import java.util.ArrayList;
import java.util.List;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Instalaciones.TipoInstalacion;
import practicaprograii.ModeloJuego.Juego.NivelADquisitivo.NivelAdquisitivo;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Exhibicion extends Instalacion {

    private List<Dinosaurio> poblacion;
    private NivelAdquisitivo NivelAdquisitivo;
    private TipoMedio TipoMedio;
    private int edadAdultoDinosaurio;
    private int SaludDinosaurio;
    private int EdadDinosaurio;

    public Exhibicion(int SaludDinosaurio, int edadDinosaurio, int CosteDeContruccion, int alimento, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion, TipoInstalacion tipoInstalacion) {
        super(CosteDeContruccion, alimento, Hectareas, TipoRecinto, TipoMedio, TipoDeAlimentacion, tipoInstalacion);
        this.poblacion = new ArrayList();//disnos que hay en las intalaciones
        this.edadAdultoDinosaurio = edadDinosaurio;
        this.SaludDinosaurio = SaludDinosaurio;
        this.EdadDinosaurio = 0;

    }

    public int EdadDinosaruio() {
        int i = 0;
        i++;

        return i;
    }

    public int saludDinosaurio() {
        int i = 100;
        i--;
        return i;
    }

    public int ValorAdquisitivo() {
        int fi = 0;
        NivelAdquisitivo NA1 = NivelAdquisitivo.BAJO;
        NivelAdquisitivo NA2 = NivelAdquisitivo.MEDIO;
        NivelAdquisitivo NA3 = NivelAdquisitivo.ALTO;
        if (this.NivelAdquisitivo == NA1) {
            fi = 1;

        } else if (this.NivelAdquisitivo == NA2) {
            fi = 15;
        } else if (this.NivelAdquisitivo == NA3) {
            fi = 30;
        }
        return fi;
    }

    public int medio() {
        int delta = 0;
        TipoMedio T1 = TipoMedio.ACUATICO;
        TipoMedio T2 = TipoMedio.TERRESTRE;
        TipoMedio T3 = TipoMedio.VOLADOR;

        if (this.TipoMedio == T1) {
            delta = 5;
        } else if (this.TipoMedio == T2) {
            delta = 15;
        } else if (this.TipoMedio == T3) {
            delta = 25;
        }
        return delta;
    }

    public int DonacionFav() {
        int DonFav = 100 * 3 ^ (this.EdadDinosaruio() - this.edadAdultoDinosaurio) * this.medio();
        return DonFav;
    }

    public int fav() {
        int fav = 10 * this.edadAdultoDinosaurio * (this.SaludDinosaurio / 100) * this.ValorAdquisitivo();
        return fav;
    }

}
