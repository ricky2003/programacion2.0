package Ejemplo_IO_de_Texto.TeoriaLeerYEscribirFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class EscribirLista {

    public static void main(String[] args) throws IOException {
        ArrayList<Persona> lista = new ArrayList();
        lista.add(new Persona(19, "Ricardo"));
        lista.add(new Persona(18, "Ricardo"));
        lista.add(new Persona(17, "Ricardo"));
        File fichero = new File("/Users/ricardogarciavillaraco/Desktop/ceu/ceu/1 año teleco/programacion2 codigo en java/pragramas/practias/ejemplo6.txt");

        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(fichero);
            pw = new PrintWriter(fw);

            for (Persona p : lista) {

                pw.println(p);
            }

            fw.close();
            pw.close();

        } catch (IOException ioe) {
            System.out.println("fallo");
        }

    }
}
