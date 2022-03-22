package es.uspceu.gist.progii.galaxianbattle.exceptions;

import es.uspceu.gist.progii.galaxianbattle.model.beings.LivingCreature;

/**
 * Raises when a dead creature is asked to do something
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
public class AlreadyDeadException extends RuntimeException {

    private final LivingCreature creature;

    public AlreadyDeadException(LivingCreature creature) {
        this.creature = creature;
    }

    public LivingCreature getCreature() {
        return this.creature;
    }

    @Override
    public String toString() {
        return "AlreadyDeadException: I'm already dead " + this.creature;
    }
}
