import java.util.Scanner;
 
public class RestaurantOrder {
 
    // Displays the restaurant menu
    public static void displayMenu() {
        System.out.println("===== RESTAURANT MENU =====");
        System.out.println("1. Burger - $5.99");
        System.out.println("2. Pizza  - $8.99");
        System.out.println("3. Salad  - $4.99");
        System.out.println("4. Soda   - $1.99");
        System.out.println("0. Finish Order");
    }
 
    // Returns the price of the selected item.
    // The selection logic is provided for you.
    public static double getItemPrice(int itemNumber) {
        if (itemNumber == 1) {
            return 5.99;
        } else if (itemNumber == 2) {
            return 8.99;
        } else if (itemNumber == 3) {
            return 4.99;
        } else if (itemNumber == 4) {
            return 1.99;
        }
 
        return 0.0;
    }
 
    // Allows the customer to place an order
    // and returns the subtotal
    public static double takeOrder() {
        Scanner scanner = new Scanner(System.in);
 
        double totalCost = 0.0;
 
        System.out.println();
        System.out.println("Enter an item number (0 to finish):");
 
        // Looping and selection code is provided for you.
        while (true) {
            int choice = scanner.nextInt();
 
            if (choice == 0) {
                break;
            }
 
            // TODO:
            // 1. Call getItemPrice() using choice as the argument.
            // 2. Store the returned value in a double variable.
            // 3. Add the returned price to totalCost.
            
            double itemPrice = getItemPrice(choice);

            totalCost = itemPrice + totalCost; 
 
            System.out.println("Enter another item number (0 to finish):");

        }
 
        // TODO: Return the subtotal.
        scanner.close();
        return totalCost;
    }
 
    // Returns the total without a discount
    public static double calculateTotal(double totalCost) {
 
        // TODO: Return the total cost.

        return totalCost;
    }
 
    // Returns the total after applying a discount
    public static double calculateTotal(double totalCost, double discount) {
 
        // TODO: Calculate and return the discounted total.

        double discountedTotal = totalCost - (totalCost * discount);
 
        return discountedTotal;
    }
 
    public static void main(String[] args) {
 
        displayMenu();
        //testing for Part 1
 
        // TODO:
        // Call takeOrder() and store the returned subtotal.
        double subtotal = takeOrder();

        // TODO:
        // Call calculateTotal() using the subtotal.
        double finalTotal = calculateTotal(subtotal);
        double discountedTotal = calculateTotal(subtotal, .10);

 
        // TODO:
        // Display the subtotal and final total.

        System.out.println("==========================\r\n ORDER TOTAL\r\n==========================");

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Total: $%.2f%n", finalTotal);
        System.out.printf("10%% Discount Total: $%.2f%n", discountedTotal);
    }
}
