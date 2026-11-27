
public class TechnicalEmployee extends Employee {

    private double basicSalary;
    private int rating;

    public TechnicalEmployee(String employeeName, double basicSalary, int rating) {
        super(employeeName);
        this.basicSalary = basicSalary;
        this.rating = rating;
    }

    @Override
    public double calculateBonus() {
        return calculateBonus(basicSalary, rating);
    }

    public double calculateBonus(double salary, int employeeRating) {
        return salary * employeeRating * 2 / 100.0;
    }
}
