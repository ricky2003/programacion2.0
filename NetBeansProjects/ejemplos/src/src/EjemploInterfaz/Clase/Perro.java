package src.EjemploInterfaz.Clase;

import java.util.Date;
import src.EjemploInterfaz.Interfaces.Animal1;
import src.EjemploInterfaz.Interfaces.Animal2;
import src.EjemploInterfaz.Interfaces.Animal3;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Perro implements Animal1, Animal2, Animal3 {

    //implementa todos los metodos de las interfaces
    @Override
    public void Nace() {
        System.out.println("hola mundo, hoy dia " + new Date() + " he nacido");

    }

    @Override
    public final void mostrarNombre() {
        System.out.println(nombre);//este se puede obtener por implementar el Anima1 que tiene hay todos los atributos

    }

    @Override
    public final void mostrarNombre(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(nombre);//te mostrara i veces el nombre;
        }
    }

    public Perro() {//constructor de la clase ;
        mostrarNombre();
        mostrarNombre(3);
    }

}
