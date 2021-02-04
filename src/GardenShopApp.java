import java.util.Scanner;

public class GardenShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        GardenShop gardenShop = new GardenShop(); //przygotowujemy sklep
        String name;
        double price; //dodajemy tu dwie zmienne które powtarzają się w case 1 (kwiaty) i case 2 (nawozy)

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
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); //bo inaczej nie przechwytuje białego znaku i nie pyta o Type

                    System.out.println("Type: ");
                    String type = scanner.nextLine();

                    Flower flower = new Flower(name, price, type);  //tworzymy kwiat, ale jezeli chcemy go wyświetlić , tpo najpierw musimy gdzieś przechować, czyli tworzymy GarderShop do przechowania kwiatów
                    gardenShop.addFlower(flower); //na gardenShop wywołujemy metodę addFlower, dzięi temu kwiat trafia do tablicy flowers z Klasy GardenShop

                    break;
                case 2: //nawóz - ma to samo co kwiat, czyli name, price, a dodatkowo przeznaczenie.
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); //bo inaczej nie przechwytuje białego znaku i nie pyta o Type

                    System.out.println("Purpose: ");
                    String purpose = scanner.nextLine();

                    Fertilizer fertilizer = new Fertilizer(name, price, purpose); //tworzymy obiekt nawóz
                    gardenShop.addFertilizer(fertilizer); //i dodajemy metodą addF nawóz do sklepu gardenShop
                    break;
                case 3:
                    gardenShop.displayAll();
                    break;
            }
        } while (option != 0);

        scanner.close();
    }
}
