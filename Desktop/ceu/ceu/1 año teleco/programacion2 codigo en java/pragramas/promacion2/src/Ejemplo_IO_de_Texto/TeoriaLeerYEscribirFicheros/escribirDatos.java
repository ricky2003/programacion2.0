package Ejemplo_IO_de_Texto.TeoriaLeerYEscribirFicheros;

import java.io.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class escribirDatos {

    public static void main(String[] args) throws FileNotFoundException {
        File fichero = new File("/Users/ricardogarciavillaraco/Desktop/ceu/ceu/1 año teleco/programacion2 codigo en java/pragramas/practias/ejmplo2.dat");

        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream(fichero);
            dos = new DataOutputStream(fos);

            dos.writeBoolean(true);
            dos.writeInt(7);
            dos.close();
            fos.close();

        } catch (Exception ex) {
            System.out.println("hay un fallo");
            ex.printStackTrace();
        }

    }

}
