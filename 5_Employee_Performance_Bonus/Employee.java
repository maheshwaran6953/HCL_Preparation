


public abstract class Employee {

    private final String employeeName;

    protected Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public abstract double calculateBonus();

    public double calculateBonus(double amount) {
        return amount * 3 / 100.0;
    }
}
