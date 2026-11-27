
abstract public class Course {
    private double courseFee;

    public Course(double courseFee) {
        this.courseFee = courseFee;
    }

    public double getCourseFee() {
        return courseFee;
    }

    abstract public double calculateDiscount();

    abstract public String getCourseType();

    public double calculateFinalFee() {
        return courseFee - calculateDiscount();
    }
}
