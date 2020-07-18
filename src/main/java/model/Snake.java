package model;

public class Snake {
    private int head;
    private int tail;

    public Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }

    public boolean canEatAt(int position) {
        return position == head;
    }

    public int eat(int position) {
        if (!canEatAt(position)) {
            return position;
        }
        return tail;
    }
}
