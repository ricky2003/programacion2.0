package promacion2.PreYpost;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class PreYpost {

    public static void main(String[] args) {
        int c = 1;
        int b = 1;
        prt("entero : " + c);
        c = b;
        prt("entero : " + b);

        prt("++entero : " + ++c);// Pre-incremento
        c = b;//coge el valor de c y despues de ponerselo al b lo decrementa
        prt("++entero : " + ++b);

        prt("entero++ : " + c++); // Post-incremento
        c = b;
        prt("entero++ : " + b++);

        prt("entero : " + c);
        c = b;
        prt("entero : " + b);

        prt("--entero : " + --c); // Pre-decremento
        c = b;// simpre sera el mismo
        prt("--entero : " + --b);

        prt("entero-- : " + c--); // Post-decremento
        c = b;//coge el valor de c y despues de ponerselo al b lo decrementa
        prt("entero-- : " + b--);
    }

    static void prt(String s) {
        System.out.println(s);
    }

}
