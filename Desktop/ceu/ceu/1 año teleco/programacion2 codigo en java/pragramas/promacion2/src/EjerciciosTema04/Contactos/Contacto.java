package EjerciciosTema04.Contactos;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Contacto {

    private String nombre;
    private String E_mail;
    private int NumeroTelefono;

    public Contacto(String nombre, String E_mail, int NumeroTelefono) {
        this.nombre = nombre;
        this.E_mail = E_mail;
        this.NumeroTelefono = NumeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public int getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(int NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Contacto {" + "nombre= " + nombre + ", E_mail= " + E_mail + ", NumeroTelefono= " + NumeroTelefono + "}";
    }

}
