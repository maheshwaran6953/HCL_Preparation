public class CreditCardPayment implements Payment {

    @Override
    public double calculateFee(double amount) {
        return amount * 0.02;
    }
}