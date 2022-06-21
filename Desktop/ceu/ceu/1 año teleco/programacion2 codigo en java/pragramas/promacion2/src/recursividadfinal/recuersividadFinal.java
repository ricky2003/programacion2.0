package recursividadfinal;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class recuersividadFinal {

    public static int mcd(int numero1, int numero2) {
        if (numero1 == numero2) {
            return numero1;
        } else if (numero1 < numero2) {
            return mcd(numero1, numero2 - numero1);
        } else {
            return mcd(numero1 - numero2, numero2);
        }
    }

    public static void main(String[] args) {
        int numero1 = 4454;
        int numero2 = 143052;
        System.out.println("El maximo com divisor entre el numero1 y el numeros2 es : " + mcd(numero1, numero2));
    }
}
