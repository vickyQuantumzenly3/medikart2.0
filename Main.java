import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Medikart medikart = new Medikart();
        
        while (true) {
            System.out.println("\nMedikart Menu:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. View cart");
            System.out.println("4. View total price");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    medikart.addItem(new MedicalItem(name, price, quantity));
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = scanner.nextLine();
                    medikart.removeItem(removeName);
                    break;

                case 3:
                    medikart.viewItems();
                    break;

                case 4:
                    System.out.println("Total price: $" + medikart.getTotalPrice());
                    break;

                case 5:
                    System.out.println("Exiting the app. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
