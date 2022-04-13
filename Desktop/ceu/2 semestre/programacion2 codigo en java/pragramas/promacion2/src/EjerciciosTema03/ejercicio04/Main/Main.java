package EjerciciosTema03.ejercicio04.Main;

import EjerciciosTema03.ejercicio04.Datos.DNI;
import EjerciciosTema03.ejercicio04.Datos.MasaCorporal;
import EjerciciosTema03.ejercicio04.Datos.Persona;
import EjerciciosTema03.ejercicio04.Datos.Sexo;
import static utilidades.utilidades.*;

/**
 * Ahora, crea una clase ejecutable que haga lo siguiente: • Pide por teclado el
 * nombre, la edad, sexo, peso y altura. • Crea 3 objetos de la clase anterior.
 * El primer objeto obtendrá las anteriores variables pedidas por teclado, el
 * segundo objeto obtendrá todos los anteriores menos el peso y la altura ; el
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

    public static void main(String[] args) throws DNIException {
        String nombre1 = LeeCadena("escribe tu nombre1");
        String nombre2 = LeeCadena("escribe tu nombre2");
        int edad1 = LeeEntero("escribe tu edad1");
        int edad2 = LeeEntero("escribe tu edad2");
        Sexo sexo1;
        Sexo sexo2;
        String userSexo1 = LeeCadena("escribe tu sexo1 (H/M)");
        String userSexo2 = LeeCadena("escribe tu sexo2 (H/M)");
        if (userSexo1.equals("H")) {
            sexo1 = Sexo.HOMBRE;
        } else {
            sexo1 = Sexo.MUJER;
        }
        if (userSexo2.equals("H")) {
            sexo2 = Sexo.HOMBRE;
        } else {
            sexo2 = Sexo.MUJER;
        }

        int peso = LeeEntero("escribe lo que pesas");

        int altura = LeeEntero("escribe tu altura");
        DNI dni = null;
        String cadenadni = LeeCadena("escribe tu dni");

        //estoes un objeto
        Persona primerDNI = null;
        Persona segundoDNI = null;
        Persona tercerDNI = null;
        primerDNI = new Persona(edad1, peso, altura, nombre1, sexo1, dni);
        segundoDNI = new Persona(edad2, nombre2, sexo2);
        tercerDNI = new Persona();

        if (primerDNI.EsMayorDeEdad()) {
            System.out.println("el primer dni es mayor de edad ");
        } else {
            System.out.println("el primer dni es menor  de edad ");
        }

        if (segundoDNI.EsMayorDeEdad()) {
            System.out.println("el segundo dni es mayor de edad ");
        } else {
            System.out.println("el segundo dni es menor  de edad ");
        }

        if (tercerDNI.EsMayorDeEdad()) {
            System.out.println("el tercer dni es mayor de edad ");
        } else {
            System.out.println("el trercer dni es menor de edad ");
        }

        if (primerDNI.ValorarPesoCorporal() == MasaCorporal.SOBREPESO) {
            System.out.println("el primer dni tiene que bajar de peso");
        } else if (primerDNI.ValorarPesoCorporal() == MasaCorporal.POR_DEBAJO_DE_SU_PESO_IDEAL) {
            System.out.println("el primer dni tiene que subir de peso");
        } else if (primerDNI.ValorarPesoCorporal() == MasaCorporal.PESO_IDEAL) {
            System.out.println("el primer dni tiene el peso perfecto para su edad ");
        }

        if (segundoDNI.ValorarPesoCorporal() == MasaCorporal.SOBREPESO) {
            System.out.println("el segundo dni tiene que bajar de peso");
        } else if (segundoDNI.ValorarPesoCorporal() == MasaCorporal.POR_DEBAJO_DE_SU_PESO_IDEAL) {
            System.out.println("el segundo dni tiene que subir de peso");
        } else if (segundoDNI.ValorarPesoCorporal() == MasaCorporal.PESO_IDEAL) {
            System.out.println("el segundo dni tiene el peso perfecto para su edad ");
        }

        if (tercerDNI.ValorarPesoCorporal() == MasaCorporal.SOBREPESO) {
            System.out.println("el tercer dni tiene que bajar de peso");
        } else if (tercerDNI.ValorarPesoCorporal() == MasaCorporal.POR_DEBAJO_DE_SU_PESO_IDEAL) {
            System.out.println("el tercer dni tiene que subir de peso");
        } else if (tercerDNI.ValorarPesoCorporal() == MasaCorporal.PESO_IDEAL) {
            System.out.println("el tercer dni tiene el peso perfecto para su edad ");
        }

    }

}
