import model.Board;
import model.Dice;
import model.Player;

public class SnakeLadderApplication {
    public static void main(String[] args) {
        Player player = new Player("mahadev");
        Dice dice = new Dice();
        Board board = new Board(0, 100);
        Game game = new Game(board, dice, player, 10);
        game.start();
    }
}
