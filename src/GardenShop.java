import java.util.concurrent.Flow;

public class GardenShop {

    private Flower[] flowers = new Flower[10];  //dodajemy kwiata do tablicy i ograniczamy max liczbę kwiatów w sklepie do 10 (alternatywnie możemy ustawić wartość przez konstruktor)
    private int flowerIndex = 0;

    private Fertilizer[] fertilizers = new Fertilizer[10];
    private int fertilizerIndex = 0;

    public void addFlower(Flower flower) {   //metoda
        flowers[flowerIndex++] = flower; // przypisz flower, flowerIndex++ ->zeby kolejny kwiat w tablicy flowers dodawany otrzymywał kolejny indeks)
    }

    public void displayAll() {
        for (int i = 0; i < flowerIndex; i++) {
            //flowers[i].display();
            Flower flower = flowers[i];
            System.out.println("Name: "+flower.getName());
            System.out.println("Price: "+flower.getPrice());
            System.out.println("Type: "+flower.getType());
        }
        for (int i = 0; i < fertilizerIndex; i++) {
            fertilizers[i].display();
        }
    }

    public void addFertilizer(Fertilizer fertilizer) {
        fertilizers[fertilizerIndex++] = fertilizer;
    }
}

