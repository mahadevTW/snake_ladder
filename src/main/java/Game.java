import model.Board;
import model.Dice;
import model.Player;

public class Game {
    private final Board board;
    private final Dice dice;
    private Player player;
    private final int turns;

    public Game(Board board, Dice dice, Player player, int turns) {
        this.board = board;
        this.dice = dice;
        this.player = player;
        this.turns = turns;
    }

    void start() {
        for (int i = 0; i < turns; i++) {
            int result = dice.throw_();
            int newPosition = board.getNewPlayerPosition(player, result);
            player.setPosition(newPosition);
            System.out.println("Turn " + i + 1);
            System.out.println(player);
        }
    }
}
