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
    public NumeroRacional(int numerador, int denominador) throws Exception {
        if (denominador == 0) {
            throw new Exception();
        }
        this.numerador = numerador;
        this.denominador = denominador;

    }

    public NumeroRacional() throws Exception {
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

    //metodos que te ayudaran ha hacer la simplificacion
    public int mcm(int numerador, int denominador) {
        return (numerador * denominador) / this.MaximoComunDivisor(numerador, denominador);
    }//esta funcion se utilizaria en el caso de que quiras simplificar la suna pero en este ejercicios no te lo dicen

    public int MaximoComunDivisor(int numerador, int denominador) {
        int contador = 0;//servira para no perder el denominador
        while (denominador != 0) {
            contador = denominador;
            denominador = numerador % denominador;
            numerador = contador;
        }
        return numerador;
    }
    //metodos importrantes

    public NumeroRacional suma(NumeroRacional r2) throws Exception {
        NumeroRacional Resultadosuma = new NumeroRacional(this.getNumerador() * r2.getDenominador() + this.getDenominador() * r2.getNumerador(), this.getDenominador() * r2.getDenominador());

        return Resultadosuma;
    }

    public NumeroRacional mult(NumeroRacional r2) throws Exception {
        int DenominadorComun = this.getDenominador() * r2.getDenominador();
        int NumeradorComun = this.getNumerador() * r2.getNumerador();
        NumeroRacional resultadoProducto = new NumeroRacional(NumeradorComun, DenominadorComun);
        return resultadoProducto;
    }

    public NumeroRacional simplificar(NumeroRacional r2) throws Exception {
        int mcd = this.MaximoComunDivisor(this.getNumerador(), this.getDenominador());
        int NumeradorComun = this.getNumerador() / mcd;
        int DenominadorComun = this.getDenominador() / mcd;
        NumeroRacional resultadoSimplificado = new NumeroRacional(NumeradorComun, DenominadorComun);
        return resultadoSimplificado;

    }

    @Override
    public String toString() {
        return "Fraccion= " + numerador + "/" + denominador;
    }

}
