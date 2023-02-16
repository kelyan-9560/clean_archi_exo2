import java.util.Random;

public class ExpectedNumber {
    public Integer generateNumberToGuess() {
        Random generator = new Random();
        return generator.nextInt(100) + 1;
    }
}
