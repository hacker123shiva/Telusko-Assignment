import java.util.Scanner;

abstract class BankAccount {
    protected  double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void displayBalance();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Checking Account Balance: " + balance);
    }
}


class Main{
    public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter balance and amount");
        double balance=sc.nextDouble();
        double amount=sc.nextDouble();
        BankAccount savingsAccount = new SavingsAccount(balance);
        BankAccount checkingAccount = new CheckingAccount(balance);

        savingsAccount.deposit(amount);
        savingsAccount.displayBalance();

        checkingAccount.deposit(amount);
        checkingAccount.displayBalance();

        savingsAccount.withdraw(amount);
        savingsAccount.displayBalance();

        checkingAccount.withdraw(amount);
        checkingAccount.displayBalance();

    }
}
