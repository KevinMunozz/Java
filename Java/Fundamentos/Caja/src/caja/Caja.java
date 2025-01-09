package caja;

public class Caja {

    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Ejecutanto constructor vacio");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularVolumen(){
        int volumen;
        volumen = this.alto * this.ancho * this.profundo;
        return volumen;
    }

}
