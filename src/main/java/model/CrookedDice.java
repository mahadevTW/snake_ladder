package model;

import java.util.Random;

public class CrookedDice implements Throwable {
    public int throw_() {
        int min = 0;
        int max = 6;
        return min + new Random().nextInt((max - min) / 2) * 2;
    }
}