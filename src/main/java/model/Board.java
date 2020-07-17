package model;

public class Board {
    private final int minPosition;
    private final int maxPosition;

    public Board(int minPosition, int maxPosition) {
        this.minPosition = minPosition;
        this.maxPosition = maxPosition;
    }

    public int getNewPlayerPosition(Player player, int diceResult) {
        return player.getPosition() + diceResult;
    }
}
