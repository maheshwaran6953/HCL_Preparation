import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        int roleType = scanner.nextInt();
        int requiredLevel = scanner.nextInt();

        AccessControl employee = switch (roleType) {
            case 1 -> new Developer();
            case 2 -> new Manager();
            case 3 -> new Administrator();
            default -> throw new IllegalArgumentException("Invalid role type");
        };

        System.out.println("Role: " + employee.getRole());
        System.out.println("Access Level: " + employee.getAccessLevel());
        System.out.println("Can Access: " + employee.canAccess(requiredLevel));
    }
}