package main.fourwheels;

import main.interfaces.VeicoloElettrico;

public class AutoElettrica extends Auto implements VeicoloElettrico {
    private int autonomiaBettria;



    public AutoElettrica(int nPosti, String targa, String modello, String marca, int numeroDiSerie, String modelo, int nporte, int autonomiaBettria) {
        super(nPosti, targa, modello, marca, numeroDiSerie, modelo, nporte);
        this.autonomiaBettria = autonomiaBettria;
    }

    @Override
    public double getAutonomiaBatteria()
    {
        return this.autonomiaBettria;
    }

    @Override
    public void ricarica()
    {
        this.autonomiaBettria = 100;
    }
}
