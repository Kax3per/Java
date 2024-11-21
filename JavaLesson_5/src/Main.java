//EX 1

class Message {
    String recipientName;
    String senderName;

    public Message(String recipientName, String senderName) {
        this.recipientName = recipientName;
        this.senderName = senderName;
    }

    public void sendMessage() {
        System.out.println("Message sent to " + recipientName);
    }
}

class PushNotification extends Message {
    public PushNotification(String recipientName, String senderName) {
        super(recipientName, senderName);
    }

    @Override
    public void sendMessage() {
        System.out.println("Push notifications sent to " + recipientName);
    }
}

class WhatsAppMessage extends Message {
    public WhatsAppMessage(String recipientName, String senderName) {
        super(recipientName, senderName);
    }

    @Override
    public void sendMessage() {
        System.out.println("Message sent to " + recipientName + " by WhatsApp");
    }
}

//EX2

class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String accountHolderName;

    public BankAccount(int accountNumber, double accountBalance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
    }

    // Pobieranie numeru konta
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Pobieranie salda
    public double getBalance() {
        return accountBalance;
    }

    public void setBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Pobieranie nazwy właściciela konta
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Dokonywanie wpłaty
    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    // Dokonywanie wypłaty
    public void withdraw(double amount) {
        if (this.accountBalance - amount < 0) {
            System.out.println("Not enought money to withdraw");
        } else {
            this.accountBalance -= amount;
        }
    }

    // Wyświetlanie stanu konta
    public void displayAccountBalance() {
        System.out.println(accountHolderName + " have: " + accountBalance + " $");
    }
}



public class Main {
    public static void main(String[] args) {
        // Tablica przechowująca różne typy wiadomości
        Message[] messages = new Message[3];
        messages[0] = new Message("Joe", "Bob");
        messages[1] = new WhatsAppMessage("Michael", "Caroline");
        messages[2] = new PushNotification("Robert", "Oscar");


        for (Message currentMessage : messages) {
            currentMessage.sendMessage();
        }

        // Tworzenie nowego konta bankowego
        BankAccount bankAccount = new BankAccount(1, 1000, "Joe Doe");

        // Dokonanie wpłaty
        bankAccount.deposit(5000);
        System.out.println(bankAccount.getBalance());

        // Próba wypłaty kwoty mieszczącej się w saldzie
        bankAccount.withdraw(3000);
        System.out.println(bankAccount.getBalance());

        // Próba wypłaty większej kwoty niż dostępne saldo
        bankAccount.withdraw(7000);
        System.out.println(bankAccount.getBalance());
    }
}