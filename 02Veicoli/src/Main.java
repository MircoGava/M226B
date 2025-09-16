//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import main.fourwheels.Camion;
import main.twowheels.Moto;
public class Main {
    public static void main(String[] args) {

            Camion camion = new Camion("HWVE12","ford","forcamion",5,67);
            Moto moto  = new Moto("HZ13H1","Zontes","gk125",2,"2020");

            moto.faiRumore();
            camion.faiRumore();



    }
}