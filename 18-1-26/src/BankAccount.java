public class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println(totalAccounts);
    }

    public void display(Object obj) {
        if (obj instanceof BankAccount) {
            System.out.println(accountHolderName);
            System.out.println(accountNumber);
            System.out.println(bankName);
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Amit", 101);
        b1.display(b1);
        getTotalAccounts();
    }
}
