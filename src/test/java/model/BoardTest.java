package model;


import org.junit.Assert;
import org.junit.Test;

public class BoardTest {
    @Test
    public void getNewPlayerPositionGiveNewPositionForPlayer() {
        Player player = new Player("mahadev");
        Snake snake = new Snake(2, 10);
        Board board = new Board(0, 100, snake);
        int newPlayerPosition = board.getNewPlayerPosition(player, 3);
        Assert.assertEquals(3, newPlayerPosition);
    }

    @Test
    public void getNewPlayerPositionGiveNewPositionAsTailOfSnakeWhenSnakeEats() {
        Player player = new Player("mahadev");
        Snake snake = new Snake(5, 2);
        Board board = new Board(0, 100, snake);
        int newPlayerPosition = board.getNewPlayerPosition(player, 5);
        Assert.assertEquals(2, newPlayerPosition);
    }
}