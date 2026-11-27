public class ExpressDelivery extends Delivery {
    public ExpressDelivery(double orderAmount) {
        super(orderAmount);
    }

    @Override
    public double calculateDeliveryCharge() {
        return orderAmount + 80.0 + (orderAmount * 5.0 / 100.0);
    }
}