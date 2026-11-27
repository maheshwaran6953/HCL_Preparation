
public class ClothingProduct extends Product {
    public ClothingProduct(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
}
