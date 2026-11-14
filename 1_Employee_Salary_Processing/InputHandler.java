
import java.util.Scanner;

public class InputHandler {

    private Scanner scanner;
    private Employee employee;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readInt(String message) {
        System.out.println(message);
        return scanner.nextInt(); 
    }

    public String readString(String message) {
        System.out.println(message);
        return scanner.next();
    }
    
    public boolean readBoolean(String message) {
        System.out.println(message);
        return scanner.nextBoolean();
    }

    public Double readDouble(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    public void createEmployee(int employeeType, int employeeId, String employeeName) {
        if(employeeType == 1) {
            double monthlySalary = readDouble("Enter monthly salary : ");
            employee = new FullTimeEmployee(employeeId, employeeName, monthlySalary);
        } else if(employeeType == 2){
            int workingDays = readInt("Enter no. of working days : ");
            double dailyRate = readDouble("Enter daily rate : ");
            employee = new ContractEmployee(employeeId, employeeName, workingDays, dailyRate);
        } else {
            throw new IllegalArgumentException("Invalid employee type");
        }
    }

    public void start() {
        System.out.println("---------------------------------------------");
        System.out.println("Welcome To Employee Salary Processing System!");
        System.out.println("---------------------------------------------");

        int employeeType = readInt("Enter the Employee type(1/2) : ");
        int employeeId = readInt("Enter the Employee Id : ");
        String employeeName = readString("Enter the Employee Name : ");

        createEmployee(employeeType, employeeId, employeeName);

        System.out.println("Employee created successfully");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.printf("Salary: %.2f%n" , employee.calculateSalary());
    }
}
