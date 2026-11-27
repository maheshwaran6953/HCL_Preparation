public class UpiPayment implements Payment {

    @Override
    public double calculateFee(double amount) {
        return amount * 0.005;
    }
}