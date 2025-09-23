public interface Purchasable {
    double calculatePrice();
    double applyDiscount(double percentage);
    static double getDefaultTaxRate(){
        return 0.22;
    }
    default double getPriceWithTax()
    {
        double price = calculatePrice();
        return price + price * getDefaultTaxRate();
    }

}
