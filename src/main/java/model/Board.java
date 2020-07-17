package model;

public class Board {
    private final int minPosition;
    private final int maxPosition;
    private final Snake snake;

    public Board(int minPosition, int maxPosition, Snake snake) {
        this.minPosition = minPosition;
        this.maxPosition = maxPosition;
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
