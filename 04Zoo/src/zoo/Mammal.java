package zoo;

abstract class Mammal extends Animal{

    private boolean hasFur;

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }
}
