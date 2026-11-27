
public class CloudCourse extends Course {
    public CloudCourse(double courseFee) {
        super(courseFee);
    }

    @Override
    public double calculateDiscount() {
        return getCourseFee() * 0.05;
    }

    @Override
    public String getCourseType() {
        return "Cloud";
    }
    
}
