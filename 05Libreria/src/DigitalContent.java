

abstract class DigitalContent implements Purchasable {
    private int id;
    private String title;
    private String author;
    private double basePrice;
    private double currentDiscount;

    abstract void getContentType();
    abstract void getDescription();

    @Override
    public double calculatePrice()
    {
        System.out.println("Libro: " + title);
        return basePrice - (basePrice / 100) * currentDiscount;
    }

    public DigitalContent(int id, String title, String author, double basePrice, double currentDiscount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.basePrice = basePrice;
        this.currentDiscount = currentDiscount;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getCurrentDiscount() {
        return currentDiscount;
    }

    public void setCurrentDiscount(double currentDiscount) {
        this.currentDiscount = currentDiscount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
