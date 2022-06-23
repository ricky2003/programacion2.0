package EjemploMapasóDiccionario;

import java.io.Serializable;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Persona implements Serializable {

    private int edad;
    private String nombre;
    private int dni;

    public Persona(int edad, int dni, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return " " + dni;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        if (object instanceof Persona) {//te dice si el objeto es de la misma clase que persona
            Persona p = (Persona) object;//esto se denosmina downcasting//aqui va la clase que quieres comparar
            if (this.dni == p.getDni()) {//atroibuto por el que determinas si son iguales o no : con numeros == y con otra cosa .equals
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {

        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
