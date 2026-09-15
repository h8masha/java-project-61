package hexlet.code;

import java.util.Random;

public class Prime {
    private String[] results;
    private String[] questions;
    private String description;

    private int generate() {
        Random rand = new Random();
        return rand.nextInt(500);
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < (int) Math.ceil(Math.sqrt(number)) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    Prime() {
        this.results = new String[Engine.NUMBER_OF_GAMES_ITERATIONS];
        this.questions = new String[Engine.NUMBER_OF_GAMES_ITERATIONS];
        this.description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.NUMBER_OF_GAMES_ITERATIONS; i++) {
            int temp = this.generate();
            this.questions[i] = "Question: " + temp;
            if (this.isPrime(temp)) {
                this.results[i] = "yes";
            } else {
                this.results[i] = "no";
            }
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
}
