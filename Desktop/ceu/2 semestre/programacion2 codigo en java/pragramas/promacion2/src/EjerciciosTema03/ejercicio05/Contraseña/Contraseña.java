package EjerciciosTema03.ejercicio05.Contraseña;

import static utilidades.utilidades.*;

/**
 * Haz una clase llamada Password que tenga los atributos longitud y contraseña.
 * Por defecto, la longitud de la contraseña será de 8 caracteres. Los
 * constructores serán los siguiente: • Un constructor por defecto que tendrá
 * como contraseña "password". • Un constructor con la longitud que nosotros le
 * pasemos. Generará una contraseña alfanumérica aleatoria con esa longitud. Los
 * métodos de esta clase serán: • esFuerte(): devuelve un booleano si es fuerte
 * o no. Para que sea fuerte debe tener más de 2 mayúsculas, más de 1 minúscula
 * y más de 5 números. • generarPassword(): genera la contraseña del objeto con
 * la longitud que tenga. • Método get para contraseña y longitud. • Método set
 * para longitud. Ahora, crea una clase clase ejecutable que haga lo siguiente:
 * • Cree un array de Passwords con el tamaño que tú le indiques por teclado.
 * Cree un bucle que cree un objeto para cada posición del array. Indica por
 * teclado la longitud de cada password. • Cree otro array de booleanos donde se
 * almacene si el password del array de Password es o no fuerte (usa el bucle
 * anterior). • Al final, muestra la contraseña y si es o no fuerte (usa el
 * bucle anterior). Usa este simple formato: contraseña1 : valor_booleano1
 * contraseña2 : valor_bololeano2
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Contraseña {

    private int longitud;
    //por defecto tiene como maximo 8 letras
    private String contraseña;

    public Contraseña() {
        this.contraseña = "password";
    }

    public Contraseña(int longitud) {
        this.longitud = LeeEntero("escribe la longitud: ");

    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean esFuerte() {

        return true;
    }
}
