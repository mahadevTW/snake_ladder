package model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public int throw_() {
        int min = 1;
        int max = 6;
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
