package sam.ecosystem;

public class Jellyfish extends AquaticCreature{

    public Jellyfish(String name, int age, int energy, int speed, boolean alive) {
        super(name, age, energy, speed, alive);
    }

    @Override
    public void makeSound() {
        System.out.println("plim plub plum plim plim");
    }

    public void facose(){
        System.out.println(getName() + " emette una luce bioluminescente!");
    }

}
