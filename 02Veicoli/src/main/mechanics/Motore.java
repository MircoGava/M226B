package main.mechanics;

public class Motore {
    private int numeroDiSerie;
    private String modelo;

    public int getNumeroDiSerie() {
        return numeroDiSerie;
    }

    public void setNumeroDiSerie(int numeroDiSerie) {
        this.numeroDiSerie = numeroDiSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModello(String modelo) {
        this.modelo = modelo;
    }

    public Motore(int numeroDiSerie, String modelo) {
        this.numeroDiSerie = numeroDiSerie;
        this.modelo = modelo;
    }
}
