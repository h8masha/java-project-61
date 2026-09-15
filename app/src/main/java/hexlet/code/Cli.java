package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String call() {
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        scan.close();
        return userName;
    }
}
