package main.service;

import main.interfaces.Riparabile;

import java.util.List;
import java.util.ArrayList;

public class Officina{

    List<Riparabile> veicoliInRiparazione = new ArrayList<>();

    public void accettaVeicolo(Riparabile veicolo){
        veicoliInRiparazione.add(veicolo);
    }

    public void stampaSchedarioRiparazioni(){
        for(Riparabile veicolo : veicoliInRiparazione)
        {
            System.out.println(veicolo.toString());
        }
    }

}
