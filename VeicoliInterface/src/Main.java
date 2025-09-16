//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import main.fourwheels.Auto;
import main.fourwheels.Camion;
import main.interfaces.Assicurabile;
import main.interfaces.Riparabile;
import main.service.AgenziaAssicurativa;
import main.service.Officina;
import main.twowheels.Moto;
public class Main {
    public static void main(String[] args) {

            Camion camion = new Camion(5,"f5f56gtg67","ggg","ford",67,"idk",80);
            Moto miaMoto  = new Moto(2,"45zh45","z650","kwasaki",1234,"2020","si");
            Auto miaAuto = new Auto(4,"323B2I","ciao","audi",33333,"no",5);

            Officina miaOfficina = new Officina();
            AgenziaAssicurativa miaAgenzia = new AgenziaAssicurativa();

            miaMoto.faiRumore();
            camion.faiRumore();

            System.out.println(miaAuto.calcolaCostoRiparazione(20));
            System.out.println(miaMoto.getCostoAssicurazione());

            miaOfficina.accettaVeicolo(miaAuto);
            miaOfficina.accettaVeicolo(miaMoto);

            miaAgenzia.aggiungiVeicolo(miaMoto);


            miaOfficina.stampaSchedarioRiparazioni();
            System.out.println( miaAgenzia.calcolaIncassoTotale() + "$");


        Riparabile rip;
        Assicurabile ass;






    }
}