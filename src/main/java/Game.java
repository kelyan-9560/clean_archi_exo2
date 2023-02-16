public class Game {
    private Integer numberToGuess;
    private Integer userGuess;
    private Integer attempts;
    private Integer maxAttempts;
    private Boolean continuePlaying;
    private String divergence;

    public Game() {
        this.numberToGuess = new ExpectedNumber().generateNumberToGuess();
        this.userGuess = 0;
        this.attempts = 0;
        this.maxAttempts = 10;
        this.continuePlaying = true;
        this.divergence = "";
    }


    //public void play()






}
