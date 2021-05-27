package com.mj.model;

import java.util.List;

public class ScoreTable {
    private List<Round> roundList;

    public List<Round> getRoundList() {
        return roundList;
    }

    public void addRoundToList(Round round) {
        roundList.add(round);
    }
}
