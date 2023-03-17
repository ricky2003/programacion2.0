package src.FormasGeometricas.modelos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Triangulo extends FormasGeometricas {

    protected double base;
    protected double altura;
    protected double lado1;
    protected double lado2;

    public Triangulo(double lado1, double lado2, double base, double altura, Color colorLinea, Color colorForma) {
        super(colorLinea, colorForma);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;

    }

    public Triangulo() {
        super(Color.BLANCO, Color.NEGRO);
        this.lado1 = 1;
        this.lado2 = 1;
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
    @Override
    public double getArea() {
        double area = (this.base * this.altura) / 2;
        return area;
    }

    @Override
    public double getPerimetro() {
        double area = this.getLado1() + this.altura + this.base;
        return area;
    }

    public void pintar() {
        super.Pintar();
        System.out.println("area :" + this.getArea() + "perimetro :" + this.getPerimetro());
        System.out.println("   /\\ ");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println("/______\\");
    }

    @Override
    public String toString() {
        return "trinagulo ---> con lado1: " + this.lado1 + " lado 2 "
                + this.lado2 + "base : " + this.base + "altura: " + this.altura;
    }

}
