package Ejemplo_IO_de_datos.parteDeLaEntrada;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class IO {

    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
        File file1 = new File("C:/");//a/Datos.dat
        File file2 = new File("C:/");//a/Objetos.dat

        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        DataInputStream dataInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {

            fileInputStream = new FileInputStream(file1);
            dataInputStream = new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readDouble());

            fileInputStream2 = new FileInputStream(file2);
            objectInputStream = new ObjectInputStream(fileInputStream2);
            System.out.println(objectInputStream.readObject());

        } catch (IOException ex) {

            System.out.println("error antes de finalizar lectura");
            ex.printStackTrace();

        } finally {

            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        }
    }

}
