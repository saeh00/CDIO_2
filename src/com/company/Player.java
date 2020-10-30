package com.company;

public class Player {

    private final String playerName;
    /*
        private final int[] playerDice = new int[2];
    */
    private int playerCoins = 1000;

    public Player(String name){
        playerName = name;
    }

    public String getPlayerName() {
        return playerName;
    }
    /*
        public int[] getPlayerDice() {
            return playerDice;
        }
    */
    public int getPlayerCoins() {
        return playerCoins;
    }

    public void addPlayerCoins(int playerPoints) {
        this.playerCoins += playerPoints;
        if (playerCoins < 0) {
            playerCoins = 0;
        }
    }
}