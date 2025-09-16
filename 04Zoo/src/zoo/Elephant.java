package zoo;

public class Elephant extends Mammal implements Feedable{

    public Elephant(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    @Override
    public void eat(String food)
    {

    }

    @Override
    public String makeSound() {
        return "uuuuuu";
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "\n name= " + getName() + "\n age= " + getAge() +  "\n hasFur= "+ isHasFur() +"}";
    }
}
