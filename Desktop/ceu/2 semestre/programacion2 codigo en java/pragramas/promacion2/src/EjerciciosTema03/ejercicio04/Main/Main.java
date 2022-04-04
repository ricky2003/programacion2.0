package EjerciciosTema03.ejercicio04.Main;

import EjerciciosTema03.ejercicio04.Datos.MasaCorporal;
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
 * ME FALTA PONER EXCEPCIONES
 */
public class Main {

    public static void main(String[] args) {
        String nombre = LeeCadena("escribe tu nombre");
        int edad = LeeEntero("escribe tu edad");
        Sexo sexo;
        String userSexo = LeeCadena("escribe tu sexo (H/M)");
        if (userSexo.equals("H")) {
            sexo = Sexo.HOMBRE;
        } else {
            sexo = Sexo.MUJER;
        }

        int peso = LeeEntero("escribe lo que pesas");
        int altura = LeeEntero("escribe tu altura");

        //estoes un objeto
        Persona primerDNI = new Persona(edad, peso, altura, nombre, sexo);
        Persona segundoDNI = new Persona(18, "ricardo", Sexo.HOMBRE);
        Persona tercerDNI = new Persona();

        if (primerDNI.EsMayorDeEdad()) {
            System.out.println("el primer dni es mayor de edad ");
        } else {
            System.out.println("el primer dni es menor  de edad ");
        }

        if (segundoDNI.EsMayorDeEdad()) {
            System.out.println("el segundo dni es mayor de edad ");
        } else {
            System.out.println("el primer dni es menor  de edad ");
        }

        if (tercerDNI.EsMayorDeEdad()) {
            System.out.println("el tercer dni es mayor de edad ");
        } else {
            System.out.println("el primer dni es menor de edad ");
        }

        if (primerDNI.ValorarPesoCorporal() == MasaCorporal.SOBREPESO) {
            System.out.println("el primer dni tiene que bajar de peso");
        } else if (primerDNI.ValorarPesoCorporal() == MasaCorporal.POR_DEBAJO_DE_SU_PESO_IDEAL) {
            System.out.println("el primer dni tiene que subir de peso");
        } else if (primerDNI.ValorarPesoCorporal() == MasaCorporal.PESO_IDEAL) {
            System.out.println("el primer dni tiene el peso perfecto para su edad ");
        }

        if (segundoDNI.ValorarPesoCorporal() == MasaCorporal.SOBREPESO) {
            System.out.println("el primer dni tiene que bajar de peso");
        } else if (segundoDNI.ValorarPesoCorporal() == MasaCorporal.POR_DEBAJO_DE_SU_PESO_IDEAL) {
            System.out.println("el primer dni tiene que subir de peso");
        } else if (segundoDNI.ValorarPesoCorporal() == MasaCorporal.PESO_IDEAL) {
            System.out.println("el primer dni tiene el peso perfecto para su edad ");
        }

        if (tercerDNI.ValorarPesoCorporal() == MasaCorporal.SOBREPESO) {
            System.out.println("el primer dni tiene que bajar de peso");
        } else if (tercerDNI.ValorarPesoCorporal() == MasaCorporal.POR_DEBAJO_DE_SU_PESO_IDEAL) {
            System.out.println("el primer dni tiene que subir de peso");
        } else if (tercerDNI.ValorarPesoCorporal() == MasaCorporal.PESO_IDEAL) {
            System.out.println("el primer dni tiene el peso perfecto para su edad ");
        }
    }
}
