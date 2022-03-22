package formas.data;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public abstract class FormaGeometrica implements FormaCalculable {
    //las interfaces se utiliza implements y pude haber muchos
    //se abstracto significa que no pude tener instancias

    private Color ColorLinea;
    private Color ColorForma;

    public FormaGeometrica() {
        this(Color.NEGRO, Color.AZUL);
    }

    public FormaGeometrica(Color colorLinea, Color colorForma) {
        this.ColorForma = colorForma;
        this.ColorLinea = colorLinea;
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

    public void pintar() {
        System.out.println("ColorForma: "
                + getColorForma()
                + ",ColorLinea: "
                + getColorLinea());

    }

}
