
public class Flower {

    private String name;  // pola sa ukryte
    private double price;
    private String type;

    public Flower(String name, double price, String type) {  //mamy możliwość ustawienia pól (gettery settery ew. później)
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }
}
