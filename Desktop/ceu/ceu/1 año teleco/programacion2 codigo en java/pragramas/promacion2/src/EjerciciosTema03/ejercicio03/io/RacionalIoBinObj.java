package EjerciciosTema03.ejercicio03.io;

import EjerciciosTema03.ejercicio03.NumeroRacional.DenominadorCeroException;
import EjerciciosTema03.ejercicio03.NumeroRacional.NumeroRacional;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class RacionalIoBinObj {

    public final static File fichero = new File("C:\\temp\\fichero.dat");

    public static void save(NumeroRacional r) throws FileNotFoundException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fichero);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(r);
        } catch (IOException ioe) {
            System.out.println("ha habido un error");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
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

    public static NumeroRacional load() throws FileNotFoundException, DenominadorCeroException, ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        NumeroRacional racional = null;

        try {
            fis = new FileInputStream(fichero);
            ois = new ObjectInputStream(fis);

            racional = (NumeroRacional) ois.readObject();
        } catch (IOException ioe) {
            System.out.println("ha habido un error");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
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

    public static void main(String[] args) throws DenominadorCeroException, FileNotFoundException, ClassNotFoundException {
        NumeroRacional racional1 = new NumeroRacional(3, 4);

        RacionalIoBinObj.save(racional1);

        NumeroRacional racional2 = RacionalIoBinObj.load();

        System.out.println("el racional escrito es =" + racional1);
        System.out.println("el racional leido es =" + racional2);
    }
}
