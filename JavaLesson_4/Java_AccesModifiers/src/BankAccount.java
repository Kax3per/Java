import java.util.Scanner;

public class BankAccount{
    Scanner scanner = new Scanner(System.in);
    private int accountNumber;
    private int balance;
    private String accountHolderName;

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        int balance = scanner.nextInt();
        this.balance += balance;
    }


    public void withdraw() {
        System.out.print("Enter withdraw amount: ");
        int balance = scanner.nextInt();
        this.balance -= balance;
    }

    public void Balance(){
        System.out.println("Balance: " + balance);
    }


}