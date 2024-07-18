package com.corejava.programs;

public class ShoppingCart {
	public class ShoppingCartProgram {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ShoppingCart cart = new ShoppingCart();

	        // Main loop for displaying the menu and handling user input
	        while (true) {
	            System.out.println("\n=== Shopping Cart Menu ===");
	            System.out.println("1. Add item to cart");
	            System.out.println("2. View cart");
	            System.out.println("3. Checkout and exit");
	            System.out.print("Enter your choice: ");

	            // Read user's choice
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character after reading integer input

	            switch (choice) {
	                case 1:
	                    // Add item to cart
	                    System.out.print("Enter item name: ");
	                    String item = scanner.nextLine();
	                    System.out.print("Enter item price: ");
	                    double price = scanner.nextDouble();
	                    cart.addItem(item, price);
	   break;
	                case 2:
	                    // View cart
	                    cart.displayCart();
	                    break;
	                case 3:
	                    // Checkout and exit
	                    double total = cart.calculateTotal();
	                    System.out.println("Total amount: $" + total);
	                    System.out.println("Thank you for shopping with us!");
	                    scanner.close(); // Close scanner before exiting
	                    return;
	                default:
	                    // Invalid choice handling
	                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
	            }
	            }
	            }
}
