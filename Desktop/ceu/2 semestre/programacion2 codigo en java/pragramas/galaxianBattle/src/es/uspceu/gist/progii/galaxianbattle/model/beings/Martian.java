package es.uspceu.gist.progii.galaxianbattle.model.beings;

import es.uspceu.gist.progii.galaxianbattle.exceptions.AlreadyDeadException;

/**
 * Martians are warriors from the planet Mars. They are stronger than humans but less smart.
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
public class Martian extends Warrior {

    public static final int DAMAGE_THRESHOLD = 3;

    /**
     * Creates an identified martian.
     *
     * @param id The name
     */
    public Martian(String id) {
        super(WarriorType.MARTIAN, DAMAGE_THRESHOLD, id);
        this.setColor(CYAN);
    }

    /**
     * Creates an anonymous martian.
     */
    public Martian() {
        this("martian.doe");
    }

    @Override
    public boolean shotNotification(int shot) throws AlreadyDeadException {
        boolean died = super.shotNotification(shot);
        return died;
    }
}
