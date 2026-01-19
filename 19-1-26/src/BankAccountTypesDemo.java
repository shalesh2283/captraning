class BankAccount {
    int accNo;
    double balance;
    BankAccount(int a,double b){
        accNo=a; balance=b;
    }
}

class SavingsAccount extends BankAccount {
    double interest;
    SavingsAccount(int a,double b,double i){
        super(a,b); interest=i;
    }
    void displayAccountType(){
        System.out.println("Savings");
    }
}

class CheckingAccount extends BankAccount {
    int limit;
    CheckingAccount(int a,double b,int l){
        super(a,b); limit=l;
    }
    void displayAccountType(){
        System.out.println("Checking");
    }
}

class FixedDepositAccount extends BankAccount {
    int years;
    FixedDepositAccount(int a,double b,int y){
        super(a,b); years=y;
    }
    void displayAccountType(){
        System.out.println("FD");
    }
}

public class BankAccountTypesDemo {
    public static void main(String[] args){
        BankAccount b=new SavingsAccount(1,1000,5);
        ((SavingsAccount)b).displayAccountType();
    }
}
