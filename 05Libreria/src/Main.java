import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<Purchasable> purchasables = new HashSet<>();

        AudioBook audioBook = new AudioBook(1,"Il sole","Ronaldino",23.55,0,"Giacomo",555,"Italiano");
        EBook eBook = new EBook(2,"Sosa","Tony Montana",55.55,20,Genre.BIOGRAPHY,77,false);
        OnlineCourse onlineCourse = new OnlineCourse(3,"CPT","Simba la rue",34,80,"David",55,Difficulty.ADVANCED);
        DigitalMagazine digitalMagazine = new DigitalMagazine(4,"Aldi","Kanye West",12,10,20, LocalDate.of(2025,9,20),"Gossip");

        purchasables.add(audioBook);
        purchasables.add(eBook);
        purchasables.add(onlineCourse);
        purchasables.add(digitalMagazine);


        System.out.println("Questi sono metodi ereditari:");
        for (Purchasable purchasable : purchasables)
        {
            System.out.print("IVA ");
           System.out.println(purchasable.getPriceWithTax());
        }

        System.out.println("Questi sono metodi polimorfi:");
        for (Purchasable purchasable : purchasables)
        {
            System.out.print("Base ");
            System.out.println(purchasable.calculatePrice());
            if(purchasable instanceof EBook)
            {
                System.out.println(((EBook) purchasable).getReadingTime());
            }
            else if(purchasable instanceof OnlineCourse)
            {
                System.out.println(((OnlineCourse) purchasable).getCertificationEligible());
            }
            else if(purchasable instanceof DigitalMagazine)
            {
                System.out.println(((DigitalMagazine) purchasable).isRecentIssue());
            }
        }
}
}