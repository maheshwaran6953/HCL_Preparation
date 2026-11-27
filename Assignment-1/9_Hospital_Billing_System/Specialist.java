public class Specialist extends Doctor {
    public Specialist(double consultationCharge) {
        super(consultationCharge);
    }

    @Override
    public String getDoctorType() {
        return "Specialist";
    }
}