
public class Main {

    public static void main(String[] args) {

        Game game = new Game(
                new ExpectedNumberGenerator().generate(),
                0, 0, 10, "");

        game.play();
    }
}
