package src.ejerciciostema1;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 *
 */
public class E2 {

    /**
     *
     * @param args Escribir un programa que muestre por consola los mayores
     * números enteros que se pueden representar mediante un char, short e int.
     */
    public static void main(String[] args) {//psvm para abreviar
        int numeromaximo = Integer.MAX_VALUE;
        short shortmaximo = Short.MAX_VALUE;
        char charmaximo = 0xffff;//el maximo char
        System.out.println("el mayor int es :" + numeromaximo);//sout para abreviar
        System.out.println("el mayor short es :" + shortmaximo);
        System.out.println("el mayor char es " + charmaximo);
    }

}
