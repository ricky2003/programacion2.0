package Ejemplo_IO_de_datos.parteDeLaSalida;

import java.io.*;
import java.util.Date;

/**
 * te lleva al catch todo el rato pero no entiendo por que
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class IO {

    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:/Datos.dat");
        File file2 = new File("C:/Objetos.dat");

        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        DataOutputStream dataOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {

            fileOutputStream = new FileOutputStream(file1);
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt((int) (Math.random()));
            dataOutputStream.writeDouble(Math.random());

            fileOutputStream2 = new FileOutputStream(file2);
            objectOutputStream = new ObjectOutputStream(fileOutputStream2);
            objectOutputStream.writeObject(new Date());

        } catch (IOException ex) {

            System.out.println("error antes de finalizar escritura");

        } finally {

            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        }
    }

}
