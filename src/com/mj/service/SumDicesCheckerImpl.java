package com.mj.service;

public class SumDicesCheckerImpl implements SumDicesChecker {
    private int sumThrowDice;
    private boolean finishTour;

    public int getSumThrowDice() {
        return sumThrowDice;
    }

    public boolean isFinishTour() {
        return finishTour;
    }

    @Override
    public void check(int sum, int tour) {
//TODO: odwrotnie warunek if - najpierw ilość oczek, potem tura
        if (tour == 1) {
            if (sum == 7 || sum == 11) {
                sumThrowDice = sum;
                finishTour = true;
            } else if (sum == 1 || sum == 12) {
                sumThrowDice = sum + 48;
                finishTour = true;
            }
        } else {
            if (sum == 5) {
                sumThrowDice = sum;
                finishTour = true;
            } else {
                sumThrowDice = sum + (sum / tour);
                finishTour = false;
            }
        }
    }
}
