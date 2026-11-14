import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;
    private Vehicle vehicle;

    InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readInt(String message) {
        System.out.println(message);
        return scanner.nextInt(); 
    }

    public void calculateRentalCharge(int vehicleType, int rentalDays) {
        if(vehicleType == 1) {
            vehicle = new Car();
        } else if (vehicleType == 2) {
            vehicle = new Bike();
        } else if (vehicleType == 3) {
            vehicle = new Truck();
        } else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }

    public void start() {
        int vehicleType = readInt("Enter vehicle type: ");
        int rentalDays = readInt("Enter rental days: ");

        calculateRentalCharge(vehicleType, rentalDays);

        System.out.println("Vehicle type: " + vehicle.getVehicleType());
        System.out.printf("Rental charge: " + vehicle.calculateRentalCharge(rentalDays));
    }
}
