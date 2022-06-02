package Ejemplo_De_Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Servidor {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Socket socket = null;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;

        try {
            serverSocket = new ServerSocket(8081);
            socket = serverSocket.accept();
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            System.out.println(dataInputStream.readLine());
            System.out.println(dataInputStream.readInt());
            dataOutputStream = new DataOutputStream(os);
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat((float) (Math.random()));

        } catch (IOException ex) {
            System.out.println("Fallo de red");
        }
    }
}
