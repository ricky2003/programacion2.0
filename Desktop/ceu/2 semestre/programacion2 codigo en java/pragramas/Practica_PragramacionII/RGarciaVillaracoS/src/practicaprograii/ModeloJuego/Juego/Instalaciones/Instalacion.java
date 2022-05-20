package practicaprograii.ModeloJuego.Juego.Instalaciones;

import java.util.ArrayList;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Entidad.Entidad;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoAlimentacion;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoMedio;
import practicaprograii.ModeloJuego.Juego.Tipo.TipoRecinto;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class Instalacion extends Entidad {

    public int MovimientosAlimento;
    public int moendad_Por_Unida_de_Alimento;
    private int costeDeContruccion;
    private int unidadesAlimentacion;
    private int hectareas;
    private TipoRecinto tipoRecinto;
    private TipoMedio tipoMedio;
    private TipoAlimentacion tipoDeAlimentacion;
    private ArrayList<Dinosaurio> DinosauriosDeInsatalacion = new ArrayList();
    private int numerodinosaurio;

    public Instalacion(int CosteDeContruccion, int numeroDinosaurio, int alimento, int Hectareas, TipoRecinto TipoRecinto, TipoMedio TipoMedio, TipoAlimentacion TipoDeAlimentacion) {
        super();//este super te da el id del jugador ;
        this.costeDeContruccion = CosteDeContruccion;
        this.hectareas = Hectareas;
        this.tipoRecinto = TipoRecinto;
        this.numerodinosaurio = numeroDinosaurio;
        this.tipoMedio = TipoMedio;
        this.tipoDeAlimentacion = TipoDeAlimentacion;
        this.unidadesAlimentacion = alimento;
        this.moendad_Por_Unida_de_Alimento = 5;

    }

    public void ElimnacionDinosaurio(Dinosaurio d) {
        this.DinosauriosDeInsatalacion.remove(d);
    }

    public void añadirDinosaurio(Dinosaurio d) {
        this.DinosauriosDeInsatalacion.add(d);
    }

    public boolean existeDinosaurio(Dinosaurio d) {
        return this.DinosauriosDeInsatalacion.contains(d);
    }

    public boolean hayHueco() {
        return this.DinosauriosDeInsatalacion.size() < this.numerodinosaurio;
    }

    public boolean Full() {
        return this.DinosauriosDeInsatalacion.size() < this.numerodinosaurio;
    }

}
