interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String acc, String name, double balance) {
        this.accountNumber = acc;
        this.holderName = name;
        this.balance = balance;
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan() {}

    public boolean calculateLoanEligibility() {
        return getBalance() > 50000;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() {
        return 0;
    }
}
