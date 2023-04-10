package src.ejemploServidor;

import java.io.*;
import java.net.Socket;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Cliente {

    public static void main(String[] args) {
        Socket s = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;
        OutputStream os = null;
        InputStream is = null;
        try {
            s = new Socket("10.0.0.1", 8081);

            os = s.getOutputStream();
            dos = new DataOutputStream(os);
            dos.writeBytes("bien , yo soy el cliente");
            dos.writeInt(23);

            is = s.getInputStream();
            dis = new DataInputStream(is);
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());

        } catch (Exception e) {
            System.out.println("error en alguna parte del programa");
        } finally {
            if (s != null) {
                try {
                    s.close();
                } catch (IOException ioe) {
                    System.out.println("error en el server");
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ioe) {
                    System.out.println("error en el Output Stream");
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException ioe) {
                    System.out.println("error en el Input Stream");
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
