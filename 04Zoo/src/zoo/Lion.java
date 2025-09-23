package zoo;

public class Lion extends Mammal implements Feedable{

    public Lion(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    @Override
    public void eat(String food)
    {
        System.out.println("Lion is eating " + food);
    }

    @Override
    public String makeSound() {
        return "roar";
    }

    @Override
    public String toString() {
        return "Lion{" +
                "\n name= " + getName() + "\n age= " + getAge() +  "\n hasFur= "+ isHasFur() +"}";
    }
}
