public class TaxableProduct extends Product implements Taxable {

    public TaxableProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return price * TAX_RATE;
    }

    @Override
    public void print() {
        double tax = calculateTax();
        double total = price + tax;
        System.out.println("Taxable Product: " + name +
                " | Price: $" + price +
                " | Tax: $" + tax +
                " | Total: $" + total);
    }
}