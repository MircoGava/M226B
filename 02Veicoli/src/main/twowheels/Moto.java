package main.twowheels;

import main.Veicolo;

import java.util.Objects;

public final class Moto extends Veicolo {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Moto(String targa, String marca, String modello, int nPosti, String tipo) {
        super(nPosti, marca, modello, targa);
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return Objects.equals(tipo, moto.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipo);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public void faiRumore() {
        System.out.println("Bubububuubub!");
    }
}
