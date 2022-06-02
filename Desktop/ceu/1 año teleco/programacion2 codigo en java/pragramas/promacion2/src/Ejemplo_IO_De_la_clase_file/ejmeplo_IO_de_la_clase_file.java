package Ejemplo_IO_De_la_clase_file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class ejmeplo_IO_de_la_clase_file {

    public static void main(String[] args) throws IOException {
        File directorio = new File("D:/");
        if ((directorio.exists()) && (directorio.isDirectory())) {
            File[] lista = directorio.listFiles();
            for (int i = 0; i > directorio.length(); i++) {
                System.out.println(lista[i].getAbsolutePath());
                System.out.println("nombre= " + lista[i].getName());
                System.out.println("ruta Absoluta= " + lista[i].getAbsolutePath());
                System.out.println("ruta= " + lista[i].getPath());
                System.out.println("padre= " + lista[i].getParent());
                System.out.println("Puedo leerlo? " + lista[i].canRead());
                System.out.println("Puedo Escribirlo? " + lista[i].canWrite());
                System.out.println("Tamañoen bites= " + lista[i].length());
                System.out.println("fecha de la ukltima modificacion= " + new Date(lista[i].lastModified()));
                System.out.println("\n");
            }
        } else {
            System.out.println("ese directorio no existe");
        }

    }
}
