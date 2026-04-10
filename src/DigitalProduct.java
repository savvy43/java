public class DigitalProduct extends TaxableProduct {
    private String downloadUrl;

    public DigitalProduct(String name, double price, String downloadUrl) {
        super(name, price);
        this.downloadUrl = downloadUrl;
    }

    @Override
    public void print() {
        double tax = calculateTax();
        double total = price + tax;
        System.out.println("Digital Product: " + name +
                " | Price: $" + price +
                " | Tax: $" + tax +
                " | Total: $" + total +
                " | Download URL: " + downloadUrl);
    }
}