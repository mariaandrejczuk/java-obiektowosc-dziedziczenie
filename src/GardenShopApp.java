import java.util.Scanner;

public class GardenShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        do {
            System.out.println("----------Garden Shop -----------");
            System.out.println("1 - add flower");
            System.out.println("2 - add fertilizer");
            System.out.println("3 - display all");
            System.out.println("0 - stop");
            option = scanner.nextInt();

            switch (option) {
                case 1:

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
