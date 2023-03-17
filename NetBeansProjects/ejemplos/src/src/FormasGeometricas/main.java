package src.FormasGeometricas;

import java.util.ArrayList;
import src.FormasGeometricas.modelos.*;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class main {

    public static Color leerColor() {
        System.out.println("los coloeres son:AZUL(0),VERDE(1),ROJO(2),BLANCO(3),NEGLO(4)");
        System.out.println("escribe el numero que quieras para el Color");
        int color = src.util.LeerNumeroPorTeclado1.leerNumero();

        while (color != 0 && color != 1 && color != 2 && color != 3 && color != 4) {
            System.out.println("numero incorrecto");
            System.out.println("vuleve a introducir un numero");
            color = src.util.LeerNumeroPorTeclado1.leerNumero();
        }

        switch (color) {

            case 0:
                return Color.AZUL;

            case 1:
                return Color.VERDE;

            case 2:
                return Color.ROJO;

            case 3:
                return Color.BLANCO;

            case 4:
                return Color.NEGRO;
            default:
                return Color.ROJO;

        }
    }

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(2.4, 3.5, Color.AZUL, Color.VERDE);
        Rectangulo r2 = new Rectangulo();
        Rectangulo r3;
        System.out.println("el primer rectangulo es " + r1);
        System.out.println("el segundo rectangulo es " + r2);
        ArrayList<FormasGeometricas> formas = new ArrayList();

        System.out.println("escribe un valor para el lado 1");
        int lado1R3 = src.util.LeerNumeroPorTeclado1.leerNumero();
        System.out.println("escribe un valor para el lado 2");
        int lado2R3 = src.util.LeerNumeroPorTeclado1.leerNumero();
        Color colorForma = leerColor();
        Color colorLinea = leerColor();
        r3 = new Rectangulo(lado1R3, lado2R3, colorForma, colorLinea);
        System.out.println("el tercer rectangulo es: " + r3);
        r3.Pintar();
        r3.Pintarractangulo();

        Cuadrado c1 = new Cuadrado(3.4, Color.AZUL, Color.VERDE);
        Cuadrado c2 = new Cuadrado();
        System.out.println("el primer cuadrado es " + c1);
        System.out.println("el segundo cuadrado es " + c2);
        c2.Pintar();

        Circulo cl1 = new Circulo(4.8, Color.AZUL, Color.VERDE);
        Circulo cl2 = new Circulo();
        System.out.println("el primer circulo es " + cl1);
        System.out.println("el segundo circulo es " + cl2);

        System.out.println("el radio del circulo 1 " + cl1.getRadio());
        System.out.println("el color de la forma del circulo 2 " + cl2.getColorForma());
        System.out.println("el color de la linea del circulo 2" + cl2.getColorLinea());

        //de esta forma puedes modificar sin preguntar nada al usuario
        cl1.setRadio(5.6);
        cl2.setColorForma(Color.VERDE);
        cl2.setColorLinea(Color.AZUL);

        System.out.println("el radio del circulo 1 " + cl1.getRadio());
        System.out.println("el color de la forma del circulo 2 " + cl2.getColorForma());
        System.out.println("el color de la linea del circulo 2" + cl2.getColorLinea());
        cl1.Pintar();

        Triangulo t1 = new Triangulo(2, 4, 6, 8, Color.AZUL, Color.BLANCO);
        Triangulo t2 = new Triangulo();
        System.out.println("el primner trinagulo es " + t1);
        System.out.println("el segubdo triangulo es " + t2);
        t1.pintar();

        /*
        formas.add(r1);
        formas.add(c1);
        formas.add(cl1);
        formas.add(t1);
        //pintar todas las formas
        for (FormasGeometricas fg : formas) {
            fg.Pintar();
        }*/
    }

}
