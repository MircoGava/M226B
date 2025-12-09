package sam.ecosystem;

public abstract class Predator extends AquaticCreature{
    private int ferocity;
    private boolean huntAndata;


    public Predator(String name, int age, int energy, int speed, boolean alive, int ferocity, boolean huntAndata) {
        super(name, age, energy, speed, alive);
        this.ferocity = ferocity;
        this.huntAndata = huntAndata;
    }

    public int getFerocity() {
        return ferocity;
    }

    public abstract boolean hunt();

    public boolean isHuntAndata() {
        return huntAndata;
    }

    public void setHuntAndata(boolean huntAndata) {
        this.huntAndata = huntAndata;
    }
}
