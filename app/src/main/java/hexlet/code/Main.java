package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userChoose;

        while (true) {

            userChoose = Main.mainLoop();

            if (userChoose == -1) {
                continue;
            } else if (userChoose == 0) {
                break;
            } else if (userChoose == 1) {
                Main.greeting();
            } else if (userChoose == 2) {
                Even.even();
            }
        }
    }

    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        String userName = Cli.call();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static int mainLoop() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(
                """
                1 - Greet
                2 - Even
                0 - Exit
                """);
        int choose;
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        try {
            choose = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input isn't correct. Try again");
            choose = -1;
        }
        return choose;
    }
}
