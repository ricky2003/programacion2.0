package EjerciciosTema03.ejercicio05.Main;

import EjerciciosTema03.ejercicio05.Contraseña.Contraseña;

/**
 * Ahora, crea una clase clase ejecutable que haga lo siguiente: • Cree un array
 * de Passwords con el tamaño que tú le indiques por teclado. Cree un bucle que
 * cree un objeto para cada posición del array. Indica por teclado la longitud
 * de cada password. • Cree otro array de booleanos donde se almacene si el
 * password del array de Password es o no fuerte (usa el bucle anterior). • Al
 * final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa
 * este simple formato: contraseña1 : valor_booleano1 contraseña2 :
 * valor_bololeano2 //hay algo que hace que la contraseña no sea random todo el
 * rato sino que te dice una y se repiute todas las veces la misma ;
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Main {

    public static void main(String[] args) {
        int dimension = practicaprograii.ModeloJuego.Juego.utilidades.utilidades.LeeEntero("escribe un numero para la longitud");
        Contraseña ArrayPaswords[] = new Contraseña[dimension];
        Contraseña ArrayBooleano[] = new Contraseña[dimension];

        boolean esFuerte = Contraseña.esFuerte(dimension);
        for (int i = 0; i <= 10; i++) {
            ArrayPaswords[i] = new Contraseña();
            System.out.println("las Contraseña son: " + ArrayPaswords[0]);
            if (esFuerte = true) {
                System.out.println("la Contraseña es fuerte");
            } else {
                System.out.println("la contraseña es devil");
            }
        }

    }
}
