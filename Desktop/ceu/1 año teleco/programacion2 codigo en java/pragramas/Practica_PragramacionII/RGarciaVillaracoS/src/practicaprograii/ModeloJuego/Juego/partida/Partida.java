package practicaprograii.ModeloJuego.Juego.partida;

import java.util.ArrayList;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros.Mosasaurio;
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

    public void añadirEscenario(Escenario e) {
        this.Escenarios.add(e);
    }

    public boolean existeEscenario(Escenario e) {
        return this.Escenarios.contains(e);
    }

    public boolean hayHueco() {
        return this.Escenarios.size() < 3;
    }

    public boolean FinalPardia() {
        if (this.FinPartida = true) {
            // System.out.println("la partida ha terminado");
        }
        return this.FinPartida;
    }

    public static void main(String[] args) {
        Instalacion ins = new Instalacion();
        Mosasaurio m = new Mosasaurio();
        ins.añadirDinosaurio(m);
        System.out.println(ins.getDinosauriosDeInsatalacion());

    }

}
