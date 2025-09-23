import java.awt.print.Book;

public class AudioBook extends DigitalContent {
    private String narrator;
    private int duration;
    private String language;

    @Override
    void getContentType() {

    }

    @Override
    void getDescription() {

    }

    public void getFormattedDuration(){
        int ore = duration / 60;
        int min = duration % 60;

        System.out.println(ore + ":" + String.format("%02d", min));
    }

    public AudioBook(int id, String title, String author, double basePrice, double currentDiscount, String narrator, int duration, String language) {
        super(id, title, author, basePrice, currentDiscount);
        this.narrator = narrator;
        this.duration = duration;
        this.language = language;
    }

    @Override
    public double applyDiscount(double percentage) {
        return 0;
    }

    @Override
    public double getPriceWithTax() {
        return super.getPriceWithTax();
    }

    @Override
    public double calculatePrice()
    {
        double price = super.calculatePrice();

        if(duration > 480)
        {
            return price + (price / 100) * 20;
        }
        else {
            return price;
        }

    }
}
