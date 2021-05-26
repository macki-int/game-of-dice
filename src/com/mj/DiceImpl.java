package com.mj;

import java.util.Random;

public class DiceImpl implements Dice{
    @Override
    public int rollADice(int point) {
        Random random = new Random();
        return  random.nextInt(point)+1;
    }
}
