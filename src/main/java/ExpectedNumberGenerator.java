import java.util.Random;

public class ExpectedNumberGenerator {

    public Integer generate() {
        Random generator = new Random();
        return generator.nextInt(100) + 1;
    }
}
