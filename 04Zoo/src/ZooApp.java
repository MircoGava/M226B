import zoo.Elephant;
import zoo.Lion;
import zoo.Parrot;

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

        leone.eat("bistecca");
        elefante.eat("erba");
        papagallo.eat("cani");




    }
}