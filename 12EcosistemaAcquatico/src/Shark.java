public class Shark extends Predator{

    public Shark(String name, int age, int energy, int speed, boolean alive, int ferocity, boolean huntAndata) {
        super(name, age, energy, speed, alive, ferocity, huntAndata);
    }

    @Override
    public void makeSound() {
        System.out.println("Prrrrr shkuuu");
    }

    @Override
    public boolean hunt()
    {
        int test = 0;
        if(isAlive()) {

            int stats =   getFerocity() + getEnergy() + getSpeed();
            int random = (int)(Math.random()* 650);

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
                setEnergy(getEnergy() + 20);
                System.out.println("Preda catturata");
                System.out.println( getName() + " si è appena nutrito. Nuovo livello di energia: " + getEnergy());
                test = 3;
                setHuntAndata(true);
            }
            else{
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
