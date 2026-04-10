public class StoreDemo {
    public static void main(String[] args) {
        Printable[] items = new Printable[] {
                new Product("Notebook", 5.0),
                new TaxableProduct("Laptop", 1200.0),
                new DigitalProduct("Ebook", 15.0, "http://download.com/ebook"),
                new Product("Pen", 1.5),
                new TaxableProduct("Smartphone", 800.0),
                new DigitalProduct("Music Album", 9.99, "http://download.com/album")
        };

        double totalTax = 0;

        for (Printable item : items) {
            item.print();

            if (item instanceof Taxable) {
                totalTax += ((Taxable) item).calculateTax();
            }
        }

        System.out.println("\nTotal tax collected across the store: $" + totalTax);
    }
}