// Class representing a basic account
class Account {
    private String owner;
    private double balance;

    // Constructor
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Owner: " + owner + ", Balance: $" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: $" + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: $" + balance);
        }
    }
}