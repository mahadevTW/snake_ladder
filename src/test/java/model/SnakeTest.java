package model;


import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {
    @Test
    public void canEatAtShouldReturnTrueIfPositionIsSameAsHead() {
        boolean eatable = new Snake(10, 4).canEatAt(10);
        assertTrue(eatable);
    }

    @Test
    public void canEatAtShouldReturnFalseIfPositionIsNotSameAsHead() {
        boolean eatable = new Snake(9, 4).canEatAt(10);
        assertFalse(eatable);
    }

    @Test
    public void eatShouldReturnTailPositionIfEatable() {
        int newPosition = new Snake(10, 4).eat(10);
        assertEquals(4, newPosition);
    }

    @Test
    public void eatShouldReturnSamePositionIfNotEatable() {
        int newPosition = new Snake(9, 4).eat(10);
        assertEquals(10, newPosition);
    }
}