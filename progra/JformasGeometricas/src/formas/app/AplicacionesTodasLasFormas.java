package formas.app;

import formas.data.*;
import java.util.ArrayList;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class AplicacionesTodasLasFormas {

    public static void main(String[] args) {

        ArrayList<FormaGeometrica> formas = new ArrayList();

        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.forma();
        Rectangulo rectangulo2 = new Rectangulo(2, 3, Color.AZUL, Color.VERDE);
        Rectangulo rectangulo3 = new Rectangulo(4, 5, Color.AMARILLO, Color.AMARILLO);

        //getLado es que te enseñe el lado1 en este caso
        /*
        System.out.println("el lado1 del rectangulo 3 es : "
                + rectangulo3.getLado1());
        System.out.println("el rectangulo 3 es : " + rectangulo3);

        //este set te cambia el lado en este caso el 1 por el numero que le pongas entre los parentesis
        rectangulo3.setLado1(utilidades.leeDouble("escribe el valor "
                + "del lado1 del rectangulo 3"));
        rectangulo3.setLado2(utilidades.leeDouble("escribe el valor "
                + "del lado2 del rectangulo 3"));

        //las tres ultimas lineas se podrian poner en una solo haciendo lo siguiente
        Rectangulo rectangulo4 = new Rectangulo(
                utilidades.leeDouble("escribe el valor "
                        + "del lado1 del rectangulo 4"),
                utilidades.leeDouble("escribe el valor "
                        + "del lado2 del rectangulo 4"),
                Color.BLANCO, Color.GRIS);
         */
        formas.add(rectangulo1);
        formas.add(rectangulo2);
        formas.add(rectangulo3);
        //formas.add(rectangulo4);

        // parte del circulo
        Circulo circulo1 = new Circulo();
        circulo1.forma();
        Circulo circulo2 = new Circulo(2, Color.GRIS, Color.ROJO);
        Circulo circulo3 = new Circulo(3, Color.VERDE, Color.NEGRO);

        formas.add(circulo1);
        formas.add(circulo2);
        formas.add(circulo3);

        //parte cuadrado
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.forma();
        Cuadrado cuadrado2 = new Cuadrado(2, Color.GRIS, Color.ROJO);
        Cuadrado cuadrado3 = new Cuadrado(3, Color.VERDE, Color.NEGRO);

        formas.add(cuadrado1);
        formas.add(cuadrado2);
        formas.add(cuadrado3);

        //parte Triangulo
        Triangulo triangulo1 = new Triangulo();
        triangulo1.forma();
        Triangulo triangulo2 = new Triangulo(1, 3, 5, 7, Color.AZUL, Color.VERDE);
        Triangulo triangulo3 = new Triangulo(2, 4, 6, 8, Color.AMARILLO, Color.AMARILLO);

        formas.add(triangulo1);
        formas.add(triangulo2);
        formas.add(triangulo3);

        for (FormaGeometrica f : formas) {

            f.pintar();
            System.out.println("");

        }

    }
}
