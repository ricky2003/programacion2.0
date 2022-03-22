package es.uspceu.gist.progii.galaxianbattle.simulation;

import es.uspceu.gist.progii.galaxianbattle.model.aircrafts.SpaceBattleship;
import es.uspceu.gist.progii.galaxianbattle.utils.CommunicativeObject;

/**
 * This class simulates a space battle between several battleships.
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
public abstract class Battle extends CommunicativeObject {

    protected SpaceBattleship[] battleships;

    /**
     * Simulates the battle and returns the winner/s.
     *
     * @return The winner/s.
     */
    public abstract SpaceBattleship[] run();//las puden invocar todos y pude sobreescribir el codigo desde otros puntos

    /**
     * Declares the winner/s battleship among participants.
     *
     * @return The winner/s
     */
    protected abstract SpaceBattleship[] declareWinner();//poder poder invocar tanto las clases hijas como las padres  y para poder sobre esribir desde otras clases

}
