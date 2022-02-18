import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejemplo15 {
    public static void main(String[] args) 
    {
     try {
         System.out.println("Escribe una cadena de texto : ");
            String stringLeido;
            BufferedReader consola = new BufferedReader(new InputStreamReader(
            System.in));
            stringLeido = consola.readLine();
            System.out.println("La cadena de texto leida es:" + stringLeido);
            System.out.println("Escribe un entero : ");
            stringLeido = consola.readLine();
            int entero = Integer.parseInt(stringLeido);
            System.out.println("El entero leido es:" + entero);
            System.out.println("Escribe un float : ");
            stringLeido = consola.readLine();
            float real = Float.parseFloat(stringLeido);
            System.out.println("El real leido es:" + real);
            System.out.println("Escribe un double : ");
            stringLeido = consola.readLine();
            double realGrande = Double.parseDouble(stringLeido);
            System.out.println("El real largo leido es:" + realGrande);
            System.out.println("Escribe un caracter : ");
            stringLeido = consola.readLine();
            char caracter = stringLeido.charAt(0);
            System.out.println("La caracter leido es:" + caracter);
        }
     catch (IOException ex)
        {
         System.out.println("Se ha producido un error" + ex);
        }
    }
}
