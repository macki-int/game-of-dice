package com.mj;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player("pierwszy"));
        playerList.add(new Player("drugi"));

        //five tours
        for (int i = 1; i <= 5; i++) {

        }

        DiceImpl dice = new DiceImpl();
        int playerScore = 0;

        for (int i = 1; i <= 2; i++) {
            int valueDiceOne = dice.rollADice(6);
            int valueDiceTwo = dice.rollADice(6);

            playerScore += valueDiceOne + valueDiceTwo;

            System.out.println(valueDiceOne + " " + valueDiceTwo);
        }
        playerList.get(0).getScore().add(playerScore);

        for (Integer score : playerList.get(0).getScore()) {
            System.out.println("wynik: " + score);
        }
    }
}
