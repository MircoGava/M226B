package main.fourwheels;

import java.util.Objects;

public class Auto {
    private int Nporte;

    public int getNporte() {
        return Nporte;
    }

    public void setNporte(int nporte) {
        Nporte = nporte;
    }

    public Auto(int nporte) {
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
                "Nporte=" + Nporte +
                '}';
    }
}
