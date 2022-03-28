package EjerciciosTema03.ejercicio03.NumeroRacional;

/**
 *
 * Crear una clase que represente un número racional que permita, al menos,
 * sumar, multiplicar y simplificar números racionales. Proporcionar un
 * constructor por defecto, un constructor de copia (esto es, un constructor al
 * que se le pasa una instancia de la clase número racional y crea otro número
 * racional idéntico), y otro que permita indicar los valores del numerador y
 * del denominador. Usando esta clase, crea una calculadora que permita operar
 * con números racionales, seleccionando las operaciones de un menú.
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class NumeroRacional {

    private int numerador;
    private int denominador;

    /**
     *
     * @param numerador
     * @param denominador
     * @throws java.lang.Exception
     * @throws java.lang.Exception//para obligar a hacer un try cath
     */
    //en los constructores poner todos los private
    //si no te lo piden por paramrtros ponerlos tu
    public NumeroRacional(int numerador, int denominador) throws DenominadorCeroException {
        if (denominador == 0) {
            throw new DenominadorCeroException(1);
        }
        this.numerador = numerador;
        this.denominador = denominador;

    }

    //esto es un constructor copia que te dice que
    //el numerador del primero es el mimsmo que el numerador del segundo
    //el denominador del primero es el misma que el denominador del segundo
    public NumeroRacional(NumeroRacional r2) throws DenominadorCeroException {
        this(r2.numerador, r2.denominador);
    }

    public NumeroRacional() throws DenominadorCeroException {
        this(1, 1);
    }

    //GETTERS AND SETTERS
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    //metodos importrantes
    //podemos poner throws Exception o poner lo siguiete
    public NumeroRacional suma(NumeroRacional r2) {
        int numeradorComun = (this.getNumerador() * r2.getDenominador()) + (r2.getNumerador() * this.getDenominador());
        int denominadorComun = (this.getDenominador() * r2.getDenominador());
        NumeroRacional Resultadosuma = null;

        try {
            Resultadosuma = new NumeroRacional(numeradorComun, denominadorComun);

        } catch (DenominadorCeroException ex) {
            System.out.println("el valor del denominador no pude ser 0");
        }
        return Resultadosuma;

    }

    public NumeroRacional mult(NumeroRacional r2) {
        int DenominadorComun = this.getDenominador() * r2.getDenominador();
        int NumeradorComun = this.getNumerador() * r2.getNumerador();

        NumeroRacional resultadoProducto = null;

        try {
            resultadoProducto = new NumeroRacional(NumeradorComun, DenominadorComun);

        } catch (DenominadorCeroException ex) {
            System.out.println("el valor del denominador no pude ser 0");
        }
        return resultadoProducto;

    }

    public NumeroRacional simplificar(NumeroRacional r2) {

        int NumeradorComun = this.numerador;
        int DenominadorComun = this.denominador;
        int menor = (this.denominador > this.numerador) ? this.denominador : this.numerador;
        for (int i = menor; i > 1; i--) {
            if ((NumeradorComun % i == 0) && (DenominadorComun % i == 0)) {
                NumeradorComun = NumeradorComun / i;
                DenominadorComun = DenominadorComun / i;
            }
        }
        NumeroRacional resultadoSimplificado = null;
        try {
            resultadoSimplificado = new NumeroRacional(NumeradorComun, DenominadorComun);

        } catch (DenominadorCeroException e) {
            System.out.println("el valor del denominador no pude ser 0");
        }
        return resultadoSimplificado;

    }
    //forma de expresar otra calculadora
    //((condicion)?(lo que se realiza si ocurre la condicion boolleana):
    //(se pone lo que habria en el else);

    @Override
    public String toString() {
        return "Fraccion= " + numerador + "/" + denominador;
    }

}
