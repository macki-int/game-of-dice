package com.mj;

import com.mj.model.Player;
import com.mj.model.Round;
import com.mj.model.ScoreTable;
import com.mj.service.PlayImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player("pierwszy"));
        playerList.add(new Player("drugi"));

        ScoreTable scoreTable = new ScoreTable();
        PlayImpl playImpl = new PlayImpl();


        for (int i = 1; i <= 5; i++) {
            Round round = new Round();

            Map<Player, List<Integer>> diceThrowMap = new HashMap<>();


            round.setRoundNumber(i);

            for (Player player: playerList) {
                diceThrowMap.put(player, playImpl.playDice());
            }

            round.setDiceThrowMap(diceThrowMap);
            scoreTable.addRoundToList(round);
        }


        for (Round r: scoreTable.getRoundList()) {
            System.out.println(r.getRoundNumber() + " " + r.getDiceThrowMap());
        }
    }
}
