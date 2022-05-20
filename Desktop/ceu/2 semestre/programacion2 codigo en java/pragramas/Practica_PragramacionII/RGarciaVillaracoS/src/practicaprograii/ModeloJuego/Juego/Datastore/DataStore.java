package practicaprograii.ModeloJuego.Juego.Datastore;

import java.io.Serializable;
import java.util.Map;
import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class DataStore extends Entidad implements Serializable {

    Map<Integer, Entidad> mapadeljuego;

    public int getId(Entidad e) {

        return e.getId();

    }

    public int getDinosaurio(Entidad ed) {
        return ed.getId();

    }

    public int getInstalaciones(Entidad eInst) {
        return eInst.getId();
    }

    public int getIslas(Entidad eIsla) {
        return eIsla.getId();
    }

    public int getEscenarios(Entidad eE) {
        return eE.getId();
    }

}
