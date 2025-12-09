package sam.ecosystem;

import java.util.HashSet;
import java.util.Set;

public class EcosystemManager {

    Set<AquaticCreature> creatures = new HashSet<>();

    public void addCreature(AquaticCreature creature)
    {
        creatures.add(creature);
    }

    public void filterByEnergy(int Minenergy)
    {
        creatures.stream()
                .filter(creature -> creature.getEnergy() > Minenergy)
                .forEach(creature -> System.out.println(creature.getName() +"(" + creature.getEnergy() + ")"));
    }

    public void getAdultCreaturesNames(int minAge)
    {
        creatures.stream()
                .filter(creature -> creature.getAge() > minAge)
                .map(creature -> creature.getName())
                .forEach(creature -> System.out.println(creature));
    }
    public void findMostDangerousPredators(int energy, int ferocity)
    {
        creatures.stream()
                .filter(c -> c instanceof Predator)
                .map(c -> (Predator) c)
                .filter(creature -> creature.getEnergy() > energy)
                .filter(creature -> creature.getFerocity() > ferocity)
                .map(creature -> creature.getName())
                .forEach(creature -> System.out.println(creature));
    }

    public void callAllPredatorsPolimorphicMethods(Predator predator)
    {
        predator.makeSound();
        predator.hunt();


    }

    public void callAllPredatorsInheritedMethods(Predator predator)
    {
        predator.eat(5);
        System.out.println(predator.getName());
        System.out.println(predator.getAge());
        System.out.println(predator.getEnergy());
        System.out.println(predator.getSpeed());
        System.out.println(predator.getFerocity());
        predator.move();

    }

}
