import java.util.Scanner;

public class InputHandler {

    private Scanner scanner;
    private BankAccount account;

    InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readInt(String message) {
        System.out.println(message);
        return scanner.nextInt(); 
    }

    public Double readDouble(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    public void createAccount(int accountType, int accountNumber, double balance) {
        if(accountType == 1) {
            double interestRate = readDouble("Enter the interest rate");
            account = new SavingsAccount(accountNumber, balance, interestRate);
        } else if (accountType == 2) {
            double overdraftLimit = readDouble("Enter the over draft limit");
            account = new CurrentAccount(accountNumber, balance, overdraftLimit);
        } else {
            throw new IllegalArgumentException("Invalid account type");
        }
    }

    public void start() {
        System.out.println("---------------------------------------------");
        System.out.println("Welcome To Bank Management System!");
        System.out.println("---------------------------------------------");

        int accountType = readInt("Enter the Account type : ");
        int accountNumber = readInt("Enter the Account number : ");
        double balance = readDouble("Enter the balance : ");

        createAccount(accountType, accountNumber, balance);

        System.out.printf("%.2f%n", account.calculateFinalBalance());
    }
}
