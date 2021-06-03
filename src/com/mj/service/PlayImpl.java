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
            if (i == 1) {
                if (sumThrowDice == 7 || sumThrowDice == 11) {
                    return numbers;
                } else if (sumThrowDice == 1 || sumThrowDice == 12) {
                    numbers.add(48);
                    return numbers;
                }
            }

            if (sumThrowDice == 5) {
                return numbers;
            } else {
                numbers.add(sumThrowDice / i);
            }
        }
        return numbers;
    }

    private int diceThrow() {
        DiceImpl dice = new DiceImpl(6);
        return dice.diceRoll();
    }
}
