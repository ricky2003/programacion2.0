package src.FormasGeometricas.modelos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public abstract class FormasGeometricas {

    protected Color ColorLinea;
    protected Color ColorForma;

    public FormasGeometricas(Color ColorLinea, Color ColorForma) {
        this.ColorLinea = ColorLinea;
        this.ColorForma = ColorForma;

    }

    public FormasGeometricas() {
        this.ColorLinea = Color.BLANCO;
        this.ColorForma = Color.NEGRO;

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

    public abstract double getArea();//te obliga a pener en las clase hijas un get area

    public abstract double getPerimetro();

    public void Pintar() {

        System.out.println(" esto es una forma geometrica con : ");

    }

}
