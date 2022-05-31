package practicaprograii.ModeloJuego.Juego.partida;

import static java.lang.System.exit;
import java.util.ArrayList;
import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Escenario.Escenario;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Partida extends Entidad {

    private Escenario escenario;
    private JugadorTipo jugador;
    private boolean FinPartida;
    private ArrayList<Escenario> Escenarios;

    public Partida(Escenario escenario, JugadorTipo jugador, int id, boolean FinPartida) {
        super();//este super te da el id del jugador ;
        this.escenario = escenario;
        this.jugador = jugador;
        this.FinPartida = FinPartida;
        this.Escenarios = new ArrayList();
    }

    public boolean añadirEscenario(Escenario e) {

        if (hayHueco()) {

            this.Escenarios.add(e);

        } else {

            System.out.println("no hay escenario ");

        }
        return this.Escenarios.add(e);
    }

    public boolean existeEscenario(Escenario e, Entidad id) {
        if (super.equals(id)) {
            this.Escenarios.contains(e);
        } else {
            System.out.println("este escenario no esta en la lista de escenrios");
        }
        return this.Escenarios.contains(e);
    }

    public boolean hayHueco() {
        return this.Escenarios.size() < 3;
    }

    public boolean FinalPardia(Instalacion i) {
        if (i.getDinosauriosDeInsatalacion() == null) {
            exit(0);
        }
        return this.FinPartida;
    }

    /* public static void main(String[] args) {
        Instalacion ins = new Instalacion();
        Mosasaurio m = new Mosasaurio();
        ins.añadirDinosaurio(m);
        System.out.println(ins.getDinosauriosDeInsatalacion());

    }*/
}
