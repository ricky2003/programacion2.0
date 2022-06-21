package Ejemplo_IO_de_Texto.Reader;

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

        File file1 = new File("C:/");//el original
        File file2 = new File("C:/");//la copia

        FileInputStream fileInputStream = new FileInputStream(file1);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        PrintWriter printWriter = new PrintWriter(file2);

        try {

            String texto = bufferedReader.readLine();

            do {
                System.out.println(texto);
                printWriter.print(texto);
            } while ((texto = bufferedReader.readLine()) != null);

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
