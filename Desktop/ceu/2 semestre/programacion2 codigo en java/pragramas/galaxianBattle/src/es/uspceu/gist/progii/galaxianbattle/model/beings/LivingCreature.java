package es.uspceu.gist.progii.galaxianbattle.model.beings;

import es.uspceu.gist.progii.galaxianbattle.exceptions.AlreadyDeadException;
import es.uspceu.gist.progii.galaxianbattle.utils.CommunicativeObject;

/**
 * A Living creature is a being with vital status.
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
public abstract class LivingCreature extends CommunicativeObject {

    /**
     * Vital status.
     */
    private boolean alive;

    /**
     * Creates a living creature.
     */
    public LivingCreature() {
        this.alive = true;
    }

    /**
     * Kills a living creature.
     *
     * @throws AlreadyDeadException If the creature is already dead.
     */
    protected void kill() throws AlreadyDeadException {
        if (!this.alive) {
            throw new AlreadyDeadException(this);
        }
        this.alive = false;
    }

    /**
     * Returns the creature's vital status.
     *
     * @return True if it is alive and false otherwise.
     */
    public boolean isAlive() {
        return alive;
    }
}
