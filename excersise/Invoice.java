package chapter17.excersise;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;

    private double pricePerItem;
    private double price;

    public double getPricePerItem() {
        return pricePerItem;
    }

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getValue() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format("%-12s | %-16s | %-8d | $%.2f", partNumber, partDescription, quantity, price);
    }
}
