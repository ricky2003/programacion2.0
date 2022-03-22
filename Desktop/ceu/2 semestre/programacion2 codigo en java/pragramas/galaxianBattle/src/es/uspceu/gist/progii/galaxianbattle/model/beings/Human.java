package es.uspceu.gist.progii.galaxianbattle.model.beings;

/**
 * Humans are warriors from the planet Earth. They are weak but very smart.
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
import es.uspceu.gist.progii.galaxianbattle.exceptions.AlreadyDeadException;
import java.util.Arrays;

public class Human extends Warrior {

    private static int[] shots = new int[Warrior.MAX_POSITION + 1];

    /**
     * Creates an identified human.
     *
     * @param id The name
     */
    public Human(String id) {
        super(WarriorType.HUMAN, 1, id);
        Arrays.fill(shots, 0);
        this.setColor(BLUE);
    }

    /**
     * Creates an anonymous human.
     */
    public Human() {
        this("johndoe");
    }

    /**
     * Does the same as super.shotNotification, but also human population is modified if needed.
     */
    @Override
    public boolean shotNotification(int shot) throws AlreadyDeadException {
        boolean died = super.shotNotification(shot);
        return died;
    }

    /**
     * Humans are very smart. They can choose a target in a more elaborate way.
     */
    @Override
    protected int selectTargetForShooting() {
        int disparo;
        do {
            disparo = getRandomPosition();
        }
        while (shots[disparo] >= Martian.DAMAGE_THRESHOLD);
        shots[disparo]++;
        return disparo;
    }
}
