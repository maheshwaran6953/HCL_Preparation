
public class Car extends Vehicle{

    Car() {
        super(1500.0);
    }

    @Override 
    public String getVehicleType() {
        return "Car";
    }
}
