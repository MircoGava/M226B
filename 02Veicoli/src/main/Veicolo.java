package main;

import main.mechanics.Motore;

import java.util.Objects;

public class Veicolo extends Motore {
    private String targa;
    private String marca;
    private final String modello;
    private int nPosti;


    public void faiRumore(){
        System.out.println("Brum Brum");
    }



    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }


    public int getnPosti() {
        return nPosti;
    }

    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }

    public Veicolo(int nPosti, String targa, String modello, String marca, int numeroDiSerie, String modelo) {
        super( numeroDiSerie, modelo);
        this.nPosti = nPosti;
        this.targa = targa;
        this.modello = modello;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", nPosti=" + nPosti +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veicolo veicolo = (Veicolo) o;
        return  Objects.equals(targa.toUpperCase(), veicolo.targa.toUpperCase()) && Objects.equals(marca.toUpperCase(), veicolo.marca.toUpperCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(targa, marca);
    }


}
