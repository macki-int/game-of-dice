package com.mj;

import com.mj.model.Player;
import com.mj.model.Round;
import com.mj.model.ScoreTable;
import com.mj.service.Play;
import com.mj.service.PlayImpl;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player("pierwszy"));
        playerList.add(new Player("drugi"));

        ScoreTable scoreTable = new ScoreTable();
        Play playImpl = new PlayImpl();

        for (int i = 1; i <= 5; i++) {
            Round round = new Round();
            round.setRoundNumber(i);

            Map<Player, List<Integer>> diceThrowOneRoundResultMap = new HashMap<>();

            for (int j = 0; j < playerList.size(); j++) {
                List<Integer> playResultList = playImpl.playDice();
                diceThrowOneRoundResultMap.put(playerList.get(j), playResultList);
            }

            round.setDiceThrowMap(diceThrowOneRoundResultMap);
            scoreTable.addRoundToList(round);
        }


        for (Round r : scoreTable.getRoundList()) {
//            int idx = r.getDiceThrowMap().size();

            System.out.println(r.getRoundNumber() + " " + r.getDiceThrowMap());
//            for (int i = 0; i < idx; i++) {
//                int i1 = i;
//                r.getDiceThrowMap().keySet()
//                        .stream()
//                        .filter(player -> player.equals(playerList.get(i1)))
//                        .forEach(player -> System.out.println(player.getName()));
//                System.out.println("----------");


//                r.getDiceThrowMap().keySet().forEach(player -> System.out.println(player.getName()));
//                System.out.println(r.getDiceThrowMap().get(playerList.get(i)));

            //                r.getDiceThrowMap().forEach((player, integers) -> {
//                    System.out.println(player.getName() + " " + integers);
//                });
//            }
        }
    }
}
