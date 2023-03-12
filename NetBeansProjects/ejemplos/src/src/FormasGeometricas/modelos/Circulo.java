package src.FormasGeometricas.modelos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Circulo {

    private double radio;
    private Color ColorLinea;
    private Color ColorForma;

    public Circulo(int radio, Color ColorForma, Color ColorLinea) {
        this.radio = radio;
        this.ColorLinea = ColorLinea;
        this.ColorForma = ColorForma;
    }

    public Circulo() {
        this.radio = 1;
        this.ColorLinea = Color.NEGRO;
        this.ColorForma = Color.BLANCO;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Color getColorLinea() {
        return ColorLinea;
    }

    public void setColorLinea(Color ColorLinea) {
        this.ColorLinea = ColorLinea;
    }

    public Color getColorForma() {
        return ColorForma;
    }

    public void setColorForma(Color ColorForma) {
        this.ColorForma = ColorForma;
    }

    public double Area() {
        double area = (double) Math.PI * (Math.pow(this.radio, 2));
        return area;
    }

    public double Perimetro() {
        double perimetro = 2 * Math.PI * this.radio;
        return perimetro;
    }

    public void Pintar() {
        System.out.println("    _____");
        System.out.println("   /     \\");
        System.out.println("  |       |");
        System.out.println("  |       |");
        System.out.println("   \\_____/");
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", ColorLinea=" + ColorLinea + ", ColorForma=" + ColorForma + '}';
    }

}
