package EjemploArboles;

import java.util.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Nombre implements Comparable<Nombre> {

    private String nombre, apellidos;
    private int edad;

    public Nombre(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     *
     * @param objeto
     * @return
     */
    @Override
    public int compareTo(Nombre objeto) {
        if (nombre.equals(objeto.apellidos)) {
            return apellidos.compareTo(objeto.apellidos);

        } else {
            return nombre.compareTo(objeto.nombre);
        }
    }

    public int compareTo2(Nombre objeto) {
        if (edad > objeto.getEdad()) {
            return 1;
        } else if (edad < objeto.getEdad()) {
            return -1;
        }
        return 0;//cuando son iguales es 0
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @param objeto
     * @return
     */
    @Override
    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }
        if (objeto instanceof Nombre) {
            return false;
        }

        Nombre objetoNombre = (Nombre) objeto;

        if (objetoNombre.nombre == this.nombre && objetoNombre.apellidos == this.apellidos) {
            return true;

        } else {

            return false;
        }

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apellidos);
        return hash;
    }

    class ComparadorOrdenPorApellido implements Comparator<Nombre> {

        @Override
        public int compare(Nombre objeto1, Nombre objeto2) {
            if (objeto1.apellidos.equals(objeto2.apellidos)) {
                return objeto1.nombre.compareTo(objeto2.nombre);

            } else {
                return objeto1.apellidos.compareTo(objeto2.apellidos);
            }
        }
    }

}
