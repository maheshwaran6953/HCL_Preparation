
public class DataScienceCourse extends Course {
    public DataScienceCourse(double courseFee) {
        super(courseFee);
    }

    @Override
    public double calculateDiscount() {
        return getCourseFee() * 0.15;
    }

    @Override
    public String getCourseType() {
        return "Data Science";
    }
    
}
