package model;


import org.junit.Assert;
import org.junit.Test;

public class BoardTest {
    @Test
    public void getNewPlayerPositionGiveNewPositionForPlayer() {
        Player player = new Player("mahadev");
        Board board = new Board(0, 100);
        int newPlayerPosition = board.getNewPlayerPosition(player, 3);
        Assert.assertEquals(3, newPlayerPosition);
    }
}