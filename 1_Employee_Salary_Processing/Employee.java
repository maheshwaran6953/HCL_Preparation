abstract public class Employee {

    private final int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {

        if(employeeId < 1 || employeeId > 100000) {
            throw new IllegalArgumentException("Invalid employee Id");
        }

        this.employeeId = employeeId;
        setEmployeeName(employeeName);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if(employeeName == null || employeeName.isBlank()) {
            throw new IllegalArgumentException("Invalid Employee Name.");
        }

        for(char c : employeeName.toCharArray()) {
            if(!Character.isLetter(c)) {
                throw new IllegalArgumentException("Invalid name");
            }
        }

        this.employeeName = employeeName;
    }

    abstract public double calculateSalary();
}
