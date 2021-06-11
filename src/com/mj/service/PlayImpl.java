package com.mj.service;

import java.util.ArrayList;
import java.util.List;

public class PlayImpl implements Play {

    @Override
    public List<Integer> playDice() {
        List<Integer> numbers = new ArrayList<>();

        SumDicesCheckerImpl sumDicesChecker = new SumDicesCheckerImpl();

        int sumThrowDice = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <2 ; j++) {
                sumThrowDice += diceThrow();
            }
            boolean finishTour = sumDicesChecker.check(sumThrowDice, i);

            if(finishTour) {
                numbers.add(sumDicesChecker.getSumThrowDice());
                return numbers;
            }
            numbers.add(sumDicesChecker.getSumThrowDice());
        }
        return numbers;
    }

    private int diceThrow() {
        DiceImpl dice = new DiceImpl(6);
        return dice.diceRoll();
    }
}
