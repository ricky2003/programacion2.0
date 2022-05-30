package practicaprograii.aplicacion;

import practicaprograii.ModeloJuego.Juego.CuadroDeMandos.CuadrodDeMandos;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros.Mosasaurio;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros.Pteranodon;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros.TyrannosaurusRex;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Carnivoros.Velocirraptor;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Dinosaurio;
import practicaprograii.ModeloJuego.Juego.Dinosaurios.Herbivoros.Branchiosaurio;
import practicaprograii.ModeloJuego.Juego.Escenario.*;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Cria.*;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Exhibicion.*;
import practicaprograii.ModeloJuego.Juego.Instalaciones.Instalacion;
import practicaprograii.ModeloJuego.Juego.Islas.Crianza.IslaCrianza;
import practicaprograii.ModeloJuego.Juego.Islas.Crianza.Sorna;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.IslaExhibicion;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.Matanceros;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.Nublar;
import practicaprograii.ModeloJuego.Juego.Islas.Exhibicion.SanDiego;
import practicaprograii.ModeloJuego.Juego.utilidades.utilidades;

/**
 *
 * @author Ricardo García-Villaraco<ricardo.garciavillaracosanchez@usp.ceu.es>
 */
public class main {

    public static Cria getInstalacionCria() {

        System.out.println("elige una instalacon cria ");
        System.out.println("1. CAC4");
        System.out.println("2. CTC03");
        System.out.println("3. CTH05");
        System.out.println("4. CVC02");

        int i = utilidades.LeeEntero("escribe un numero");
        Cria cria = null;
        switch (i) {
            case 1:
                cria = new CAC4();
                break;

            case 2:
                cria = new CTC03();
                break;
            case 3:
                cria = new CTH05();
                break;
            case 4:
                cria = new CVC02();
                break;
        }
        return cria;

    }

    public static Exhibicion getInstalacionExhibicion() {
        System.out.println("elige una instalacon exhibicion ");
        System.out.println("1. EAC03 ");
        System.out.println("2. ETC02");
        System.out.println("3. ETH02");
        System.out.println("4. EVC02");

        int i = utilidades.LeeEntero("escribe un numero");
        Exhibicion exhibicion = null;
        switch (i) {
            case 1:
                exhibicion = new EAC03();
                break;
            case 2:
                exhibicion = new ETC02();
                break;
            case 3:
                exhibicion = new ETH02();
                break;
            case 4:
                exhibicion = new EVC02();
                break;
        }
        return exhibicion;

    }

    public static IslaCrianza getIslaCrianza() {
        System.out.println("elige una Isla Cria ");
        System.out.println("1. Sorna ");

        int i = utilidades.LeeEntero("escribe un numero");
        IslaCrianza Ic = null;
        switch (i) {
            case 1:
                Ic = new Sorna();
                break;

        }
        return Ic;
    }

    public static IslaExhibicion getIslaExhibicion() {
        System.out.println("elige una isla exhibicion ");
        System.out.println("1. Matanceros ");
        System.out.println("2. Nublar");
        System.out.println("3. San Diego");

        int i = utilidades.LeeEntero("escribe un numero del 1-3");
        IslaExhibicion Ie = null;
        switch (i) {
            case 1:
                Ie = new Matanceros();
                break;
            case 2:
                Ie = new Nublar();
                break;
            case 3:
                Ie = new SanDiego();
                break;

        }
        return Ie;

    }

    public static Escenario getEscenario() {

        System.out.println("elige un escenario ");
        System.out.println("1. JurassicPark ");
        System.out.println("2.  JurassicParkSanDiego");
        System.out.println("3. JurassicWorld");

        int i = utilidades.LeeEntero("escribe un numero del 1-3");
        Escenario e = null;
        switch (i) {
            case 1:
                e = new JurassicPark();
                break;
            case 2:
                e = new JurassicParkSanDiego();
                break;
            case 3:
                e = new JurassicWorld();
                break;

        }
        return e;

    }

    public static Dinosaurio CreaDinosaurioAleatorio() {

        int i = (int) (Math.random() * 5) + 1;
        Dinosaurio DinoDeLaInstalacion = null;
        switch (i) {
            case 1:
                DinoDeLaInstalacion = new Mosasaurio();
                System.out.println("el dinosaurio elegido es un Mosasuario");
                break;
            case 2:
                DinoDeLaInstalacion = new Pteranodon();
                System.out.println("el dinosaurio elegido es un Pteranodon");
                break;
            case 3:
                DinoDeLaInstalacion = new TyrannosaurusRex();
                System.out.println("el dinosaurio elegido es un Trex");
                break;
            case 4:
                DinoDeLaInstalacion = new Velocirraptor();
                System.out.println("el dinosaurio elegido es un Velocirraptor");
                break;
            case 5:
                DinoDeLaInstalacion = new Branchiosaurio();
                System.out.println("el dinosaurio elegido es un branchiosaurio");
                break;

        }

        return DinoDeLaInstalacion;

    }

    public static void InicioCadaNuevaRonda(CuadrodDeMandos c) {

        int i = 0;
        CuadrodDeMandos cm = new CuadrodDeMandos(c.getPartidas());
        //inicias toda la ronda aqui
        switch (i) {

        }
    }

    public static void CogerDinosauriosDeInstalacion(Instalacion ins) {
        for (Dinosaurio d : ins.getDinosauriosDeInsatalacion()) {
            System.out.println(d.toString());
        }

    }

    public static void main(String[] args) {
        // System.out.println("el dinosaurioElegido es: " + CreaDinosaurioAleatorio());

        //System.out.println("la isla de craiza es: " + getInstalacionCria());
        //System.out.println("la isla de exhibicion es: " + getIslaExhibicion());
        //System.out.println("la instalacion de cria es: " + getInstalacionCria());
        //System.out.println("la instalacion de exhibicion: " + getInstalacionExhibicion());
        System.out.println("el escenario elegido sera: " + getEscenario());

    }

}
