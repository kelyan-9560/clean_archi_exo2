import java.util.Scanner;

public class Main {


    public String getDivergence(Integer userGuess, Integer number) {
        return userGuess < number ? "smaller" : "greater";
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("-===========================-");
        System.out.println("=== GUESS THE NUMBER GAME ===");
        System.out.println("-===========================-");
        boolean continuePlaying = true;

        while(continuePlaying) {
            System.out.println("Guess the number (between 1 and 100)!");
            //int number = generator.nextInt(100) + 1;
            Integer number = new ExpectedNumber().generateNumberToGuess();
            System.out.println("debug : the expected number is " + number);

            while (number != userGuess && attempts < maxAttempts) {
                //String input = scanner.nextLine();
                Integer input = InputParser.getUserGuess();
                attempts++;
                //try {
                    //userGuess = Integer.parseInt(input);
                    userGuess = input;
                    if (userGuess == number) {
                        System.out.println("You found it after " + attempts + " tries!");
                    } else {
                        String divergence = userGuess < number ? "smaller" : "greater";
                        System.out.println("Wrong! Your number is " + divergence + " than the correct one. " + (maxAttempts-attempts) + "/" + maxAttempts + " tries left");
                    }
                //} catch (NumberFormatException e) {
                //    System.out.println("Your input was '" + input + "', please enter a valid integer. " + (maxAttempts-attempts) + "/" + maxAttempts + " tries left");
                //}
            }

            if (number != userGuess) {
                System.out.println("You lose after " + maxAttempts + " tries, the expected number was " + number);
            }

            System.out.println("----------------------------------------------------");
            System.out.println("Do you want to try again with a new number (yes/no)?");
            String userResponse = scanner.nextLine().trim().toLowerCase();
            continuePlaying = userResponse.equals("yes");
            if (continuePlaying) {
                userGuess = 0;
                attempts = 0;
            }
        }

        System.out.println("== Thanks for playing! ==");
        scanner.close();
    }
}
