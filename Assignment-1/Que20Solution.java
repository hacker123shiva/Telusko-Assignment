import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

  class RestaurantMenu {
    private Map<String, Double> menu;

    public RestaurantMenu() {
        this.menu = new HashMap<>();
    }

    public void addDish(String dishName, double price) {
        menu.put(dishName, price);
        System.out.println(dishName + " added to the menu.");
    }

    public void updatePrice(String dishName, double newPrice) {
        if (menu.containsKey(dishName)) {
            menu.put(dishName, newPrice);
            System.out.println("Price of " + dishName + " updated to " + newPrice);
        } else {
            System.out.println("Dish not found in the menu.");
        }
    }

    public void removeDish(String dishName) {
        if (menu.containsKey(dishName)) {
            menu.remove(dishName);
            System.out.println(dishName + " removed from the menu.");
        } else {
            System.out.println("Dish not found in the menu.");
        }
    }

    public void displayMenu() {
        if (menu.isEmpty()) {
            System.out.println("Menu is empty.");
        } else {
            System.out.println("Restaurant Menu:");
            for (Map.Entry<String, Double> entry : menu.entrySet()) {
                System.out.println(entry.getKey() + ": $" + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RestaurantMenu restaurantMenu = new RestaurantMenu();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Dish");
            System.out.println("2. Update Price");
            System.out.println("3. Remove Dish");
            System.out.println("4. Display Menu");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter dish name:");
                    String dishName = scanner.nextLine();
                    System.out.println("Enter price:");
                    double price = scanner.nextDouble();
                    restaurantMenu.addDish(dishName, price);
                    break;
                case 2:
                    System.out.println("Enter dish name:");
                    dishName = scanner.nextLine();
                    System.out.println("Enter new price:");
                    price = scanner.nextDouble();
                    restaurantMenu.updatePrice(dishName, price);
                    break;
                case 3:
                    System.out.println("Enter dish name:");
                    dishName = scanner.nextLine();
                    restaurantMenu.removeDish(dishName);
                    break;
                case 4:
                    restaurantMenu.displayMenu();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}

 