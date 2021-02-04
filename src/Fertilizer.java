
public class Fertilizer {

    private String name;
    private double price;
    private String purpose;

    public Fertilizer(String name, double price, String purpose) {
        this.name = name;
        this.price = price;
        this.purpose = purpose;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Purpose: " + purpose);
    }
}
