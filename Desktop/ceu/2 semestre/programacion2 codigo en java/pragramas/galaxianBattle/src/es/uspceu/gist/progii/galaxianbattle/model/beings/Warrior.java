package es.uspceu.gist.progii.galaxianbattle.model.beings;

import es.uspceu.gist.progii.galaxianbattle.exceptions.AlreadyDeadException;

/**
 * Warriors are living creatures with abilities for fighting enemies.
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
public abstract class Warrior extends LivingCreature {

    /**
     * Position in which the warrior is defending
     */
    protected int position;
    /**
     * Kind of warrior
     */
    protected final WarriorType type;
    /**
     * Warrior's identifier
     */
    private String id;
    /**
     * Some warriors could be stronger than others (may have an armour!)
     */
    private int damageThreshold;
    /**
     * Higher available value for a position
     */
    public static final int MAX_POSITION = 10;

    /**
     * Creates an anonymous warrior of a given type.
     *
     * @param type Kind of warrior
     * @param damageThreshold Resistance to damage
     */
    public Warrior(WarriorType type, int damageThreshold) {
        super();
        this.type = type;
        this.id = "j.doe";
        this.damageThreshold = damageThreshold;
        this.position = choosePosition();
        this.setColor(YELLOW);
    }

    /**
     * Creates an identified warrior of a given type.
     *
     * @param type Kind of warrior
     * @param damageThreshold Resistance to damage
     * @param id The warrior's identifier
     */
    public Warrior(WarriorType type, int damageThreshold, String id) {
        this(type, damageThreshold);
        this.id = id;
    }

    /**
     * Attacks an enemy (random) position
     *
     * @return Position that has been attacked.
     *
     * @throws AlreadyDeadException If the warrior is already dead.
     */
    public int shoot() throws AlreadyDeadException {
        if (!this.isAlive()) {
            throw new AlreadyDeadException(this);
        }
        int shot = selectTargetForShooting();
        say("Shooting to position: " + shot);
        return shot;
    }

    /**
     * Notifies a new shot has been received. The warrior needs to check if it has been damaged by the shot.
     *
     * @param shot The shot (models the affected position).
     *
     * @return True if the warrior has died, false otherwise
     *
     * @throws AlreadyDeadException If the warrior is already dead.
     */
    public boolean shotNotification(int shot) throws AlreadyDeadException {
        if (!this.isAlive()) {
            throw new AlreadyDeadException(this);
        }
        if (this.position == shot) {
            this.damageThreshold--;
            if (damageThreshold == 0) {
                this.kill();
                say("I'm dead! Position: " + shot);
            }
            else {
                say("I'm hit! Position: " + shot);
            }
        }
        return !(this.isAlive());
    }

    /**
     * Returns this warrior's position.
     *
     * @return The position.
     */
    public int getPosition() {
        return position;
    }

    /**
     * Moves to a position for defending.
     *
     * @param newPosition The new position
     */
    public void move(int newPosition) {
        this.position = newPosition;
        say("Moving to position " + this.position + " for defending.");
    }

    /**
     * Chooses (randomly) the initial position for defending. Position is a random value between (0..MAX_POSITION).
     */
    private int choosePosition() {
        return getRandomPosition();
    }

    /**
     * Chooses a target position for shooting (randomly)
     *
     * @return The position
     */
    protected int selectTargetForShooting() {
        return getRandomPosition();
    }

    /**
     * Selects a random position.
     *
     * @return A random int.
     */
    protected int getRandomPosition() {
        return (int) (Math.random() * (MAX_POSITION + 1));
    }

    /**
     * Shouts a message.
     *
     * @param message The message
     */
    @Override
    protected void say(String message) {
        super.say(id + ":" + type + " -> " + message);
    }

    /**
     * Returns a string representation of a Space Battleship.
     *
     * @return The representation.
     */
    @Override
    public String toString() {
        return id + ":" + type + ", Damage threshold: " + damageThreshold + ", defending at position: " + position;
    }
}
