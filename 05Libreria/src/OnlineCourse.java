public final class OnlineCourse extends DigitalContent {
    private String instructor;
    private Difficulty difficulty ;
    private int estimatedHours;

    public OnlineCourse(int id, String title, String author, double basePrice, double currentDiscount, String instructor, int estimatedHours, Difficulty difficulty) {
        super(id, title, author, basePrice, currentDiscount);
        this.instructor = instructor;
        this.estimatedHours = estimatedHours;
        this.difficulty = difficulty;
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

    public boolean getCertificationEligible()
    {
        return estimatedHours > 10;
    }
}
