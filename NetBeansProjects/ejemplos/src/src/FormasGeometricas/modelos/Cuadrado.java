package src.FormasGeometricas.modelos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado(double lado, Color colorLinea, Color colorForma) {
        super(lado, lado, colorLinea, colorForma);

    }

    public Cuadrado() {
        super(1, 1, Color.NEGRO, Color.BLANCO);
    }
//SETTERS AND GETTERS

    /* public double getLado() {
        return getLado1();
    }

    public void setLado(double lado) {
        setLado1(lado);
        setLado2(lado);
    }*/
    public void setLado(double lado) {
        super.setLado1(lado);
        super.setLado2(lado);
    }

    public double getLado() {
        return super.getLado1();
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
//FUNCIONES

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
