package practicaprograii.ModeloJuego.Juego.Jugador;

import practicaprograii.Dificultades.dificultades;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.*;
import practicaprograii.ModeloJuego.Juego.Islas.Crianza.Sorna;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.*;
import practicaprograii.ModeloJuego.Juego.utilidades.utilidades;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class JugadorTipo {

    private String Alias;
    private Sorna Crianza;
    private Nublar Exhibicion1;
    private Matanceros Exhibicion2;
    private SanDiego Exhibicion3;
    private Branchiosaurio DinosaurioFavorito1;
    private Mosasaurio DinosaurioFavorito2;
    private Velocirraptor DinosaurioFavorito3;
    private Pteranodon DinosaurioFavorito4;
    private TyrannosaurusRex DinosaurioFavorito5;
    private final dificultades Dificultad;
    private int monedasQueTieneas;
    private int monedasQueUtilizas;
    //centro de mando y el hsitorico
    //no se me ocurre como hacerlo

    public JugadorTipo(String Alias, dificultades Dificultad, Sorna Crianza, Nublar Exhibicion1, Velocirraptor DinosaurioFavorito, int monedasQueTienes) {
        this.Alias = Alias;
        this.Dificultad = Dificultad;
        this.Crianza = Crianza;
        this.Exhibicion1 = Exhibicion1;
        this.DinosaurioFavorito3 = DinosaurioFavorito;
        this.monedasQueTieneas = monedasQueTienes;
    }

    public JugadorTipo(String Alias, Sorna Sorna, SanDiego SanDiego, Velocirraptor velocirraptor) {
        this.Alias = Alias;
        this.Dificultad = dificultades.EXPLORADOR;
        this.Crianza = Sorna;
        this.Exhibicion3 = SanDiego;
        this.DinosaurioFavorito3 = velocirraptor;
        this.monedasQueTieneas = 1000000;

    }

    //GETTER Y SETTERS ALIAS
    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    //GETTER Y SETTERS ISLAS
    public Sorna getCrianza() {
        return Crianza;
    }

    public void setCrianza(Sorna Crianza) {
        this.Crianza = Crianza;
    }

    public Nublar getExhibicion1() {
        return Exhibicion1;
    }

    public void setExhibicion1(Nublar Exhibicion) {
        this.Exhibicion1 = Exhibicion;
    }

    public Matanceros getExhibicion2() {
        return Exhibicion2;
    }

    public void setExhibicion2(Matanceros Exhibicion) {
        this.Exhibicion2 = Exhibicion;
    }

    public SanDiego getExhibicion3() {
        return Exhibicion3;
    }

    public void setExhibicion3(SanDiego Exhibicion) {
        this.Exhibicion3 = Exhibicion;
    }

    //GETTER Y SETTERS DINOSAURIOS
    public Branchiosaurio getDinosaurioFavorito1() {
        return DinosaurioFavorito1;
    }

    public void setDinosaurioFavorito1(Branchiosaurio DinosaurioFavorito1) {
        this.DinosaurioFavorito1 = DinosaurioFavorito1;
    }

    public Mosasaurio getDinosaurioFavorito2() {
        return DinosaurioFavorito2;
    }

    public void setDinosaurioFavorito2(Mosasaurio DinosaurioFavorito2) {
        this.DinosaurioFavorito2 = DinosaurioFavorito2;
    }

    public Velocirraptor getDinosaurioFavorito3() {
        return DinosaurioFavorito3;
    }

    public void setDinosaurioFavorito3(Velocirraptor DinosaurioFavorito3) {
        this.DinosaurioFavorito3 = DinosaurioFavorito3;
    }

    public Pteranodon getDinosaurioFavorito4() {
        return DinosaurioFavorito4;
    }

    public void setDinosaurioFavorito4(Pteranodon DinosaurioFavorito4) {
        this.DinosaurioFavorito4 = DinosaurioFavorito4;
    }

    public TyrannosaurusRex getDinosaurioFavorito5() {
        return DinosaurioFavorito5;
    }

    public void setDinosaurioFavorito5(TyrannosaurusRex DinosaurioFavorito5) {
        this.DinosaurioFavorito5 = DinosaurioFavorito5;
    }

    public int getMonedasQueTieneas() {
        return monedasQueTieneas;
    }

    public void setMonedasQueTieneas(int monedasQueTieneas) {
        this.monedasQueTieneas = monedasQueTieneas;
    }

    public int getMonedasQueUtilizas() {
        return monedasQueUtilizas;
    }

    public void setMonedasQueUtilizas(int monedasQueUtilizas) {
        this.monedasQueUtilizas = monedasQueUtilizas;
    }

    public String Alias() {
        String alias;
        this.Alias = alias = null;
        alias = utilidades.LeeCadena("escribe tu nombre ");
        return alias;
    }

    public int numeromonedas() {
        int monedas = 0;
        while (null == Dificultad) {
            switch (Dificultad) {
                case PRINCIPIANTE:
                    monedas = 10000000;
                    break;
                case AFICIONADO:
                    monedas = 5000000;
                    break;
                case EXPLORADOR:
                    monedas = 1000000;
                    break;
                case EXPERTO:
                    monedas = 500000;
                    break;
                case PELICULA:
                    monedas = 250000;
                    //para conseguir mas monedas tendras que conseguir inversores como si fuera la vida real
                    //los cuales te dejen una cierta cantidad para que asi puedas comprar estancias
                    break;
                case REALISTA:
                    monedas = 100000;
                    //para conseguir mas monedas tendras que conseguir inversores como si fuera la vida real
                    //los cuales te dejen una cierta cantidad para que asi puedas comprar estancias
                    break;
                default:
                    break;
            }
        }

        return monedas;

    }

}
