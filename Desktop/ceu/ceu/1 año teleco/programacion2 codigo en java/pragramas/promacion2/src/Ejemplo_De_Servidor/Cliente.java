package Ejemplo_De_Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Cliente {

    public static void main(String[] args) {
        Socket socket = null;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;
        OutputStream dutputStream = null;

        try {

            socket = new Socket("127.0.0.1", 8081);
            dutputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(dutputStream);
            InputStream is = socket.getInputStream();
            System.out.println(dataInputStream.readLine());
            System.out.println(dataInputStream.readFloat());
            dataInputStream = new DataInputStream(is);
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat((float) (Math.random()));

        } catch (IOException ex) {
            System.out.println("Fallo de red");
        }
    }

}
