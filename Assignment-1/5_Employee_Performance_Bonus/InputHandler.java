
import java.util.Locale;
import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        int employeeType = scanner.nextInt();
        String employeeName = scanner.next();
        Employee employee;
        double earningsBase;

        if (employeeType == 1) {
            double basicSalary = scanner.nextDouble();
            int rating = scanner.nextInt();
            employee = new TechnicalEmployee(employeeName, basicSalary, rating);
            earningsBase = basicSalary;
        } else if (employeeType == 2) {
            double salesAmount = scanner.nextDouble();
            employee = new SalesEmployee(employeeName, salesAmount);
            earningsBase = salesAmount;
        } else {
            throw new IllegalArgumentException("Invalid employee type: " + employeeType);
        }

        double bonus = employee.calculateBonus();
        double totalEarnings = earningsBase + bonus;

        System.out.printf(Locale.US, "Employee Name: %s%n", employee.getEmployeeName());
        System.out.printf(Locale.US, "Bonus: %.2f%n", bonus);
        System.out.printf(Locale.US, "Total Earnings: %.2f%n", totalEarnings);
    }
}