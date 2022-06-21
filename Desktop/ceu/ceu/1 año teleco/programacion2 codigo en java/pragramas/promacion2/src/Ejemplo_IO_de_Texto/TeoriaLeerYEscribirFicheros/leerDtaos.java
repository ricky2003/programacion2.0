package Ejemplo_IO_de_Texto.TeoriaLeerYEscribirFicheros;

import java.io.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class leerDtaos {

    public static void main(String[] args) throws IOException {
        File fichero = new File("/Users/ricardogarciavillaraco/Desktop/ceu/ceu/1 año teleco/programacion2 codigo en java/pragramas/practias/ejmplo2.dat");

        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(fichero);
            dis = new DataInputStream(fis);
            System.out.println(dis.readBoolean());
            System.out.println(dis.readInt());

            dis.close();
            fis.close();
        } catch (IOException ex) {
            System.out.println("fallo en el sistema");
            ex.printStackTrace();
        }

    }
}
