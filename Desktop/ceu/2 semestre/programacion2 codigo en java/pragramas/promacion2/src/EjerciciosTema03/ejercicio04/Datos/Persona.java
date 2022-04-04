package EjerciciosTema03.ejercicio04.Datos;

/*Haz una clase llamada Persona con atributos
    nombre , edad, DNI, sexo (usa un enumerado
    ), peso y altura.Crea métodos para acceder y modificar todos los atributos(excepto el DNI).
    Por defecto, todos los atributos menos el DNI tendrán valores por defecto según su tipo (números -> 0, String -> cadena vacía, etc.). Sexo será mujer por defecto. La clase deberá tener los siguientes constructores:
    • Un constructor por defecto.
    • Un constructor con el nombre, edad y sexo (el resto por defecto).
    • Un constructor con todos los atributos como parámetro, menos el DNI (por
    defecto).
    • Un constructor con todos los atributos.
    La clase deberá tener los siguientes métodos:
    • calcularIMC(): calcula el índice de masa corporal de la persona. La fórmula es la siguiente: peso/(altura^2). La altura deberá estar especificada en metros y el peso en kilogramos.
    • valorarPesoCorporal() devolverá un enumerado que indique si el individuo está por debajo de su peso ideal, en su peso ideal o tiene sobrepeso. Sobrepeso se define como IMC > 25 y se considera que se está por debajo del peso ideal si IMC <18.
    • esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    • toString(): devuelve toda la información de la persona como una cadena de
    caracteres.
    • Métodos set de cada parámetro, excepto de DNI.

 */
/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public final class Persona {
    //esto se denomina atributos.

    private int edad, peso;
    private int altura;//altura en centimetros
    private DNI dni;
    private String nombre;
    private Sexo sexo;

    public Persona() {
        this.edad = 12;
        this.peso = 50;
        this.altura = 170;
        this.nombre = null;
        this.sexo = Sexo.MUJER;

    }

    public Persona(int edad, String nombre, Sexo sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.altura = 180;
        this.peso = 70;

    }

    public Persona(int edad, int peso, int altura, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = Sexo.MUJER;
        this.peso = 50;
        this.altura = 170;

    }

    /**
     *
     * @param edad
     * @param peso
     * @param altura
     * @param nombre
     * @param sexo
     */
    public Persona(int edad, int peso, int altura, String nombre, Sexo sexo) {
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
        this.sexo = Sexo.HOMBRE;
    }

//esto se denomina metodos .
    int Edad(int edad) {
        return edad;
    }

    int Peso(int peso) {
        return peso;
    }

    int Altura(int altura) {
        return altura;
    }

    String Nombre(String nombre) {
        return nombre;
    }

    //GETTERS AND SETTERS
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo hombre, Sexo mujer) {

        this.sexo = hombre;
        this.sexo = mujer;
    }

    @Override
    public String toString() {
        return "Persona: " + "edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", DNIcompleto=" + dni + ", nombre=" + nombre + ", sexo= " + sexo;
    }

    //metodos importantes
    public int calcularIMC() {
        int imc = this.peso * ((this.altura / 100) ^ 2);
        return imc;
    }

    public MasaCorporal ValorarPesoCorporal() {
        MasaCorporal resultado = null;
        int imc = 0;
        imc = this.calcularIMC();
        if (imc > 25) {
            resultado = MasaCorporal.SOBREPESO;

        } else if (imc < 18) {
            resultado = MasaCorporal.POR_DEBAJO_DE_SU_PESO_IDEAL;
        } else {
            resultado = MasaCorporal.PESO_IDEAL;
        }
        return resultado;
    }

    public boolean EsMayorDeEdad() {
        boolean mayorEdad = false;
        if (this.getEdad() >= 18) {

            mayorEdad = true;
        } else {
            mayorEdad = false;
        }
        return mayorEdad;
    }

}
