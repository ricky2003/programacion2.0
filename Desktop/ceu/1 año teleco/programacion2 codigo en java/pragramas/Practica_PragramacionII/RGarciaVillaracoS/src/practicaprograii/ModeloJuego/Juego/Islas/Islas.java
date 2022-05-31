package practicaprograii.ModeloJuego.Juego.Islas;

import java.util.ArrayList;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Secreta.Secreta;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Islas extends Entidad {

    public int UnidadAlimento;
    public int MovimientosAlimento;
    public int moendad_Por_Unida_de_Alimento;
    public int hectareas;
    private ArrayList<Instalacion> InstalacionesDeLaIsla;

    public Islas(int UnidadAlimento, int hectareas, int MovimietosAlimento) {
        super();//este super te da el id del jugador ;
        this.UnidadAlimento = UnidadAlimento;
        this.moendad_Por_Unida_de_Alimento = 5;
        this.MovimientosAlimento = MovimietosAlimento;
        this.hectareas = hectareas;
        this.InstalacionesDeLaIsla = new ArrayList();
    }

    public int UnidadesDeAlimento() {
        return this.UnidadAlimento = this.hectareas * 3;
    }

    public int MovimietosAlimento() {
        return this.MovimientosAlimento = this.UnidadAlimento / 4;
    }

    public ArrayList<Instalacion> getInstalacionesDeLaIsla() {
        return InstalacionesDeLaIsla;
    }

    public void setInstalacionesDeLaIsla(ArrayList<Instalacion> InstalacionesDeLaIsla) {
        this.InstalacionesDeLaIsla = InstalacionesDeLaIsla;
    }
//INSTALACIONES

    public boolean añadirIstalacion(Instalacion i) {
        if (hayHuecoenisla()) {

            this.InstalacionesDeLaIsla.add(i);

        }
        return this.InstalacionesDeLaIsla.add(i);
    }

    public boolean ElimnacionIsntalcion(Instalacion I, Entidad e) {
        if (ContieneLaInslacion(I, e) == false) {
            this.InstalacionesDeLaIsla.remove(I);
        }
        return this.InstalacionesDeLaIsla.remove(I);
    }

    public boolean ContieneLaInslacion(Instalacion I, Entidad e) {
        if (super.equals(e.getId())) {

            this.InstalacionesDeLaIsla.contains(I);

        } else {
            System.out.println("no esta en esta lista ");

        }
        return this.InstalacionesDeLaIsla.contains(I);

    }

    //ISLAS
    public void AñadirIsla(Instalacion in) {
        this.InstalacionesDeLaIsla.add(in);
    }

    public boolean hayHuecoenisla() {
        return this.InstalacionesDeLaIsla.size() < 4;
    }

    public void ElimnacionIsla(Secreta Is) {
        this.InstalacionesDeLaIsla.remove(Is);
    }
    //DINOSAURIOS

    public boolean existeDinosaurio(Secreta Is) {
        return this.InstalacionesDeLaIsla.contains(Is);
    }

    public boolean hayHuecoensecreta() {
        return this.InstalacionesDeLaIsla.size() < 4;
    }
    //METODOS

    public int DonacionFav(Dinosaurio d) {
        int DonFav;
        DonFav = 100 * (int) Math.pow(3, d.getEdadActual() - d.getEdadQueSeHaceAdulto()) * d.getValormedio();
        return DonFav;
    }

    public void trasladarComidaAInstalacion(int cantidad, Instalacion ins) {
        int trasladar = 0;
        if (this.moendad_Por_Unida_de_Alimento > cantidad) {
            ins.añadircomida(cantidad);
            trasladar = trasladar - cantidad;
        }

    }

    //TO_STRING
    @Override
    public String toString() {
        return "Islas{" + "UnidadAlimento=" + UnidadAlimento
                + ", MovimientosAlimento=" + MovimientosAlimento
                + ", moendad_Por_Unida_de_Alimento=" + moendad_Por_Unida_de_Alimento
                + ", hectareas=" + hectareas
                + ", InstalacionesDeLaIsla=" + InstalacionesDeLaIsla + '}';
    }

}
