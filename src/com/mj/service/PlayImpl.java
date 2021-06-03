package com.mj.service;

import java.util.ArrayList;
import java.util.List;

public class PlayImpl implements Play {

    @Override
    public List<Integer> playDice() {
        List<Integer> numbers = new ArrayList<>();

        int sumThrowDice = 0;
        for (int i = 1; i <= 10; i++) {
            sumThrowDice = diceThrow();
            sumThrowDice += diceThrow();
            numbers.add(sumThrowDice);
        }
        return numbers;
    }

    private int diceThrow() {
        DiceImpl dice = new DiceImpl(6);
        return dice.diceRoll();
    }
}
