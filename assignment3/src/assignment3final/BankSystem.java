package assignment3final;

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount("Om Wakchaure", 5000);
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.addInterest();
        acc1.displayDetails();

        System.out.println();

        SavingsAccount acc2 = new SavingsAccount("Anya Sharma", 8000);
        acc2.withdraw(1000);
        acc2.displayDetails();

        System.out.println("\nTotal Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}
