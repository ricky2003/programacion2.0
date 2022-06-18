package ejemplo_de_la_clase_file;

import java.io.*;
import java.util.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class clase_file {

    public static void main(String[] args) throws IOException {
        File Directorio = new File("C:/");
        if ((Directorio.exists()) && (Directorio.isDirectory())) {
            File[] lista = Directorio.listFiles();
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i].getAbsolutePath());
                System.out.println("Nombre: " + lista[i].getName());
                System.out.println("Ruta Absoluta: " + lista[i].getAbsolutePath());
                System.out.println("ruta: " + lista[i].getPath());
                System.out.println("padre : " + lista[i].getParent());
                System.out.println("Se puede leer? " + lista[i].canRead());
                System.out.println("Se puede escribir? " + lista[i].canWrite());
                System.out.println("Que tamaño de bytes tiene: " + lista[i].length());
                System.out.println("la fecha de la u;ltima modificación: " + new Date(lista[i].lastModified()));
                System.out.println("\n");
            }
        } else {
            System.out.println("el directorio no existe");
        }
    }

}
