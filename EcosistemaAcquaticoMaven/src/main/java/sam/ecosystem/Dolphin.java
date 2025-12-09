package sam.ecosystem;

public class Dolphin extends Predator {
    private int intelligence;

    public Dolphin(String name, int age, int energy, int speed, boolean alive, int ferocity, boolean huntAndata, int intelligence) {
        super(name, age, energy, speed, alive, ferocity, huntAndata);
        this.intelligence = intelligence;
    }

    @Override
    public void makeSound() {
        System.out.println("Wuum");
    }

    public void facose(){
        System.out.println(getName() + " gioca e fa acrobazie");
    }


    @Override
    public boolean hunt()
    {
        int test = 0;
        if(isAlive()) {

            int stats =   this.intelligence + getFerocity() + getEnergy() + getSpeed();
            int random = (int)(Math.random()* 700);

            if(stats >= random)
            {
                test = 1;
            }
            else
            {
                test = 2;
            }
            if(test == 1)
            {
                this.eat(20);
                System.out.println("Preda catturata");
                System.out.println("Delfino si è appena nutrito. Nuovo livello di energia: " + getEnergy());
                test = 3;
                setHuntAndata(true);
            }
            else if (test == 2){
                setEnergy(getEnergy() - 3);
                System.out.println("Caccia fallita, la preda è sfuggita, nuovo livello di energia: " + getEnergy());
                if (getEnergy() <= 0)
                {
                    setAlive(false);
                }
                setHuntAndata(false);
                return false;
            }
        }
        if(test == 3){
            return true;
        }
        else{
            return false;
        }

    }


}
