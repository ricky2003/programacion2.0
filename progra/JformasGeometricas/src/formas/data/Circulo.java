package formas.data;

/**
 *
 * Clase que implenenta los datos del circulo
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Circulo extends FormaGeometrica {

    private double radio;

    public Circulo() {

        this(1, Color.AMARILLO, Color.AZUL);
    }

    /**
     *
     * @param radio
     * @param colorLinea
     * @param colorForma
     */
    public Circulo(double radio, Color colorLinea, Color colorForma) {
        super(colorLinea, colorForma);
        this.radio = radio;

    }

    @Override
    public double getArea() {

        return 2 * Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    //GETTER Y SETTERS
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double nuevoRadio) {
        this.radio = nuevoRadio;
    }

    @Override
    public String toString() {
        return "Circulo {" + "colorLinea=" + getColorLinea() + ", colorForma= "
                + getColorForma() + ", radio=" + radio + '}';
    }

    public void forma() {
        System.out.println("la forma del circulo es ");
        System.out.println("   /--------------\\  ");
        System.out.println("  /                \\");
        System.out.println(" /                  \\");
        System.out.println("|                    |");
        System.out.println(" \\                  /");
        System.out.println("  \\                /");
        System.out.println("   \\______________/");
    }

    @Override
    public void pintar() {
        System.out.println(">-------------------------------------");
        System.out.println("Soy un circulo de color ");
        super.pintar();
        System.out.println("radio= " + this.radio);

        System.out.println("el area es: " + this.getArea()
                + " y mi perimetro es : " + this.getPerimetro());
        System.out.println(">-------------------------------------");
    }
}
