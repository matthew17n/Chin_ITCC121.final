import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        // Coffee menu
        String[] names = {"☕︎Espresso", "☕︎Latte", "☕︎Cappuccino", "☕︎Americano", "☕︎Mocha"};
        int[] prices = {90, 85, 100, 75, 80};
        int deliveryTime = 15;
        int[] sizePriceModifier = {0, 10, 20}; // Small, Medium, Large price increase

        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("☕Welcome to Coffee SyntaxSip!☕");
        System.out.println("☕Menu:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ". " + names[i] + " - ₱" + prices[i]);
        }

        // Get user input
        System.out.print("Enter coffee number: ");
        int choice = scanner.nextInt();

        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();

        String[] sizes = {"Small", "Medium", "Large"};
        System.out.print("Enter size (0: Small, 1: Medium, 2: Large): ");
        int sizeChoice = scanner.nextInt();

        if (choice >= 0 && choice < names.length && sizeChoice >= 0 && sizeChoice < sizes.length) {
            int sizePrice = prices[choice] + sizePriceModifier[sizeChoice];
            int total = sizePrice * qty;
            System.out.println("You ordered: " + qty + " x " + names[choice] + " (" + sizes[sizeChoice] + " size)");
            System.out.println("Price: ₱" + sizePrice + " each | Total: ₱" + total);
            System.out.println("🚚 Delivery time: " + deliveryTime + " mins");

            System.out.print("Confirm order? (yes/no): ");
            scanner.nextLine(); // Consume newline character
            String confirm = scanner.nextLine().toLowerCase();

            if (confirm.equals("yes")) {
                System.out.println("Order confirmed! ☕️");
            } else {
                System.out.println("Order canceled.");
            }
        } else {
            System.out.println("sInvalid choice.");
        }

        scanner.close();
    }
}