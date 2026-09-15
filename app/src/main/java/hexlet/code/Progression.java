package hexlet.code;

import java.util.Random;

public class Progression {
    private String[] results;
    private String[] questions;
    private String description;

    Progression() {
        this.description = "What number is missing in the progression?";
        this.questions = new String[Engine.NUMBER_OF_GAMES_ITERATIONS];
        this.results = new String[Engine.NUMBER_OF_GAMES_ITERATIONS];
        Random rand = new Random();
        for (int j = 0; j < Engine.NUMBER_OF_GAMES_ITERATIONS; j++) {
            String temp = "Question: ";
            int index = rand.nextInt(7);
            int start = rand.nextInt(119);
            for (int i = 0; i < 8; i++) {
                if (i != index) {
                    temp += Integer.toString(start + i) + " ";
                } else {
                    temp += ".. ";
                }
            }
            questions[j] = temp;
            results[j] = Integer.toString(start + index);
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
