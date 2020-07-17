package model;

public class Board {
    private final int lastPosition;
    private final Snake snake;

    public Board(int lastPosition, Snake snake) {
        this.lastPosition = lastPosition;
        this.snake = snake;
    }

    public int getNewPlayerPosition(Player player, int diceResult) {
        int newPosition = player.getPosition() + diceResult;
        if (snake.getHead() == newPosition) {
            return snake.getTail();
        }
        return newPosition;
    }
}
