public class GeneralPhysician extends Doctor {
    public GeneralPhysician(double consultationCharge) {
        super(consultationCharge);
    }

    @Override
    public String getDoctorType() {
        return "General Physician";
    }
}