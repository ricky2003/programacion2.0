package formas.data;

/**
 *
 * Clase que implenenta los datos del Triangulo
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Triangulo extends FormaGeometrica {

    //caso de lado equilatero
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public Triangulo() {

        this(1, 1, 3, 4, Color.BLANCO, Color.NEGRO);
    }

    /**
     *
     * @param base
     * @param altura
     * @param lado1
     * @param lado2
     * @param colorLinea
     * @param colorForma
     */
    public Triangulo(double base, double altura, double lado1, double lado2,
            Color colorLinea, Color colorForma) {
        super(colorLinea, colorForma);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;

    }

    @Override
    public double getArea() {

        return (this.base * this.altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return this.lado2 + this.lado2 + this.base;
    }

    //GETTER Y SETTERS
    public double getBase() {
        return this.base;
    }

    public void setBase(double nuevaBase) {
        this.base = nuevaBase;
    }

    public double getLado1() {
        return lado1;

    }

    public double getLado2() {
        return lado2;

    }

    public void setLado1(double nuevoLado1) {
        this.lado1 = nuevoLado1;

    }

    public void setLado2(double nuevoLado2) {
        this.lado1 = nuevoLado2;

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double nuevaAltura) {
        this.altura = nuevaAltura;
    }

    @Override
    public String toString() {
        return "Triangulo {" + "colorLinea=" + getColorLinea() + ", colorForma= "
                + getColorForma() + ", base=" + base + ", altura="
                + altura + ",lado1= " + lado1 + ",lado2= " + lado2 + '}';
    }

    public void forma() {
        System.out.println("la forma del Triangulo es ");
        System.out.println("      /^\\");
        System.out.println("     /   \\");
        System.out.println("    /     \\");
        System.out.println("   /       \\");
        System.out.println("  /         \\");
        System.out.println(" /           \\");
        System.out.println("/_____________\\");
    }

    @Override
    public void pintar() {
        System.out.println(">-------------------------------------");
        System.out.println("Soy un Triangulo de color ");
        super.pintar();
        System.out.println("base=" + this.base);
        System.out.println("altura= " + this.altura);
        System.out.println("lado= " + this.lado1);
        System.out.println("lado= " + this.lado2);
        System.out.println("el area es: " + this.getArea()
                + " y mi perimetro es : " + this.getPerimetro());
        System.out.println(">-------------------------------------");
    }

}
