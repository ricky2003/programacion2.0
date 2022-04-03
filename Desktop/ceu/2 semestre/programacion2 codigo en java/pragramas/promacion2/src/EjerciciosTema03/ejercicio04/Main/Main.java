package EjerciciosTema03.ejercicio04.Main;

import EjerciciosTema03.ejercicio04.Datos.Persona;
import EjerciciosTema03.ejercicio04.Datos.Sexo;
import static utilidades.utilidades.*;

/**
 * Ahora, crea una clase ejecutable que haga lo siguiente: • Pide por teclado el
 * nombre, la edad, sexo, peso y altura. • Crea 3 objetos de la clase anterior.
 * El primer objeto obtendrá las anteriores variables pedidas por teclado, el
 * segundo objeto obtendrá todos los anteriores menos el peso y la altura y el
 * último por defecto, para este último utiliza los métodos set para darle a los
 * atributos un valor. • Para cada objeto, se deberá comprobar si está en su
 * peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje. •
 * Indicar para cada objeto si es mayor de edad. • Por último, mostrar la
 * información de cada objeto.
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Main {

    public static void main(String[] args) {
        String nombre = LeeCadena("escribe tu nombre");
        int edad = leeEntero("escribe tu edad");
        String sexo = LeeCadena("escribe tu sexo");
        int peso = leeEntero("escribe lo que pesas");
        int altura = leeEntero("escribe tu altura");

        //estoes un objeto
        Persona primerDNI = new Persona(edad, peso, altura, nombre, Sexo.MUJER);
        Persona segundoDNI = new Persona(18, "ricardo", Sexo.HOMBRE);
        Persona tercerDNI = new Persona();
    }
}
