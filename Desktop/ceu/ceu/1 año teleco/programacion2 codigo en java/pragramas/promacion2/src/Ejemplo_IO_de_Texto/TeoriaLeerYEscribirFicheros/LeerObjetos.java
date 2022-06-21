package Ejemplo_IO_de_Texto.TeoriaLeerYEscribirFicheros;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class LeerObjetos {

    public static void main(String[] args) {
        File fichero = new File("/Users/ricardogarciavillaraco/Desktop/ceu/ceu/1 año teleco/programacion2 codigo en java/pragramas/practias/ejemplo3.obj");

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fichero);
            ois = new ObjectInputStream(fis);

            while (true) {
                Object o = ois.readObject();
                System.out.println(o.toString());

            }

        } catch (EOFException eofe) {
            try {
                ois.close();
                fis.close();
            } catch (IOException ioe) {
                System.out.println("fallo");
            }
        } catch (IOException ioe) {

            System.out.println("fallo2");
            ioe.printStackTrace();

        } catch (ClassNotFoundException ce) {

            System.out.println("fallo3");

        }
    }
}
