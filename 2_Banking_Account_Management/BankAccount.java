abstract public class BankAccount {
    private final int accountNumber;
    private double balance;

    protected BankAccount(int accountNumber, double balance) {
        if(accountNumber < 1 || accountNumber > 1000000) {
            throw new IllegalArgumentException("Inavlid account number");
        }
        this.accountNumber = accountNumber;

        setBalance(balance);
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0.0 || balance > 10000000.0) {
            throw new IllegalArgumentException("Invalid balance");
        }
        this.balance = balance;
    }

    abstract public double calculateFinalBalance();
}
