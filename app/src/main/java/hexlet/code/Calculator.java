package hexlet.code;

import java.util.Random;

public class Calculator {
    private String[] results;
    private String[] questions;
    private String description;

    int generateRandomTo(int range) {
        Random rand = new Random();
        return rand.nextInt(range);
    }

    Calculator() {
        questions = new String[Engine.NUMBER_OF_GAMES_ITERATIONS];
        results = new String[Engine.NUMBER_OF_GAMES_ITERATIONS];
        description = "What is the result of the expression?";

        for (int i = 0; i < Engine.NUMBER_OF_GAMES_ITERATIONS; i++) {
            int tempA = this.generateRandomTo(99);
            int tempB = this.generateRandomTo(135);
            int operation = this.generateRandomTo(3); // 1 - "+", 2 - "-", 3 - "*"
            if (operation == 1) {
                questions[i] = "Question: " + tempA + " + " + tempB;
                results[i] = Integer.toString(tempA + tempB);
            } else if (operation == 2) {
                questions[i] = "Question: " + tempA + " - " + tempB;
                results[i] = Integer.toString(tempA - tempB);
            } else {
                questions[i] = "Question: " + tempA + " * " + tempB;
                results[i] = Integer.toString(tempA * tempB);
            }
        }
    }

    public String[] getResults() {
        return this.results;
    }

    public String[] getQuestions() {
        return this.questions;
    }

    public String getDescription() {
        return this.description;
    }
}
