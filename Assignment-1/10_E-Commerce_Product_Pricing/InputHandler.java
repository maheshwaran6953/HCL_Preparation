
import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public Product readProduct() {
        int productType = scanner.nextInt();
        int productId = scanner.nextInt();
        String productName = scanner.next();
        double price = scanner.nextDouble();

        Product product;
        switch (productType) {
            case 1:
                product = new ElectronicsProduct(productId, productName, price);
                break;
            case 2:
                product = new ClothingProduct(productId, productName, price);
                break;
            case 3:
                product = new GroceryProduct(productId, productName, price);
                break;
            default:
                throw new IllegalArgumentException("Invalid product type: " + productType);
        }

        return product;
    }
}
