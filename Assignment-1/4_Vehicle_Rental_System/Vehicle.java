
abstract public class Vehicle {

    private double dailyRate;

    protected Vehicle(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double calculateRentalCharge(int rentalDays) {
        return dailyRate * rentalDays;
    }
    
    abstract public String getVehicleType();
}
