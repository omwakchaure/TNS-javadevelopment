package assignment3final;

class SavingsAccount extends BankAccount {

    private final double INTEREST_RATE = 0.03; 

    public SavingsAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited to Savings Account.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Savings Account.");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void addInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest of ₹" + interest + " added.");
    }
}
