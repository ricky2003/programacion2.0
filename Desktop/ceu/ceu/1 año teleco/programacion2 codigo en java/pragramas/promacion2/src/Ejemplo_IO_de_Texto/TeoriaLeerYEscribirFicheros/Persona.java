package Ejemplo_IO_de_Texto.TeoriaLeerYEscribirFicheros;

import java.io.Serializable;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Persona implements Serializable {

    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return edad + ";" + nombre;
    }

}
