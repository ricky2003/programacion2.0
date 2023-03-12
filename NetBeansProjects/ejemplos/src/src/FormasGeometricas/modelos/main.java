package src.FormasGeometricas.modelos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class main {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2, 3, Color.AZUL, Color.VERTDE);
        Rectangulo r2 = new Rectangulo();
        System.out.println("el primer rectangulo es " + r1);
        System.out.println("el segundo rectangulo es " + r2);
        r1.Pintar();

        Cuadrado c1 = new Cuadrado(3, Color.AZUL, Color.VERTDE);
        Cuadrado c2 = new Cuadrado();
        System.out.println("el primer cuadrado es " + c1);
        System.out.println("el segundo cuadrado es " + c2);
        c1.Pintar();

        Circulo cl1 = new Circulo(3, Color.AZUL, Color.VERTDE);
        Cuadrado cl2 = new Cuadrado();
        System.out.println("el primer circulo es " + cl1);
        System.out.println("el segundo circulo es " + cl2);
        cl1.Pintar();

    }

}
