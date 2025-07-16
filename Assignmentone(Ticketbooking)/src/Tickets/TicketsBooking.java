package Tickets;
import java.util.Scanner;

public class TicketsBooking{

	    private String customerName;
	    private int numberOfTickets;
	    private double pricePerTicket;

	    
	    public TicketsBooking(String customerName, int numberOfTickets, double pricePerTicket) {
	        this.customerName = customerName;
	        this.numberOfTickets = numberOfTickets;
	        this.pricePerTicket = pricePerTicket;
	    }

	    // Method to calculate total amount
	    public double calculateTotal() {
	        return numberOfTickets * pricePerTicket;
	    }

	    // Overloaded payment methods

	    // 1. Payment by Cash
	    public void makePayment(double cashAmount) {
	        System.out.println("\nPayment Method: Cash");
	        printReceipt(cashAmount, "Cash");
	    }

	    // 2. Payment by Online Wallet
	    public void makePayment(String walletName, double walletAmount) {
	        System.out.println("\nPayment Method: Online Wallet");
	        System.out.println("Wallet Used: " + walletName);
	        printReceipt(walletAmount, "Online Wallet");
	    }

	    // 3. Payment by Credit Card
	    public void makePayment(String cardNumber, String cardHolderName, String expiryDate, double cardAmount) {
	        System.out.println("\nPayment Method: Credit Card");
	        System.out.println("Card Holder: " + cardHolderName);
	        System.out.println("Card Number Ending: " + cardNumber.substring(cardNumber.length() - 4));
	        printReceipt(cardAmount, "Credit Card");
	    }

	    // Print receipt
	    private void printReceipt(double amountPaid, String paymentMode) {
	        double totalAmount = calculateTotal();
	        System.out.println("--------- RECEIPT ---------");
	        System.out.println("Customer Name : " + customerName);
	        System.out.println("Tickets Booked: " + numberOfTickets);
	        System.out.println("Price/Ticket   : ₹" + pricePerTicket);
	        System.out.println("Total Amount   : ₹" + totalAmount);
	        System.out.println("Amount Paid    : ₹" + amountPaid);
	        System.out.println("Payment Mode   : " + paymentMode);
	        System.out.println("----------------------------");
	    }

}
