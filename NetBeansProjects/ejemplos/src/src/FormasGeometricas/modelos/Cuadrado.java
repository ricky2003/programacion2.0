package src.FormasGeometricas.modelos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado(int lado, Color colorLinea, Color colorForma) {
        super(lado, lado, colorLinea, colorForma);

    }

    public Cuadrado() {
        super(1, 1, Color.NEGRO, Color.BLANCO);
    }

    public double getLado() {
        return getLado1();
    }

    public void setLado(double lado) {
        setLado1(lado);
        setLado2(lado);
    }

    @Override
    public Color getColorLinea() {
        return colorLinea;
    }

    @Override
    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

    @Override
    public Color getColorForma() {
        return colorForma;
    }

    @Override
    public void setColorForma(Color colorForma) {
        this.colorForma = colorForma;
    }

    public void Pintar() {

        System.out.println("-----------");
        System.out.println("|         |");
        System.out.println("|         |");
        System.out.println("|_________|");

    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + getLado() + ", colorLinea="
                + colorLinea + ", colorForma=" + colorForma + '}';
    }

}
