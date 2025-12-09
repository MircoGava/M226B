public abstract class AquaticCreature implements Creature {
    private String name;
    private int age;
    private int energy;
    private int speed;
    private boolean alive;

    public AquaticCreature(String name, int age, int energy, int speed, boolean alive) {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.speed = speed;
        this.alive = alive;
    }

    @Override
    public void move() {
        if(alive){
            energy -= 2;
            System.out.println(name + " si muove nell'acqua ");
        }
        if (energy <= 0)
        {
            alive = false;
        }

    }

    @Override
    public void eat(int energy) {
        this.energy += energy;
        System.out.println(this.name + " si è appena nutrito. Nuovo livello di energia: " + this.energy);
    }

    public int getEnergy() {
        return energy;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
