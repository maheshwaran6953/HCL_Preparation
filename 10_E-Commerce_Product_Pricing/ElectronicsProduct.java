

public class ElectronicsProduct extends Product {
    public ElectronicsProduct(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.12;
    }
}
