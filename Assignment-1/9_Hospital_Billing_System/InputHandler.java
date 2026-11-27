import java.util.Locale;
import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        int doctorType = scanner.nextInt();
        double testCharges = scanner.nextDouble();

        Doctor doctor;
        switch (doctorType) {
            case 1:
                doctor = new GeneralPhysician(500.0);
                break;
            case 2:
                doctor = new Specialist(1000.0);
                break;
            case 3:
                doctor = new EmergencyDoctor(1500.0);
                break;
            default:
                throw new IllegalArgumentException("Invalid doctor type");
        }

        System.out.println("Doctor Type: " + doctor.getDoctorType());
        System.out.printf(Locale.US, "Consultation Charge: %.2f%n",
                doctor.getConsultationCharge());
        System.out.printf(Locale.US, "Test Charges: %.2f%n", testCharges);
        System.out.printf(Locale.US, "Total Bill: %.2f%n",
                doctor.calculateTotalBill(testCharges));
    }
}