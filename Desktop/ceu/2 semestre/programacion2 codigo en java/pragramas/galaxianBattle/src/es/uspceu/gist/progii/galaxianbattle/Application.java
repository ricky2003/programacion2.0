package es.uspceu.gist.progii.galaxianbattle;

import es.uspceu.gist.progii.galaxianbattle.model.aircrafts.SpaceBattleship;
import es.uspceu.gist.progii.galaxianbattle.model.beings.WarriorType;
import es.uspceu.gist.progii.galaxianbattle.simulation.Duel;

/**
 * Galaxian Battle
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
public class Application {

    public static void main(String[] args) {

        Duel battle = new Duel(
                new SpaceBattleship(WarriorType.MARTIAN, 10, "EstrellaDeLaMuerte"),
                new SpaceBattleship(WarriorType.HUMAN, 10, "HalconMilenario")
        );
        SpaceBattleship[] winners = battle.run();
    }
}
