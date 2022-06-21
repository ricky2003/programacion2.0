package Ejemplo_IO_de_Texto.TeoriaLeerYEscribirFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class EscribirTexto {

    public static void main(String[] args) throws IOException {

        Persona p = new Persona(18, "jesus");
        Persona p2 = new Persona(17, "richy");
        Persona p3 = new Persona(16, "mencia");
        File fichero = new File("/Users/ricardogarciavillaraco/Desktop/ceu/ceu/1 año teleco/programacion2 codigo en java/pragramas/practias/ejmploTexto2.txt");

        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(fichero);
            pw = new PrintWriter(fw);

            pw.println("Personas");
            pw.println(p.toString());
            pw.println(p2.toString());
            pw.println(p3.toString());

            pw.close();
            fw.close();

        } catch (IOException ioe) {
            System.out.println("fallo");
            ioe.printStackTrace();

        }
    }
}
