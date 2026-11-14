import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;
    private Payment payment;

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

    public void validateAmount(double amount) {
        if(amount < 0.0 || amount > 1000000.0) {
            throw new IllegalArgumentException("Invalid amount");
        }
    }

    public void createPayment(int paymentType, double paymentAmount) {
        if(paymentType == 1) {
            payment = new CreditCardPayment();
        } else if(paymentType == 2) {
            payment = new UpiPayment();
        } else if(paymentType == 3) {
            payment = new WalletPayment();
        } else {
        throw new IllegalArgumentException("Invalid payment type");
        }
    }

    public void start() {
        int paymentType = readInt("Enter payment type: ");
        double paymentAmount = readDouble("Enter payment amount: ");

        validateAmount(paymentAmount);
        createPayment(paymentType, paymentAmount);

        double tranactionFee = payment.calculateFee(paymentAmount);
        double finalAmount  = paymentAmount + tranactionFee;

        System.out.printf("Payment Amount: %.2f" , paymentAmount);
        System.out.printf("Transaction Amount: %.2f" , tranactionFee);
        System.out.printf("Final Amount: %.2f" , finalAmount);
    }
}
