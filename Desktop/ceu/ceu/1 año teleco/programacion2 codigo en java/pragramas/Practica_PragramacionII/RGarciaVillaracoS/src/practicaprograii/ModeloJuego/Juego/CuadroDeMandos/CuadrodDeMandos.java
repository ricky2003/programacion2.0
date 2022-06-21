package practicaprograii.ModeloJuego.Juego.CuadroDeMandos;

import java.util.List;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Islas.Islas;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class CuadrodDeMandos {

    List<String> Partidas;

    public CuadrodDeMandos(List<String> Partidas) {
        this.Partidas = Partidas;
    }

    public void ImprimeListaInstalacionesIslas(Islas i) {

        System.out.println("las instalaciones de las islas son :" + i.getInstalacionesDeLaIsla());
    }

    public void ImprimeTodosLosDinosaurios(Instalacion in) {
        System.out.println("las instalaciones de las islas son :" + in.getDinosauriosDeInsatalacion());

    }

    public List<String> getPartidas() {
        return Partidas;
    }

    public void setPartidas(List<String> Partidas) {
        this.Partidas = Partidas;
    }

}
