package src.FormasGeometricas.modelos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Rectangulo extends FormasGeometricas {

    private double lado1;
    private double lado2;

    protected Color colorLinea;
    protected Color colorForma;

    public Rectangulo(double lado1, double lado2, Color colorLinea, Color colorForma) {
        super(colorLinea, colorForma);
        this.lado1 = lado1;
        this.lado2 = lado2;
        if (lado1 > 0 && lado2 > 0) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        } else {
            this.lado1 = 0;
            this.lado2 = 0;
        }
    }

    public Rectangulo() {
        this(1, 2, Color.NEGRO, Color.NEGRO);
    }

    //SETTERS AND GETTERS
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

    //FUNCIONES
    @Override
    public double getArea() {
        double areaReactangulo = 0;

        areaReactangulo = lado1 * lado2;
        return areaReactangulo;

    }

    @Override
    public double getPerimetro() {
        double perimetro = 0;
        if (lado1 >= 1 && lado2 >= 1) {
            perimetro = 2 * lado1 + 2 * lado2;
            return perimetro;
        } else {
            perimetro = 0;
            return perimetro;
        }

    }

    @Override
    public void Pintar() {
        super.Pintar();
        System.out.println("area :" + this.getArea() + "perimetro :" + this.getPerimetro());

    }

    public void Pintarractangulo() {
        System.out.println("-----------");
        System.out.println("|         |");
        System.out.println("|         |");
        System.out.println("|         |");
        System.out.println("|         |");
        System.out.println("|         |");
        System.out.println("|_________|");

    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + this.lado1 + ", lado2=" + this.lado2
                + ", colorLinea=" + this.getColorLinea() + ", colorForma=" + this.getColorForma() + '}';
    }

}
