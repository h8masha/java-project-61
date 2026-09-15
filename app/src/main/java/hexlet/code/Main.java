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
                System.out.println("Welcome to the Brain Games!");
                String name = Cli.call();
                System.out.println("Hello, " + name + "!");
                break;
            } else if (userChoose == 2) {
                Even even = new Even();
                Engine.run(even.getDescription(), even.getResults(), even.getQuestions());
                break;
            } else if (userChoose == 3) {
                Calculator calculator = new Calculator();
                Engine.run(
                        calculator.getDescription(),
                        calculator.getResults(),
                        calculator.getQuestions());
                break;
            } else if (userChoose == 4) {
                Gcd gcd = new Gcd();
                Engine.run(gcd.getDescription(), gcd.getResults(), gcd.getQuestions());
                break;
            } else if (userChoose == 5) {
                Progression progression = new Progression();
                Engine.run(
                        progression.getDescription(),
                        progression.getResults(),
                        progression.getQuestions());
                break;
            } else if (userChoose == 6) {
                Prime prime = new Prime();
                Engine.run(prime.getDescription(), prime.getResults(), prime.getQuestions());
                break;
            } else {
                System.out.println("Your input number isn't exist in a list of games. Try again");
                break;
            }
        }
    }

    public static int mainLoop() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(
                """
                1 - Greet
                2 - Even
                3 - Calculator
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        int choose;
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        try {
            choose = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Your input isn't correct. Try again");
            choose = -1;
        }
        return choose;
    }
}
