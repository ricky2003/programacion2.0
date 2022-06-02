package EjerciciosTema03.ejercicio04.Datos;

/**
 * Crea una clase DNI, que deberá contener:Un constructor con un número. Un
 * constructor con el número y la letra. Un constructor con un String que
 * contenga el número y la letra sin separación. Un constructor por defecto que
 * genere un DNI correcto. *La clase, además, *deberá contener el método
 * toString(), que ofrecerá una cadena de caracteres *que representará el DNI.
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class DNI {

    private int numeroDni;
    private char letraDni;

    //constructor con la letra y el numero
    public DNI(int numeroDNI, char letraDNI) {
        this.numeroDni = numeroDNI;
        this.letraDni = letraDNI;//recurda char con ''.
    }

    //contrustor por defecto
    public DNI() {
        this.numeroDni = generarNumeroDni();
        this.letraDni = generarLetraDni(this.numeroDni);
    }

    //constructor con un string
    public DNI(String dni) {
        String numerodni = dni.substring(0, 8);
        char letradni = dni.charAt(8);

    }

    public int generarNumeroDni() {

        int NumeroDni = (int) (Math.random() * 100000000);
        NumeroDni = this.numeroDni;
        return this.numeroDni;

    }

    public char generarLetraDni(int numero) {
        numero = generarNumeroDni();
        String caracteresPosibles = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        int i = numero % 23;
        this.letraDni = caracteresPosibles.charAt(i);
        return this.letraDni;
    }

    @Override
    public String toString() {
        return "DNI: " + numeroDni + letraDni;
    }

}
