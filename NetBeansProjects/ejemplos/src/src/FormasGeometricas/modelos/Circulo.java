package src.FormasGeometricas.modelos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Circulo extends FormasGeometricas {

    private double radio;

    public Circulo(double radio, Color ColorForma, Color ColorLinea) {
        super(ColorForma, ColorLinea);
        this.radio = radio;
    }

    public Circulo() {
        this(1, Color.BLANCO, Color.NEGRO);
    }
    //SETTERS AND GETTERS

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //FUNCIONES
    @Override
    public double getArea() {
        double area = (double) Math.PI * (Math.pow(this.radio, 2));
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro = 2 * Math.PI * this.radio;
        return perimetro;
    }

    @Override
    public void Pintar() {
        super.Pintar();
        System.out.println("area :" + this.getArea() + "perimetro :" + this.getPerimetro());

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
