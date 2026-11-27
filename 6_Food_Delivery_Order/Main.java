import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int deliveryType = scanner.nextInt();
            double orderAmount = scanner.nextDouble();

            Delivery delivery;
            if (deliveryType == 1) {
                delivery = new RegularDelivery(orderAmount);
            } else {
                delivery = new ExpressDelivery(orderAmount);
            }

            System.out.printf(Locale.US, "%.2f%n",
                    delivery.calculateDeliveryCharge());
        }
    }
}