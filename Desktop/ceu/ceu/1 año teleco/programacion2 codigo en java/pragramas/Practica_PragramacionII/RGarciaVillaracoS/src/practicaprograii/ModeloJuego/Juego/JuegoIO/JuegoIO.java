package practicaprograii.ModeloJuego.Juego.JuegoIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import practicaprograii.ModeloJuego.Juego.Datastore.DataStore;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JuegoIO {

    public final static File fichero = new File("C:\\temp\\juego Guardado.dat");

    public static void save(DataStore d) throws FileNotFoundException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fichero);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(d);
        } catch (IOException e) {
            System.out.println("ha habido un error");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("flujo no cerrado");
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("flujo no cerrado");
                }
            }
        }
    }

    public static DataStore load() throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        DataStore datastore = null;

        try {
            fis = new FileInputStream(fichero);
            ois = new ObjectInputStream(fis);

            datastore = (DataStore) ois.readObject();
        } catch (IOException e) {
            System.out.println("ha habido un error");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("flujo no cerrado");
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("flujo no cerrado");
                }
            }
        }
        return datastore;
    }
}
