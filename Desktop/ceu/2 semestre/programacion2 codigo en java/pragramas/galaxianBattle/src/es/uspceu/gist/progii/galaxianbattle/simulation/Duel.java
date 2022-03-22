package es.uspceu.gist.progii.galaxianbattle.simulation;

import es.uspceu.gist.progii.galaxianbattle.exceptions.AlreadyDeadException;
import es.uspceu.gist.progii.galaxianbattle.model.aircrafts.SpaceBattleship;

/**
 * This class simulates a space battle between two battleships (duel).
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
public class Duel extends Battle {

    public Duel(SpaceBattleship battleship1, SpaceBattleship battleship2) {
        battleships = new SpaceBattleship[2];
        battleships[0] = battleship1;
        battleships[1] = battleship2;
        this.setColor(GREEN);
    }

    @Override
    public SpaceBattleship[] run() {
        int shooter = 0;
        say("Duel begins! -------------------------------------------------------------------------------------------------------");
        while (stillAlive()) {
            try {
                battleships[shooter % battleships.length].beingShot(battleships[(++shooter % battleships.length)].attackTurn());
            }
            catch (AlreadyDeadException aed) {
            }
        }
        SpaceBattleship[] winners = declareWinner();
        say("Winner: " + winners[0]);
        return winners;
    }

    /**
     * At least, we need one survivor from each battleship in order to continue fighting
     *
     * @return True if all battleships have, at least, one alive crew member. False otherwise.
     */
    private boolean stillAlive() {
        boolean alive = true;
        for (SpaceBattleship battleship : battleships) {
            alive = alive && (battleship.crewRemainAlive() > 0);
        }
        return alive;
    }

    /**
     * Declares the winner battleship among participants.
     *
     * @return This implementation returns the first battleship with alive crew members
     */
    @Override
    protected SpaceBattleship[] declareWinner() {
        SpaceBattleship winner = null;
        for (SpaceBattleship battleship : battleships) {
            if (battleship.crewRemainAlive() != 0) {
                winner = battleship;
                break;
            }
        }
        return new SpaceBattleship[]{winner};
    }

    @Override
    protected void say(String message
    ) {
        super.say("BattleSimulation (Duel) -> " + message
        );
    }
}
