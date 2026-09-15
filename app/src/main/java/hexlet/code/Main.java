package hexlet.code;

import java.time.LocalDateTime;
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
                Main.even();
            }
        }
    }

    private static int generator() {
        LocalDateTime dateTime = LocalDateTime.now();
        return dateTime.getSecond() * dateTime.getDayOfMonth();
    }

    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        String userName = Cli.call();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void even() {
        String userName = Main.greeting();
        Scanner scan = new Scanner(System.in);
        boolean isAllCorrect = true;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int digit = Main.generator();
            System.out.println("Question: " + digit);
            String res = digit % 2 == 0 ? "yes" : "no";
            String userChoose = scan.nextLine();
            if (res.equalsIgnoreCase(userChoose)) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'"
                                + userChoose
                                + "' is wrong answer ;(. Correct answer was '"
                                + res
                                + "'.");
                System.out.println("Let's try again, " + userName + "!");
                isAllCorrect = false;
            }
        }
        if (isAllCorrect) {
            System.out.println("Congratulations, " + userName + "!");
        }
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
