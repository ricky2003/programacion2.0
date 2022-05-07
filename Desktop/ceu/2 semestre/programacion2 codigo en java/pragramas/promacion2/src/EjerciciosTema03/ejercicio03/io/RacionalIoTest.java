package EjerciciosTema03.ejercicio03.io;

import EjerciciosTema03.ejercicio03.NumeroRacional.DenominadorCeroException;
import EjerciciosTema03.ejercicio03.NumeroRacional.NumeroRacional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class RacionalIoTest {

    public final static File fichero = new File("fichero.dat");

    public static void save(NumeroRacional r) throws FileNotFoundException {
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(fichero);

            pw.write("" + r.getNumerador() + "\n");

            pw.write("" + r.getDenominador() + "\n");
        } catch (IOException ioe) {
            System.out.println("ha habido un error");
        } finally {
            if (pw != null) {
                pw.close();
            }

        }
    }

    public static NumeroRacional load() throws FileNotFoundException, DenominadorCeroException {
        FileInputStream fis = null;
        InputStreamReader dis = null;
        BufferedReader br = null;

        NumeroRacional racional = null;

        try {
            fis = new FileInputStream(fichero);
            dis = new InputStreamReader(fis);
            br = new BufferedReader(dis);

            int num = Integer.parseInt(br.readLine());
            int deno = Integer.parseInt(br.readLine());
            racional = new NumeroRacional(num, deno);

        } catch (IOException ioe) {
            System.out.println("ha habido un error");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException IOe) {
                    System.out.println("flujo no cerrado");
                }
            }
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException IOe) {
                    System.out.println("flujo no cerrado");
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException IOe) {
                    System.out.println("flujo no cerrado");
                }
            }
        }
        return racional;
    }

    public static void main(String[] args) throws DenominadorCeroException, FileNotFoundException {
        NumeroRacional racional1 = new NumeroRacional(3, 4);
        RacionalIoTest.save(racional1);
        NumeroRacional racional2 = RacionalIoTest.load();

        System.out.println("el racional escrito es =" + racional1);
        System.out.println("el racional leido es =" + racional2);
    }
}
