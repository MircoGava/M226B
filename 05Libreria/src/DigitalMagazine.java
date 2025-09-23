import java.time.DayOfWeek;
import java.time.LocalDate;

public class DigitalMagazine extends DigitalContent{
    private int issueNumber;
    private LocalDate publicationDate;
    private String category;


    public DigitalMagazine(int id, String title, String author, double basePrice, double currentDiscount, int issueNumber, LocalDate publicationDate, String category) {
        super(id, title, author, basePrice, currentDiscount);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.category = category;
    }



    @Override
    void getContentType() {

    }

    @Override
    void getDescription() {

    }

    @Override
    public double applyDiscount(double percentage) {
        return 0;
    }

    @Override
    public double getPriceWithTax() {
        return super.getPriceWithTax();
    }

    public boolean isRecentIssue()
    {
        LocalDate scadenza = LocalDate.now();
        scadenza = scadenza.minusDays(30);
        if(publicationDate.isAfter(scadenza))
        {
            System.out.println("Libro " + getTitle() + " è recente");
            return true;
        }
        else {
            System.out.println("Libro " + getTitle() + " non è recente");
            return false;
        }

    }

    @Override
    public double calculatePrice()
    {
        double price = super.calculatePrice();
        if(isRecentIssue())
            return price + (price / 100) * 10;

        else {
            return price;
        }

    }


}
