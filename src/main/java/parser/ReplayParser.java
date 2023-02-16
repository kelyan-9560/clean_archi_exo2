package parser;

import java.util.Scanner;

public class ReplayParser {
    public static Boolean userWantToPlayAgain() {
        System.out.println("----------------------------------------------------");
        System.out.println("Do you want to try again with a new number (yes/no)?");
        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.nextLine().trim().toLowerCase();

        if(!userResponse.equals("yes") && !userResponse.equals("no")) {
            System.out.println("Your input was '" + userResponse + "', please enter a valid answer (yes/no).");
            return userWantToPlayAgain();
        }

        return userResponse.equals("yes");
    }
}
