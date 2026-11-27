public class EmergencyDoctor extends Doctor {
    public EmergencyDoctor(double consultationCharge) {
        super(consultationCharge);
    }

    @Override
    public String getDoctorType() {
        return "Emergency Doctor";
    }

    @Override
    public double calculateTotalBill(double testCharges) {
        return super.calculateTotalBill(testCharges) + testCharges;
    }
}