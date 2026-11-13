public class ContractEmployee extends Employee {

    private int workingDays;
    private double dailyRate;

    public ContractEmployee(int employeeId, String employeeName, int workingDays, double dailyRate) {
        super(employeeId, employeeName);

        if(workingDays <= 0  || workingDays > 31) {
            throw new IllegalArgumentException("Invalid working dys.");
        }

        if(dailyRate <= 0.0 || dailyRate > 100000.0) {
            throw new IllegalArgumentException("Invalid daily rate");
        }

        this.workingDays = workingDays;
        this.dailyRate = dailyRate;
    }
    
    @Override
    public double calculateSalary() {
        return workingDays * dailyRate;
    }
}
