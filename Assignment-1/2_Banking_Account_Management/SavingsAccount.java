
public class SavingsAccount extends BankAccount{

    private double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);

        if(interestRate < 0.0 || interestRate > 20.0) {
            throw new IllegalArgumentException("Invalid Interest rate");
        }
        this.interestRate = interestRate;
    }

    @Override
    public double calculateFinalBalance() {
        return getBalance() + (getBalance() * interestRate / 100);
    }
}
