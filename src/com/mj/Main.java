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
            Map<Player, List<Integer>> throwMap = new HashMap<>();

            round.setRoundNumber(i);

            for (Player player: playerList) {
                throwMap.put(player, playImpl.playDice());
            }
            round.setDiceThrowMap(throwMap);
            scoreTable.addRoundToList(round);
//            throwMap.clear();
        }
        for (Round r: scoreTable.getRoundList()) {
            System.out.println(r.getRoundNumber());
            System.out.println(r.getDiceThrowMap().toString());
        }

//        for (int i = 1; i <= 2; i++) {
//            int valueDiceOne = dice.diceRoll();
//            int valueDiceTwo = dice.diceRoll();
//
//            playerScore += valueDiceOne + valueDiceTwo;
//
//            System.out.println(valueDiceOne + " " + valueDiceTwo);
//        }
//        playerList.get(0).getScore().add(playerScore);
//
//        for (Integer score : playerList.get(0).getScore()) {
//            System.out.println("wynik: " + score);
//        }
    }
}
