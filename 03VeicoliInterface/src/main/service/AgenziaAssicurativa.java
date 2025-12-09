package main.service;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import main.interfaces.Assicurabile;

public class AgenziaAssicurativa {

    Set<Assicurabile> veicoliAssicurati = new HashSet<>();

   public void aggiungiVeicolo(Assicurabile veicolo){
        veicoliAssicurati.add(veicolo);
    }

    public BigDecimal calcolaIncassoTotale(){
        BigDecimal incasso = new BigDecimal(0);
        for(Assicurabile veicolo : veicoliAssicurati)
        {
            incasso = incasso.add(BigDecimal.valueOf(veicolo.getCostoAssicurazione()));
        }
        return incasso;
    }
}
