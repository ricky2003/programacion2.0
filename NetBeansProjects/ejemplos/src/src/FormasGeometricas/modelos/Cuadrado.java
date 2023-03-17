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

    public void setLado(double lado) {
        this.setLado1(lado);
        this.setLado2(lado);
    }

    public double getLado() {
        return this.getLado1();
    }
//FUNCIONES

    @Override
    public void Pintar() {
        super.Pintar();
        System.out.println("-----------");
        System.out.println("|         |");
        System.out.println("|         |");
        System.out.println("|_________|");

    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + this.getLado() + ", colorLinea="
                + this.getColorLinea() + ", colorForma=" + this.getColorForma() + '}';
    }

}
