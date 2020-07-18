import model.Board;
import model.Dice;
import model.Player;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.mockito.Mockito.*;

public class GameTest {
    @Test
    public void startShouldRunPlayerFOrNTurnsAndUpdatePosition() {
        Dice dice = mock(Dice.class);
        when(dice.throw_()).thenReturn(2).thenReturn(3);

        Player player = mock(Player.class);
        ArgumentCaptor<Integer> positionCapture = ArgumentCaptor.forClass(Integer.class);

        Board board = mock(Board.class);
        when(board.getNewPosition(player, 2)).thenReturn(4);
        when(board.getNewPosition(player, 3)).thenReturn(7);

        Game game = new Game(board, dice, player, 2);
        game.start();
        verify(player, times(2)).setPosition(positionCapture.capture());
        List<Integer> allPositions = positionCapture.getAllValues();
        Assert.assertEquals(Integer.valueOf(4), allPositions.get(0));
        Assert.assertEquals(Integer.valueOf(7), allPositions.get(1));
    }
}