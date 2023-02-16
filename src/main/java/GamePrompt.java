public class GamePrompt {

    public static void gameTitle() {
        System.out.println("-===========================-");
        System.out.println("=== GUESS THE NUMBER GAME ===");
        System.out.println("-===========================-");
        System.out.println("Guess the number (between 1 and 100)!");
    }

    public static void endGame() {
        System.out.println("== Thanks for playing! ==");
    }

    public static void userLose(Integer maxAttempts, Integer number) {
        System.out.println("You lose after " + maxAttempts + " tries, the expected number was " + number);
    }


    public static void userWin(Integer attempts) {
        System.out.println("You found it after " + attempts + " tries!");
    }
}
