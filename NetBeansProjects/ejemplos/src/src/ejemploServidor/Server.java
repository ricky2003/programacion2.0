package src.ejemploServidor;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Server {

    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;
        try {
            ss = new ServerSocket(8081);
            s = ss.accept();
            OutputStream os = s.getOutputStream();
            InputStream is = s.getInputStream();
            dis = new DataInputStream(is);
            System.out.println(dis.readDouble());
            System.out.println(dis.readLine());
            dos = new DataOutputStream(os);
            dos.writeBytes("hola que tal!");
            dos.writeFloat(2.3f);

        } catch (IOException ioe) {
            System.out.println("error en ele servidor");
        } finally {
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException ioe) {
                    System.out.println("error en el server Socket");
                }
            }
            if (s != null) {
                try {
                    s.close();
                } catch (IOException ioe) {
                    System.out.println("error en el server");
                }
            }
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException ioe) {
                    System.out.println("error en el Data Output Stream");
                }
            }
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException ioe) {
                    System.out.println("error en el Data Input Stream");
                }
            }
        }
    }

}
