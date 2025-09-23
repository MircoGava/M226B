package zoo;

public class Parrot extends Animal implements Feedable{

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food)
    {
        System.out.println("Parrot is eating " + food);
    }

    @Override
    public String makeSound() {
        return "gugugu";
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "\n name= " + getName() + "\n age= " + getAge() +"}";
    }
}
