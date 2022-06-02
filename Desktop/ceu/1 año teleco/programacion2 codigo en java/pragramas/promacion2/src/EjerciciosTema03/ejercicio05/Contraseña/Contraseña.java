package EjerciciosTema03.ejercicio05.Contraseña;

/**
 * Haz una clase llamada Password que tenga los atributos longitud y contraseña.
 * Por defecto, la longitud de la contraseña será de 8 caracteres. Los
 * constructores serán los siguiente: • Un constructor por defecto que tendrá
 * como contraseña "password". • Un constructor con la longitud que nosotros le
 * pasemos, Generará una contraseña alfanumérica aleatoria con esa longitud. Los
 * métodos de esta clase serán: • esFuerte(): devuelve un booleano si es fuerte
 * o no. Para que sea fuerte debe tener más de 2 mayúsculas, más de 1 minúscula
 * y más de 5 números.generarPassword(): genera la contraseña del objeto con la
 * longitud que tenga. • Método get para contraseña y longitud. • Método set
 * para longitud.
 *
 *
 *
 *
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Contraseña {

    private int longitud;
    //por defecto tiene como maximo 8 letras
    private String contraseña;

    public Contraseña() {
        this.longitud = 8;
        this.contraseña = "password";
    }

    /**
     *
     * @param longitud
     * @param contraseña
     */
    public Contraseña(int longitud, String contraseña) {
        this.longitud = longitud;
        this.contraseña = contraseña;
    }

    public static String ContraseñaAlfanumerica(int longitud) {
        longitud = 0;
        String contraseña = "";
        for (int i = 0; i <= longitud; i++) {
            int contador = (int) (Math.random() * 3);
            switch (contador) {
                case 0 -> {
                    char number = Contraseña.RandomNumber();
                    contraseña = contraseña + number;
                }

                case 1 -> {
                    char mayusculas = Contraseña.RandomMayusc();
                    contraseña = contraseña + mayusculas;
                }

                case 2 -> {
                    char minusculas = Contraseña.RandomMinu();
                    contraseña = contraseña + minusculas;
                }

            }

        }
        return contraseña;

    }

    public static char RandomNumber() {
        //Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        //aqui te lo pondra del MIN al MAX con el minimo y el maximo incluidos en esta seccion de numeros ;
        //Math.floor(Math.random() * (MAX - MIN + 1))+ MIN;
        //si pones aqui el ultimo MIN sera del 00 al 90;
        char numero = (char) Math.floor(Math.random() * (57 - 48) + 48);
        return numero;
    }

    public static char RandomMayusc() {
        char codigoAscii = (char) Math.floor(Math.random() * (90 - 65) + 65);
        return codigoAscii;
    }

    public static char RandomMinu() {
        char codigoAscii = (char) Math.floor(Math.random() * (122 - 97) + 97);
        return codigoAscii;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public static int ContadorMayusMinNum(int dimesion) {
        String password = "";
        int mayus = 0;
        int min = 0;
        int num = 0;

        password = Contraseña.ContraseñaAlfanumerica(dimesion);
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G'
                    || c == 'H' || c == 'I' || c == 'J' || c == 'K' || c == 'L' || c == 'M'
                    || c == 'N' || c == 'O' || c == 'P' || c == 'Q' || c == 'R'
                    || c == 'S' || c == 'T' || c == 'U' || c == 'V'
                    || c == 'W' || c == 'X' || c == 'Y'
                    || c == 'Z') {

                mayus++;
                return mayus;

            } else if (c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g'
                    || c == 'h' || c == 'i' || c == 'j' || c == 'k' || c == 'l' || c == 'm'
                    || c == 'n' || c == 'o' || c == 'p' || c == 'q' || c == 'r'
                    || c == 's' || c == 't' || c == 'u' || c == 'v'
                    || c == 'w' || c == 'x' || c == 'y'
                    || c == 'z') {

                min++;
                return min;
            } else if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6'
                    || c == '7' || c == '8' || c == '9') {

                num++;
                return num;
            }

        }
        return 0;
    }

    public static boolean esFuerte(int dimension) {
        String password = Contraseña.ContraseñaAlfanumerica(dimension);
        int mayus = 0;
        int min = 0;
        int num = 0;
        Contraseña.ContadorMayusMinNum(dimension);
        boolean fuerte;

        if (mayus >= 2 && min >= 1 && num >= 5) {
            fuerte = true;
        } else {
            fuerte = false;
        }
        return fuerte;
    }

}
