package Ejemplo_IO_de_Texto.TeoriaLeerYEscribirFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class EscribirObjetos {

    public static void main(String[] args) throws FileNotFoundException {
        File fichero = new File("/Users/ricardogarciavillaraco/Desktop/ceu/ceu/1 año teleco/programacion2 codigo en java/pragramas/practias/ejemplo3.obj");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fichero);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(new Persona(10, "Pablo"));
            oos.writeObject(new Persona(22, "Nacho"));
            oos.writeObject(new Persona(17, "Jaime"));

            oos.close();
            fos.close();

        } catch (IOException ex) {
            System.out.println("fallo");
            ex.printStackTrace();

        }
    }
}
