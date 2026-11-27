public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);

        if(overdraftLimit < 0.0 || overdraftLimit > 500000.0) {
            throw new IllegalArgumentException("Invalid Interest rate");
        }
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateFinalBalance() {
        return getBalance() + overdraftLimit;
    }
}