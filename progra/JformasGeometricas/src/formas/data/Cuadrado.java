package formas.data;

/**
 *
 * Clase que implenenta los datos del Cuadrado
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Cuadrado extends Rectangulo {
    //hereda las cosas del rectangulo

    /**
     * crea un cuadrado de lado 1 y los colores por defecto
     */
    public Cuadrado() {

        this(1);
    }

    /**
     *
     * @param lado
     * @param colorLinea
     * @param colorForma
     */
    public Cuadrado(double lado, Color colorLinea, Color colorForma) {
        super(lado, lado, colorLinea, colorForma);
    }

    public Cuadrado(double lado) {
        this(lado, Color.ROJO, Color.VERDE);

    }

    /**
     *
     * @return te da el lado1
     */
    public double getLado() {
        return super.getLado1();
    }

    public void setLado(double lado) {
        super.setLado1(lado);
        super.setLado2(lado);

    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cuadrado {" + "colorLinea=" + getColorLinea() + ", colorForma= "
                + getColorForma() + ", lado=" + this.getLado() + '}';
    }

    @Override
    public void forma() {
        System.out.println("la forma del cuadrado es ");
        System.out.println(" __________________");
        System.out.println("|                  |");
        System.out.println("|                  |");
        System.out.println("|                  |");
        System.out.println("|                  |");
        System.out.println("|                  |");
        System.out.println("|__________________|");
    }

    @Override
    public void pintar() {
        System.out.println(">-------------------------------------");
        System.out.println("Soy un cuadrado de color ");
        super.pintar();
        System.out.println("lado= " + this.getLado());

        System.out.println("el area es: " + this.getArea()
                + " y mi perimetro es : " + this.getPerimetro());
        System.out.println(">-------------------------------------");
    }
}
