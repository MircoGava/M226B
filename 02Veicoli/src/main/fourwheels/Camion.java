package main.fourwheels;

import main.Veicolo;

import java.util.Objects;

public class Camion extends Veicolo {
    private int maxCarico;

    public int getMaxCarico() {
        return maxCarico;
    }

    public void setMaxCarico(int maxCarico) {
        this.maxCarico = maxCarico;
    }

    public Camion(String targa, String marca, String modello, int nPosti, int maxCarico) {
        super(nPosti, marca, modello, targa);
        this.maxCarico = maxCarico;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Camion camion = (Camion) o;
        return maxCarico == camion.maxCarico;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(maxCarico);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "maxCarico=" + maxCarico +
                '}';
    }
}
