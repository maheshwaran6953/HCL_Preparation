
public class InputHandler {

    private final Scanner scanner;

    InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("Enter the number of courses: ");
        int numberOfCourses = scanner.nextInt();
        scanner.nextLine();

        double totalFee = 0.0;

        for (int i = 1; i <= numberOfCourses; i++) {
            System.out.print("Enter the fee for course " + i + ": ");
            double courseFee = scanner.nextDouble();
            totalFee += courseFee;
        }

        System.out.println("Total fee for " + numberOfCourses + " courses: " + totalFee);
    }
}
