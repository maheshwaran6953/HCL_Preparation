public abstract class Doctor {
    private final double consultationCharge;

    public Doctor(double consultationCharge) {
        this.consultationCharge = consultationCharge;
    }

    public double getConsultationCharge() {
        return consultationCharge;
    }

    public abstract String getDoctorType();

    public double calculateTotalBill(double testCharges) {
        return consultationCharge;
    }
}