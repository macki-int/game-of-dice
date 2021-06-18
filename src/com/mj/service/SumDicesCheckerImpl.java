package com.mj.service;

public class SumDicesCheckerImpl implements SumDicesChecker {
    private int sumThrowDice;

    public int getSumThrowDice() {
        return sumThrowDice;
    }

    //return boolean
    @Override
    public boolean check(int sum, int tour) {
        if (tour == 1) {
            if (sum == 7 || sum == 11) {
                sumThrowDice = sum;
                return true;
            } else if (sum == 1 || sum == 12) {
                sumThrowDice = sum + 48;
                return true;
            }
        }

        if (sum == 5) {
            sumThrowDice = sum;
            return true;
        } else {
            sumThrowDice = sum + (sum / tour);
            return false;
        }
    }
}
