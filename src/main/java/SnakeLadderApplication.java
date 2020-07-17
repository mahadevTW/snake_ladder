import model.Throwable;
import model.*;


public class SnakeLadderApplication {
    public static void main(String[] args) {
        Throwable dice = new Dice();
        Throwable crookedDice = new CrookedDice();
        System.out.println("---Playing with normal Dice---");
        Player player = new Player("mahadev");
        Snake snake = new Snake(14, 7);
        Board board = new Board(100, snake);
        Game game = new Game(board, dice, player, 10);
        game.start();

        System.out.println("---Playing with Crooked Dice---");
        player.setPosition(0);
        game = new Game(board, crookedDice, player, 10);
        game.start();
    }
}
