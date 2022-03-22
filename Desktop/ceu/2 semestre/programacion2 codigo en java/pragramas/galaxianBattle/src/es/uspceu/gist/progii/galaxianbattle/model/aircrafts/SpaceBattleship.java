package es.uspceu.gist.progii.galaxianbattle.model.aircrafts;

import es.uspceu.gist.progii.galaxianbattle.exceptions.AlreadyDeadException;
import es.uspceu.gist.progii.galaxianbattle.model.beings.*;
import es.uspceu.gist.progii.galaxianbattle.utils.CommunicativeObject;

/**
 * A space battleship is a spacecraft manned by several warriors.
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
public class SpaceBattleship extends CommunicativeObject {

    /**
     * Battleship's identifier
     */
    private String id;
    private Warrior[] crew;
    private WarriorType crewType;
    private int population = 0;

    /**
     * Creates a new space battleship and assigns a crew for it.
     *
     * @param crewType Kind of crew members.
     * @param crew The crew of this spacecraft.
     */
    public SpaceBattleship(WarriorType crewType, Warrior[] crew, String id) {
        this.crewType = crewType;
        this.crew = crew;
        this.population = crew.length;
        this.id = id;
        this.setColor(PURPLE);
        this.say("Created with " + population + " crew members.");
    }

    /**
     * Creates a new space battleship with all its crew
     *
     * @param crewType Kind of crew members
     * @param crewNumber Number of crew members
     */
    public SpaceBattleship(WarriorType crewType, int crewNumber, String id) {
        this.crewType = crewType;
        crew = new Warrior[crewNumber];
        for (int i = 0; i < crewNumber; i++) {
            switch (this.crewType) {
                case HUMAN:
                    crew[i] = new Human("Human" + i);
                    break;
                case MARTIAN:
                    crew[i] = new Martian("Martian" + i);
            }
        }
        this.population = crewNumber;
        this.id = id;
        this.setColor(PURPLE);
        this.say("Created with " + population + " crew members.");
    }

    /**
     * Checks if any of the crew members has been damaged.
     *
     * @param shot The attacked position
     *
     * @return Number of dead crew members caused by this attack.
     */
    public int beingShot(int shot) {
        int deadMembers = 0;
        for (Warrior member : crew) {
            try {
                if (member.shotNotification(shot)) {
                    population--;
                    deadMembers++;
                }
            } catch (AlreadyDeadException ade) {
            }
        }
        say("A shot has been received. Damage " + deadMembers + " dead crew members. Only "
                + population + " crew members remain alive.");
        return deadMembers;
    }

    public int orderForShooting(int crewMember) throws AlreadyDeadException {
        return crew[crewMember].shoot();
    }

    public int crewRemainAlive() {
        return this.population;
    }

    /**
     * In its attack turn, a battleship selects the crew shooter and the
     * position which will be attacked.
     *
     * @return The position to be attacked.
     */
    public int attackTurn() {
        int position = -1;
        int next = 0;
        while (position == -1) {
            Warrior member = crew[next++];
            if (member.isAlive()) {
                position = member.shoot();//elige una posicion
            }
        }
        return position;
    }

    /**
     * Shouts a message.
     *
     * @param message The message
     */
    @Override
    protected void say(String message) {
        super.say("Space BattleShip " + id + " (" + crewType + ") -> " + message);
    }

    /**
     * Returns a string representation of a Space Battleship.
     *
     * @return The representation.
     */
    @Override
    public String toString() {
        return "Space BattleShip " + id + " (" + crewType + "), alive crew members: " + population;
    }
}
