
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new InputHandler(scanner).readProduct();
        double discount = product.calculateDiscount();

        System.out.printf(Locale.US, "Product ID: %d%n", product.getProductId());
        System.out.printf(Locale.US, "Product Name: %s%n", product.getProductName());
        System.out.printf(Locale.US, "Discount: %.2f%n", discount);
        System.out.printf(Locale.US, "Final Price: %.2f%n", product.getPrice() - discount);

        scanner.close();
    }
}
