package com.mj.service;

import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int rollDice(int point) {
        Random random = new Random();
        return  random.nextInt(point)+1;
    }
}
