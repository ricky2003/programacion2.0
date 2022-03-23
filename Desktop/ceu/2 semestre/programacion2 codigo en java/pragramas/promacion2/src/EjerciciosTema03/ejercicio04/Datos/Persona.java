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
    • esMayorDeEdad()

    : indica si es mayor de edad, devuelve un booleano.
    • toString(): devuelve toda la información de la persona como una cadena de
    caracteres.
    • Métodos set de cada parámetro, excepto de DNI.
    Crea una clase DNI, que deberá contener:

    Un constructor con un número.
    Un constructor con el número y la letra.
    Un constructor con un String que contenga el número y la letra sin separación.
    Un constructor por defecto que genere un DNI correcto.
    La clase, además, deberá contener el método toString(), que ofrecerá una cadena de caracteres que representará el DNI.
    Ahora, crea una clase ejecutable que haga lo siguiente:
    • Pide por teclado el nombre, la edad, sexo, peso y altura.
    • Crea 3 objetos de la clase anterior. El primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último
    utiliza los métodos set para darle a los atributos un valor.
    • Para cada objeto, se deberá comprobar si está en su peso ideal, tiene
    sobrepeso o por debajo de su peso ideal con un mensaje.
    • Indicar para cada objeto si es mayor de edad.
    • Por último, mostrar la información de cada objeto.
 */
/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public final class Persona extends DNI {
    //esto se denomina atributos.

    private int edad, peso;
    private int altura;//altura en centimetros
    private int numeroDNI;
    private String nombre;
    private String letraDNI;

    private enum sexo {
        HOMBRE, MUJER
    }

    private enum MasaCorporal {
        PorDebajoDeSuPesoIdeal, PesoIdeal, SOBREPESO
    }

    public Persona() {
        this.edad = 12;
        this.numeroDNI = 0;
        this.peso = 50;
        this.altura = 170;
        this.nombre = null;
        this.letraDNI = null;
        this.Sexo(sexo.MUJER);
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        this.Sexo(sexo.MUJER);
    }

    public Persona(int edad, int peso, int altura, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        this.Sexo(sexo.MUJER);
        this.peso = 50;
        this.altura = 170;
    }

    public Persona(int edad, int peso, int altura, int numeroDNI, String nombre, String letraDNI) {
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.numeroDNI = numeroDNI;
        this.nombre = nombre;
        this.letraDNI = letraDNI;
        this.Sexo(sexo.HOMBRE);
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

    sexo Sexo(sexo Hombre) {
        return sexo.valueOf(nombre);

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

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Persona =" + "edad:" + edad + ", peso:" + peso + ", altura:" + altura + ", nombre:" + nombre;
    }

    //metodos importantes
    //indice de la masa corporal de la poersona
    public int calcularIMC(int imc) {
        imc = this.peso * ((this.altura / 100) ^ 2);
        return imc;
    }

    public void ValorarPesoCorporal() {
        int imc = 0;
        this.calcularIMC(imc);
        if (imc > 25) {
            //decir que tiene sobre peso
        } else if (imc < 18) {
            //por debajo de su peso ideal
        } else {
            //estan en su peso ideal
        }
    }

}
