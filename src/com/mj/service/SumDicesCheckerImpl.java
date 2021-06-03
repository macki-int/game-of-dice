package com.mj.service;

public class SumDicesCheckerImpl implements SumDicesChecker {
    @Override
    public int check(int sumThrowDice, int i) {
        if (i == 1) {
            if (sumThrowDice == 7 || sumThrowDice == 11) {
                return sumThrowDice;
            } else if (sumThrowDice == 1 || sumThrowDice == 12) {
                return sumThrowDice + 48;
            }
        }

        if (sumThrowDice == 5) {
            return sumThrowDice;
        }
        return sumThrowDice + (sumThrowDice / i);
    }
}
