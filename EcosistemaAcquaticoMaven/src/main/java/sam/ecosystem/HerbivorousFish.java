package sam.ecosystem;

public class HerbivorousFish extends AquaticCreature{

    public HerbivorousFish(String name, int age, int energy, int speed, boolean alive) {
        super(name, age, energy, speed, alive);
    }

    @Override
    public void makeSound() {
        System.out.println("Blub Blub blub blub blub");
    }

}
