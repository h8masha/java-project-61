package hexlet.code;

import java.util.Random;

public class Gcd {
    private String[] results;
    private String[] questions;
    private String description;

    private int generate() {
        Random r = new Random();
        return r.nextInt(100);
    }

    private int getGcd(int a, int b) {
        int i = 1;
        int res = i;
        int cond = Math.max(a, b);
        while (i < cond) {
            if (a % i == 0 && b % i == 0) {
                res = i;
            }
            i++;
        }
        return res;
    }

    Gcd() {
        this.results = new String[Engine.NUMBER_OF_GAMES_ITERATIONS];
        this.questions = new String[Engine.NUMBER_OF_GAMES_ITERATIONS];
        this.description = "Find the greatest common divisor of given numbers.";
        for (int i = 0; i < Engine.NUMBER_OF_GAMES_ITERATIONS; i++) {
            int first = this.generate();
            int second = this.generate();
            int res = this.getGcd(first, second);
            this.questions[i] = "Question: " + first + " " + second;
            this.results[i] = Integer.toString(res);
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
