import parser.InputParser;
import parser.ReplayParser;

import java.util.Objects;

public class Game {
    private Integer numberToGuess;
    private Integer userGuess;
    private Integer attempts;
    private Integer maxAttempts;
    private String divergence;

    public Game(Integer numberToGuess, Integer userGuess, Integer attempts, Integer maxAttempts, String divergence) {
        this.numberToGuess = numberToGuess;
        this.userGuess = userGuess;
        this.attempts = attempts;
        this.maxAttempts = maxAttempts;
        this.divergence = divergence;
    }

    public void play(){
        GamePrompt.gameTitle();

        Boolean continuePlaying = true;

        while(continuePlaying) {

            Integer number = new ExpectedNumberGenerator().generate();

            System.out.println("debug : the expected number is " + number);

            //Isoler de la boucle
            while (!Objects.equals(number, userGuess) && attempts < maxAttempts) {
                Integer input = InputParser.getUserGuess();
                attempts++;
                userGuess = input;
                if (userGuess.equals(number)) {
                    GamePrompt.userWin(attempts);
                } else {
                    String divergence = userGuess < number ? "smaller" : "greater";
                    System.out.println("Wrong! Your number is " + divergence + " than the correct one. " + (maxAttempts-attempts) + "/" + maxAttempts + " tries left");
                }
            }

            if (!Objects.equals(number, userGuess)) {
                GamePrompt.userLose(maxAttempts, number);
            }


            continuePlaying = ReplayParser.userWantToPlayAgain();
            if (continuePlaying) {
                userGuess = 0;
                attempts = 0;
            }
        }

        GamePrompt.endGame();
    }



    //Mettre dans une autre classe
    public String getDivergence(Integer userGuess, Integer number) {
        return userGuess < number ? "smaller" : "greater";
    }


}
