import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        InputHandler handler = new InputHandler(scanner);

        handler.start();

        scanner.close();
    }
}