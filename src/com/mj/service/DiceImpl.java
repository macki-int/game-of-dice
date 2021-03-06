package com.mj.service;


import java.util.Random;

public class DiceImpl implements Dice {
    private int maxPoint;

    public DiceImpl(int maxPoint) {
        this.maxPoint = maxPoint;
    }

    @Override
    public int diceRoll() {
        Random random = new Random();
        return random.nextInt(maxPoint) + 1;
    }
}
