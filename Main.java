package Minipro2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(0, 0);
		Products shoes = new Products("Shoes", 10, 1000);
		Products jackets = new Products("Jacket", 10, 500);
		DiscountedProducts socks = new DiscountedProducts("Socks", 10, 50, 0.5);

		int option;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Buy " + shoes.getItems() + ", " + shoes.getPrice() +" SEK, " + shoes.getAmountInStock() +" left");
		System.out.println("2. Buy " + jackets.getItems() + ", " + jackets.getPrice() + " SEK, " + jackets.getAmountInStock() + " left");
		System.out.println("3. Buy " + socks.getItems() + ", " + socks.priceWithDiscount() + " SEK, " + socks.getAmountInStock() + " left");
		System.out.println("4. Quit");
		System.out.println("Choose your option: ");
		
		option = scanner.nextInt();
		switch(option) {
		case 1:
				shoes.getUpdateStock();
				customer.getUpdatedAmountItemsPurchased();
				customer.setUpdateTotalCost(shoes.getPrice());
			break;		
		case 2:
				jackets.getUpdateStock();
				customer.getUpdatedAmountItemsPurchased();
				customer.setUpdateTotalCost(jackets.getPrice());
			break;
		case 3:
				socks.getUpdateStock();
				customer.getUpdatedAmountItemsPurchased();
				socks.priceWithDiscount();
				customer.setUpdateTotalCost(socks.priceWithDiscount());
				break;
		case 4:
				break;
		}
		}while (option != 4);
		System.out.println("Your shopping card has " + customer.getUpdatedAmountItemsPurchased() + " item(s). The total cost is " + customer.getTotalCost() + " SEK.");
	}
}
