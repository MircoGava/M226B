import java.awt.print.Book;

public class EBook extends DigitalContent {
    private Genre genre;
    private int pageCount;
    private boolean isIllustrated;

    public EBook(int id, String title, String author, double basePrice, double currentDiscount, Genre genre, int pageCount, boolean isIllustrated) {
        super(id, title, author, basePrice, currentDiscount);
        this.genre = genre;
        this.pageCount = pageCount;
        this.isIllustrated = isIllustrated;
    }

    @Override
    public void getContentType() {

    }

    @Override
    public void getDescription() {

    }

    @Override
    public double applyDiscount(double percentage) {
        return 0;
    }

    @Override
    public double getPriceWithTax() {
        return super.getPriceWithTax();
    }
    public int getReadingTime()
    {
        return pageCount * 2;
    }


}
