import model.Board;
import model.Dice;
import model.Player;
import model.Snake;

public class SnakeLadderApplication {
    public static void main(String[] args) {
        Player player = new Player("mahadev");
        Dice dice = new Dice();
        Snake snake = new Snake(10, 2);
        Board board = new Board(0, 100, snake);
        Game game = new Game(board, dice, player, 10);
        game.start();
    }
}
