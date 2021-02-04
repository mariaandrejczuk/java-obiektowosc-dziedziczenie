
public class Fertilizer extends Product {

    //private String name;
    //private double price;
    private String purpose;

    public Fertilizer(String name, double price, String purpose) {
        //this.name = name;
        //this.price = price;
        super(name, price);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }
    /*
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Purpose: " + purpose);
    }
    */
}
