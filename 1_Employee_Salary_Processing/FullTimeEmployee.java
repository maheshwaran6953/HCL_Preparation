public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary) {
        super(employeeId, employeeName);

        if(monthlySalary < 1) {
            throw new IllegalArgumentException("Invalid monthly salary");
        }

        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
