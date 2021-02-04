
public class Product { //w strukturze sklepu można wyodrębnic coś bardziej ogólnego, coś jak Produkt, który zawsze ma nazwę i cenę

    private String name;
    private double price;

    public Product(String name, double price) {  // 
        this.name = name;
        this.price = price;
    }
}
