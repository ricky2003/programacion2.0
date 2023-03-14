package src.FormasGeometricas.modelos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Rectangulo {

    private double lado1;
    private double lado2;

    protected Color colorLinea;
    protected Color colorForma;

    public Rectangulo(double lado1, double lado2, Color colorLinea, Color colorForma) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        if (lado1 > 0 && lado2 > 0) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        } else {
            this.lado1 = 0;
            this.lado2 = 0;
        }
        this.colorLinea = colorLinea;
        this.colorForma = colorForma;
    }

    public Rectangulo() {
        this.lado1 = 1;
        this.lado2 = 1;

        this.colorLinea = Color.BLANCO;
        this.colorForma = Color.NEGRO;
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

    public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

    public Color getColorForma() {
        return colorForma;
    }

    public void setColorForma(Color colorForma) {
        this.colorForma = colorForma;
    }

    //FUNCIONES
    public double getArea() {
        double areaReactangulo = 0;

        areaReactangulo = lado1 * lado2;
        return areaReactangulo;

    }

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

    public void Pintar() {

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
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2
                + ", colorLinea=" + colorLinea + ", colorForma=" + colorForma + '}';
    }

}
