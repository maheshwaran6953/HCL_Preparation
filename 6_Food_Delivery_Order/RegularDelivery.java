public class RegularDelivery extends Delivery {
    public RegularDelivery(double orderAmount) {
        super(orderAmount);
    }

    @Override
    public double calculateDeliveryCharge() {
        return orderAmount + 40.0;
    }
}