package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_GAMES_ITERATIONS = 3;

    public static void run(String description, String[] result, String[] questions) {
        System.out.println("Welcome to the Brain Games!");
        String userName = Cli.call();
        System.out.println(description);
        Scanner scanner = new Scanner(System.in);
        String temp;
        boolean isAllCorrect = true;
        for (int i = 0; i < NUMBER_OF_GAMES_ITERATIONS; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            temp = scanner.nextLine();
            System.out.println();
            if (temp.equalsIgnoreCase(result[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'"
                                + temp
                                + "' is wrong answer ;(. Correct answer was '"
                                + result[i]
                                + "'");
                isAllCorrect = false;
            }
        }
        if (isAllCorrect) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("You need 3 of 3 correct answers to win. Better luck next time!");
        }
    }
}
