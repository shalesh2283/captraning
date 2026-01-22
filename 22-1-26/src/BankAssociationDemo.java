class Bank {
    private String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer) {
        System.out.println(customer.getName() + " opened account in " + bankName);
    }
}

class Customer {
    private String name;
    private double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    String getName() {
        return name;
    }

    void viewBalance() {
        System.out.println(name + " balance: " + balance);
    }
}

public class BankAssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer customer = new Customer("Ravi", 5000);

        bank.openAccount(customer);
        customer.viewBalance();
    }
}
