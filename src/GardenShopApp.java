import java.util.Scanner;

public class GardenShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        GardenShop gardenShop = new GardenShop(); //przygotowujemy sklep

        do {
            System.out.println("----------Garden Shop -----------");
            System.out.println("1 - add flower");
            System.out.println("2 - add fertilizer");
            System.out.println("3 - display all");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Price: ");
                    double price = scanner.nextDouble();

                    System.out.println("Type: ");
                    String type = scanner.nextLine();

                    Flower flower = new Flower(name, price, type);  //tworzymy kwiat, ale jezeli chcemy go wyświetlić , tpo najpierw musimy gdzieś przechować, czyli tworzymy GarderShop do przechowania kwiatów
                    gardenShop.addFlower(flower); //na gardenShop wywołujemy metodę addFlower, dzięi temu kwiat trafia do tablicy flowers z Klasy GardenShop

                    break;
                case 2:

                    break;
                case 3:

                    break;

            }
        } while (option != 0);

        scanner.close();


    }
}
