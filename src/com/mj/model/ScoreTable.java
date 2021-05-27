package com.mj.model;

import java.util.ArrayList;
import java.util.List;

public class ScoreTable {
    private List<Round> roundList;

    public ScoreTable() {
        this.roundList = new ArrayList<>();
    }

    public List<Round> getRoundList() {
        return roundList;
    }

    public void addRoundToList(Round round) {
        roundList.add(round);
    }
}
