package Tickets;
import java.util.Scanner;

public class demo {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input booking details
	        System.out.print("Enter Customer Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Number of Tickets: ");
	        int tickets = sc.nextInt();
	        System.out.print("Enter Price per Ticket: ");
	        double price = sc.nextDouble();

	        // Create object
	        TicketsBooking booking = new TicketsBooking(name, tickets, price);
	        sc.nextLine(); // consume leftover newline

	        // Choose payment method
	        System.out.println("\nChoose Payment Method: \n1. Cash \n2. Online Wallet \n3. Credit Card");
	        int choice = sc.nextInt();
	        sc.nextLine(); // consume leftover newline

	        switch (choice) {
	            case 1:
	                System.out.print("Enter cash amount: ₹");
	                double cash = sc.nextDouble();
	                booking.makePayment(cash);
	                break;

	            case 2:
	                sc.nextLine(); // extra safety
	                System.out.print("Enter Wallet Name: ");
	                String wallet = sc.nextLine();
	                System.out.print("Enter amount: ₹");
	                double walletAmt = sc.nextDouble();
	                booking.makePayment(wallet, walletAmt);
	                break;

	            case 3:
	                sc.nextLine(); // clear buffer
	                System.out.print("Enter Card Number: ");
	                String cardNum = sc.nextLine();
	                System.out.print("Enter Card Holder Name: ");
	                String holder = sc.nextLine();
	                System.out.print("Enter Expiry Date (MM/YY): ");
	                String expiry = sc.nextLine();
	                System.out.print("Enter amount: ₹");
	                double cardAmt = sc.nextDouble();
	                booking.makePayment(cardNum, holder, expiry, cardAmt);
	                break;

	            default:
	                System.out.println("Invalid option!");
	        }

	        sc.close();
	   

	}

}
