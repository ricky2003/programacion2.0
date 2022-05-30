package practicaprograii.ModeloJuego.Juego.Instalaciones;

import java.util.ArrayList;
import java.util.Random;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion.Exhibicion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Instalacion extends Entidad {

    private int MovimientosAlimento;
    private int moendad_Por_Unida_de_Alimento;
    private int costeDeContruccion;
    private int unidadesAlimentacion;
    private int hectareas;
    private TipoRecinto tipoRecinto;
    private TipoMedio tipoMedio;
    private TipoAlimentacion tipoDeAlimentacion;
    private ArrayList<Dinosaurio> DinosauriosDeInsatalacion;
    private int maximonumerodinosaurio;

    public Instalacion(int CosteDeContruccion, int MaximoNumeroDinosaurio, int alimento, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        super();//este super te da el id del jugador ;
        this.costeDeContruccion = CosteDeContruccion;
        this.hectareas = Hectareas;
        this.tipoRecinto = TipoRecinto;
        this.maximonumerodinosaurio = MaximoNumeroDinosaurio;
        this.tipoMedio = TipoMedio;
        this.tipoDeAlimentacion = TipoDeAlimentacion;
        this.unidadesAlimentacion = alimento;
        this.moendad_Por_Unida_de_Alimento = 5;
        this.DinosauriosDeInsatalacion = new ArrayList();

    }

    public Instalacion() {
        super();
        this.costeDeContruccion = 25000;
        this.hectareas = 700;
        this.tipoRecinto = TipoRecinto.ELECTRIFICADO;
        this.maximonumerodinosaurio = 7;
        this.tipoMedio = TipoMedio.ACUATICO;
        this.tipoDeAlimentacion = TipoAlimentacion.CARNIVORO;
        this.unidadesAlimentacion = 5;
        this.moendad_Por_Unida_de_Alimento = 5;
        this.DinosauriosDeInsatalacion = new ArrayList();
    }

    public boolean clonar(Dinosaurio d) {
        Random rand = new Random();

        int numeroAzar = rand.nextInt(this.DinosauriosDeInsatalacion.size());

        Dinosaurio DinoElegido = this.DinosauriosDeInsatalacion.get(numeroAzar);

        this.DinosauriosDeInsatalacion.add(d);

        boolean clon = this.añadirDinosaurio(d);
        return this.DinosauriosDeInsatalacion.add(d);

    }

    public boolean ElimnacionDinosaurio(Dinosaurio d) {
        if (Full()) {

            this.DinosauriosDeInsatalacion.remove(d);
        } else {
            System.out.println("no pude estar aqui ese dinosaurio");
        }
        return this.DinosauriosDeInsatalacion.remove(d);
    }

    public boolean añadirDinosaurio(Dinosaurio d) {
        if (hayHueco()) {
            this.DinosauriosDeInsatalacion.add(d);
        } else {
            System.out.println("no hay espacio");
        }
        return this.DinosauriosDeInsatalacion.add(d);
    }

    public boolean existeDinosaurio(Dinosaurio d) {

        return this.DinosauriosDeInsatalacion.contains(d);

    }

    public Dinosaurio trasladaDinosaurio(Dinosaurio d, Exhibicion ie) {

        if (this.existeDinosaurio(d)) {
            if (ie.hayHueco()) {
                ie.añadirDinosaurio(d);
                this.ElimnacionDinosaurio(d);
            } else {
                System.out.println("no hay hueco");
            }
        } else {
            System.out.println("el dinosaurio no existe ");
        }
        return d;
    }

    public ArrayList<Dinosaurio> getDinosauriosDeInsatalacion() {
        return DinosauriosDeInsatalacion;
    }

    public ArrayList setDinosauriosDeInsatalacion(ArrayList<Dinosaurio> DinosauriosDeInsatalacion) {
        return this.DinosauriosDeInsatalacion = DinosauriosDeInsatalacion;
    }

    public boolean hayHueco() {
        return this.DinosauriosDeInsatalacion.size() < this.maximonumerodinosaurio;
    }

    public boolean Full() {
        return this.DinosauriosDeInsatalacion.size() < this.maximonumerodinosaurio;
    }

    public int añadircomida(int comida) {
        int capacidad = 3 * this.costeDeContruccion - this.unidadesAlimentacion;
        if (capacidad >= comida) {
            comida += comida;
        }
        return comida;

    }

    public int getCosteDeContruccion() {
        return costeDeContruccion;
    }

    public void setCosteDeContruccion(int costeDeContruccion) {
        this.costeDeContruccion = costeDeContruccion;
    }

    @Override
    public String toString() {

        return "Instalacion{" + "Movimientos de los Alimento=" + MovimientosAlimento
                + ", moendad_Por_Unida_de_Alimento=" + moendad_Por_Unida_de_Alimento
                + ", coste De Contruccion=" + costeDeContruccion
                + ", unidade por Alimentacion=" + unidadesAlimentacion
                + ", hectareas=" + hectareas + ", tipo Recinto=" + tipoRecinto
                + ", tipo Medio=" + tipoMedio + ", tipo De Alimentacion=" + tipoDeAlimentacion
                + ", Dinosaurios De la Insatalacion=" + DinosauriosDeInsatalacion
                + ", maximo numero dinosaurio=" + maximonumerodinosaurio + '}';

    }

}
