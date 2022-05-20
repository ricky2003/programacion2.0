package practicaprograii.ModeloJuego.Juego.partida;

import java.util.ArrayList;
import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Escenario.Escenario;
import practicaprograii.ModeloJuego.Juego.Escenario.JurassicPark;
import practicaprograii.ModeloJuego.Juego.Escenario.JurassicParkSanDiego;
import practicaprograii.ModeloJuego.Juego.Escenario.JurassicWorld;
import practicaprograii.ModeloJuego.Juego.Jugador.JugadorTipo;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Partida extends Entidad {

    private Escenario escenario;
    private JugadorTipo jugador;
    private boolean FinPartida;
    private ArrayList<Escenario> Ecenarios;

    public Partida(Escenario escenario, JugadorTipo jugador, int id, boolean FinPartida) {
        super();//este super te da el id del jugador ;
        this.escenario = escenario;
        this.jugador = jugador;
        this.FinPartida = FinPartida;
        this.Ecenarios = new ArrayList();
    }

    public void añadirEscenario(Escenario e) {
        this.Ecenarios.add(e);
    }

    public boolean existeEscenario(Escenario e) {
        return this.Ecenarios.contains(e);
    }

    public boolean hayHueco() {
        return this.Ecenarios.size() < 3;
    }

    public boolean FinalPardia() {
        if (this.FinPartida = true) {
            System.out.println("la partida ha terminado");
        }
        return this.FinPartida;
    }

    public void SeleccionEscenario(Escenario e, JurassicPark Jp, JurassicParkSanDiego Jpd, JurassicWorld Jw) {

        int numero = 0;
        System.out.println("escribe un numero= " + numero);
        switch (numero) {
            case 1:
                e.getEscenario(Jp);
            case 2:
                e.getEscenario(Jpd);
            case 3:
                e.getEscenario(Jw);
        }

    }

}
