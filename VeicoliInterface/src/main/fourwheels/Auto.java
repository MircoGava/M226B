package main.fourwheels;

import main.Veicolo;
import main.interfaces.Riparabile;

import java.math.BigDecimal;
import java.util.Objects;

public class Auto extends Veicolo implements Riparabile {
    private int Nporte;

    public int getNporte() {
        return Nporte;
    }

    public void setNporte(int nporte) {
        Nporte = nporte;
    }

    public Auto( int nPosti, String targa, String modello, String marca, int numeroDiSerie, String modelo, int nporte) {
        super(nPosti, targa, modello, marca,numeroDiSerie, modelo);
        Nporte = nporte;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Nporte == auto.Nporte;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Nporte);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "tagra=" + getTarga() +
                " marca=" + getMarca() +
                '}';
    }

    @Override
    public double calcolaCostoRiparazione(int oreLavoro) {
        return (oreLavoro * 45.0) + 100;
    }
}
