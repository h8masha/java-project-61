package hexlet.code;

import java.time.LocalDateTime;
import java.util.Random;

public class Even {

    private String[] results;
    private String[] questions;
    private String description;

    Even() {
        this.description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int temp;
        this.questions = new String[Engine.NUMBER_OF_GAMES_ITERATIONS];
        this.results = new String[Engine.NUMBER_OF_GAMES_ITERATIONS];
        for (int i = 0; i < Engine.NUMBER_OF_GAMES_ITERATIONS; i++) {
            temp = generator();
            questions[i] = "Question: " + temp;
            results[i] = temp % 2 == 0 ? "yes" : "no";
        }
    }

    public String[] getQuestions() {
        return this.questions;
    }

    public String[] getResults() {
        return this.results;
    }

    public String getDescription() {
        return this.description;
    }

    private static int generator() {
        LocalDateTime dateTime = LocalDateTime.now();
        Random ran = new Random();
        int a = ran.nextInt(100);
        return dateTime.getSecond() * dateTime.getDayOfMonth() + a;
    }
}
