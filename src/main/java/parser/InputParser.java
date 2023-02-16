package parser;

import java.util.Scanner;

public class InputParser {
    public static Integer getUserGuess() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Your input was '" + input + "', please enter a valid integer.");
        }
        return 0;
    }


}
