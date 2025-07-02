package exercisetwo;
import java.util.Scanner;
public class Atmdemo {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double balance = 1000.00; // Initial balance
	        int choice;

	        while (true) {
	            System.out.println("\n===== ATM Menu =====");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Your current balance is: $" + balance);
	                    break;

	                case 2:
	                    System.out.print("Enter amount to deposit: $");
	                    double deposit = scanner.nextDouble();
	                    if (deposit > 0) {
	                        balance += deposit;
	                        System.out.println("Deposited successfully.");
	                    } else {
	                        System.out.println("Invalid deposit amount.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter amount to withdraw: $");
	                    double withdraw = scanner.nextDouble();
	                    if (withdraw > 0 && withdraw <= balance) {
	                        balance -= withdraw;
	                        System.out.println("Withdrawn successfully.");
	                    } else {
	                        System.out.println("Invalid or insufficient funds.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    scanner.close();
	                    System.exit(0); // Exit the program

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}


