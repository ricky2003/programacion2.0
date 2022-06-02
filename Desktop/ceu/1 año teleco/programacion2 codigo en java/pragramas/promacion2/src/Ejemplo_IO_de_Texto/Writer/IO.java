package Ejemplo_IO_de_Texto.Writer;

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
public class IO {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/");

        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        try {

            printWriter = new PrintWriter(file);
            printWriter.println((int) (Math.random() * 100));
            printWriter.println(Math.random() * 100);
            printWriter.println(true);
            printWriter.println((float) (Math.random() * 100));
            printWriter.close();

            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            int entero = Integer.parseInt(bufferedReader.readLine());
            double realDouble = Double.parseDouble(bufferedReader.readLine());
            boolean logico = Boolean.parseBoolean(bufferedReader.readLine());
            float real = Float.parseFloat(bufferedReader.readLine());
            System.out.println(entero + " " + realDouble + " " + logico + " " + real + "");

        } catch (IOException ex) {

            System.out.println("error durante el proceso de copia");
            ex.printStackTrace();

        } finally {

            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
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

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        }
    }

}
