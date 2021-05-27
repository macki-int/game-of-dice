package com.mj.model;

import java.util.List;
import java.util.Map;

public class Round {
    private int roundNumber;
    private Map<Player, List<Integer>> diceThrowMap;

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public Map<Player, List<Integer>> getDiceThrowMap() {
        return diceThrowMap;
    }

    public void setDiceThrowMap(Map<Player, List<Integer>> diceThrowMap) {
        this.diceThrowMap = diceThrowMap;
    }
}
