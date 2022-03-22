package formas.data;

/**
 *
 * Clase que implenenta los datos del cuadrao
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Rectangulo extends FormaGeometrica {

    private double lado1;
    private double lado2;

    //estos dos se denominan constructores
    //el objetivo de un constructor es dar valores iniciales a su estructura
    public Rectangulo() {
        //llama al constructor que tenga los valres que tu des en este caso dos doubles y dos variables color
        this(1, 3, Color.BLANCO, Color.NEGRO);
    }
    // this apunta al objeto

    /**
     *
     * @param lado1
     * @param lado2
     * @param colorLinea
     * @param colorForma
     */
    public Rectangulo(double lado1, double lado2, Color colorLinea, Color colorForma) {
        super(colorLinea, colorForma);
        this.lado1 = lado1;
        this.lado2 = lado2;

    }

    /**
     *
     * @return te da el area
     */
    @Override
    public double getArea() {

        return this.lado1 * this.lado2;
    }

    /**
     *
     * @return te da el perimero
     */
    @Override
    public double getPerimetro() {
        return 2 * this.lado1 + 2 * this.lado2;
    }

    /**
     *
     * @return te da el lado 1
     */
    //GETTERS Y SETTERS
    public double getLado1() {
        return this.lado1;
    }

    /**
     *
     * @param nuevoLado1
     */
    public void setLado1(double nuevoLado1) {
        this.lado1 = nuevoLado1;
    }

    /**
     *
     * @return te da el lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     *
     * @param nuevoLado2
     */
    public void setLado2(double nuevoLado2) {
        this.lado2 = nuevoLado2;

    }

    /**
     *
     * @return te devuelve el string de todo del rectangulo
     */
    @Override//override aparece en donde aparece lo de set y get (insert code)
    public String toString() {
        return "Rectangulo {" + "colorLinea=" + getColorLinea() + ", colorForma= "
                + getColorForma() + ", lado1=" + lado1 + ", lado2="
                + lado2 + '}';
    }

    public void forma() {
        System.out.println("la forma del rectangulo es ");
        System.out.println("________________________");
        System.out.println("|                       |");
        System.out.println("|                       |");
        System.out.println("|                       |");
        System.out.println("|                       |");
        System.out.println("|                       |");
        System.out.println("|_______________________|");
    }

    @Override
    public void pintar() {
        System.out.println(">-------------------------------------");
        System.out.println("Rectangulo ");
        super.pintar();
        System.out.println("lado1= " + this.lado1);
        System.out.println("lado2= " + this.lado2);
        System.out.println("el area es: " + this.getArea()
                + " y mi perimetro es : " + this.getPerimetro());
        System.out.println(">-------------------------------------");
    }

}
