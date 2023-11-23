package OOPs.Module3.Part3.Task1;

public class BankAccount {
    private static int totalAccounts = 0;

    private int accountNumber;
    private double balance;

    public BankAccount(double initialBalance) {
        this.accountNumber = ++totalAccounts;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into Account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: $" + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: $" + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}

