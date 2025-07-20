package assignment3final;

abstract class BankAccount {
    protected String accountHolder;
    protected int accountNumber;
    protected double balance;
    private static int nextAccountNumber = 1000;

    // Static variable shared across all accounts
    protected static int totalAccounts = 0;

    // Final constant for the bank name
    public static final String BANK_NAME = "TNS National Bank";

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountNumber = nextAccountNumber++;
        totalAccounts++;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void displayDetails() {
        System.out.println("Bank: " + BANK_NAME);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    // Static method to get total accounts created
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
