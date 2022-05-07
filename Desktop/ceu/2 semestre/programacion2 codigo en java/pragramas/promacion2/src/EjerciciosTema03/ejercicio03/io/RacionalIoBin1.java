package EjerciciosTema03.ejercicio03.io;

import EjerciciosTema03.ejercicio03.NumeroRacional.DenominadorCeroException;
import EjerciciosTema03.ejercicio03.NumeroRacional.NumeroRacional;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class RacionalIoBin1 {

    public final static File fichero = new File("C:\\temp\\fichero.dat");

    public static void save(NumeroRacional r) throws FileNotFoundException {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream(fichero);
            dos = new DataOutputStream(fos);

            dos.writeInt(r.getNumerador());
            dos.writeInt(r.getDenominador());
        } catch (IOException ioe) {
            System.out.println("ha habido un error");
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException IOe) {
                    System.out.println("flujo no cerrado");
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException IOe) {
                    System.out.println("flujo no cerrado");
                }
            }
        }
    }

    public static NumeroRacional load() throws FileNotFoundException, DenominadorCeroException {
        FileInputStream fis = null;
        DataInputStream dis = null;
        NumeroRacional racional = null;

        try {
            fis = new FileInputStream(fichero);
            dis = new DataInputStream(fis);

            int num = dis.readInt();
            int deno = dis.readInt();
            racional = new NumeroRacional(num, deno);

        } catch (IOException ioe) {
            System.out.println("ha habido un error");
        } finally {
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
        RacionalIoBin1.save(racional1);
        NumeroRacional racional2 = RacionalIoBin1.load();

        System.out.println("el racional escrito es =" + racional1);
        System.out.println("el racional leido es =" + racional2);
    }
}
