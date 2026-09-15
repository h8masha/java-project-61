package hexlet.code;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Even {

    private static int generator() {
        LocalDateTime dateTime = LocalDateTime.now();
        return dateTime.getSecond() * dateTime.getDayOfMonth();
    }

    public static void even() {
        String userName = Main.greeting();
        Scanner scan = new Scanner(System.in);
        boolean isAllCorrect = true;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int digit = Even.generator();
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
        } else {
            System.out.println("You need 3 of 3 correct answers to win. Better luck next time!");
        }
    }
}
