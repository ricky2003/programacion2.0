package Ejemplo_IO_de_Texto.TeoriaLeerYEscribirFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class leerTexto {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero = new File("/Users/ricardogarciavillaraco/Desktop/ceu/ceu/1 año teleco/programacion2 codigo en java/pragramas/practias/ejmploTexto2.txt");

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String line = br.readLine();//te lee la primera linea
            line = br.readLine();//para deshacerte del indice con el que no crreas ningun objeto persona  y asi no salga el OutOfBoudsException
            ArrayList<Persona> al = new ArrayList();
            while (line != null) {//bucle que te lee laa lieas hasta que enciare una null en la ultima linea

                String s[] = line.split(";");//convierte la linea en un array segun los elemento separados por el ;
                System.out.println(s[0] + " " + s[1]);
                Persona p = new Persona(parseInt(s[0]), s[1]);//los argumentos dependaran de los atributos constructor;
                al.add(p);

                line = br.readLine();

            }

            System.out.println(al);

            fr.close();
            br.close();

        } catch (IOException ioe) {
            System.out.println("fallo");
            ioe.printStackTrace();
        }
    }

}
