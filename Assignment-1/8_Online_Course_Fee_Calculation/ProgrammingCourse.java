
public class ProgrammingCourse extends Course {
    public ProgrammingCourse(double courseFee) {
        super(courseFee);
    }

    @Override
    public double calculateDiscount() {
        return getCourseFee() * 0.10;
    }

    @Override
    public String getCourseType() {
        return "Programming";
    }
    
}
