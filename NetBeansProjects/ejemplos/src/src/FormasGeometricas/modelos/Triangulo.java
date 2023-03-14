package src.FormasGeometricas.modelos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Triangulo {

    protected double lado1;
    protected double lado2;
    protected double base;
    protected double altura;

    private Color colorForma;
    private Color colorLinea;

    public Triangulo(double lado1, double lado2, double lado3, double altura, Color colorLinea, Color colorForma) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = lado3;
        this.altura = altura;
        this.colorForma = colorForma;
        this.colorLinea = colorLinea;
    }

    public Triangulo() {
        this.lado1 = 1;
        this.lado2 = 2;
        this.base = 3;
        this.altura = 4;
    }

    //GETTERS AND SETTERS
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public Color getColorForma() {
        return colorForma;
    }

    public void setColorForma(Color colorForma) {
        this.colorForma = colorForma;
    }

    public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //FUNCIONES
    public double area() {
        double area = (this.base * this.altura) / 2;
        return area;
    }

    public double perimetro() {
        double area = this.lado1 + this.lado2 + this.base;
        return area;
    }

    public void pintar() {
        System.out.println("   /\\ ");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println("/______\\");
    }

    @Override
    public String toString() {
        return "trinagulo ---> con lado1: " + this.lado1 + " lado 2 "
                + this.lado2 + "base : " + this.base + "altura: " + this.altura
                + "el color de la forma es : " + this.colorForma + "y el color de la linea es:" + this.colorLinea;
    }

}
