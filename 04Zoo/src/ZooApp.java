import zoo.Elephant;
import zoo.Feedable;
import zoo.Lion;
import zoo.Parrot;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZooApp {
    public static void main(String[] args) {

        Lion leone = new Lion("Rusbino",2,true);
        Elephant elefante = new Elephant("Gernaldo",55,false);
        Parrot papagallo = new Parrot("treno",5);

        System.out.println(leone);
        System.out.println(elefante);
        System.out.println(papagallo);

        System.out.println(leone.makeSound());
        System.out.println(elefante.makeSound());
        System.out.println(papagallo.makeSound());

        List<Feedable> feedables = new ArrayList<>();
        feedables.add(leone);
        feedables.add(elefante);
        feedables.add(papagallo);

        for(Feedable feedable : feedables)
        {
            feedable.eat("insalata");
        }





    }
}