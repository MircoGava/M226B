//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MarineEcosystemSimulator {
    public static void main(String[] args) {

       Dolphin dolphin = new Dolphin("Sosa",4,67,23,true,50,false,45);
       Jellyfish jellyfish = new Jellyfish("Armani",32,78,54,true);
       Shark shark = new Shark("Gue",23,80,55,true,99,false);
       HerbivorousFish herbivorousFish = new HerbivorousFish("David",2,34,32,true);

       EcosystemManager ecosystemManager = new EcosystemManager();

       ecosystemManager.addCreature(dolphin);
       ecosystemManager.addCreature(jellyfish);
       ecosystemManager.addCreature(shark);
       ecosystemManager.addCreature(herbivorousFish);

       System.out.println("=== SIMULATORE ECOSISTEMA MARINO ===");
        System.out.println("**** 1. Creature con energia > 50:");
       ecosystemManager.filterByEnergy(70);
        System.out.println("**** 2. Creature con età >= 3:");
       ecosystemManager.getAdultCreaturesNames(10);
        System.out.println("**** 3. Predatori più pericolosi:");
       ecosystemManager.findMostDangerousPredators(70,70);
        System.out.println("**** 4. Invoca tutti i metodi polimorfici di un predatore:");
       ecosystemManager.callAllPredatorsPolimorphicMethods(dolphin);
        System.out.println("**** 5. Invoca tutti i metodi ereditati di un predatore:");
       ecosystemManager.callAllPredatorsInheritedMethods(shark);
        System.out.println("**** 6. Fai muovere una creatura finché non muore:");
        while(herbivorousFish.isAlive())
        {
            herbivorousFish.move();
            if(!herbivorousFish.isAlive())
            {
                System.out.println(herbivorousFish.getName() + " è morto");
            }
        }
        System.out.println("**** 7. Comportamenti specifici:");
        dolphin.facose();
        jellyfish.facose();

        System.out.println("**** 8. Fai cacciare uno squalo finché non riesce a mangiare:");
        shark.setHuntAndata(false);
        while(!shark.isHuntAndata()){
            shark.hunt();
        }
    }
}