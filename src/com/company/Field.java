package com.company;

public class Field {

    Dice dice = new Dice();

    private String fieldName;
    private int coins;

    public void field(int diceSum) {
        switch (diceSum) {
            case 2 -> {
                fieldName = "Tower";
                coins = 250;
            }
            case 3 -> {
                fieldName = "Crater";
                coins = -100;
            }
            case 4 -> {
                fieldName = "Palace gates";
                coins = 100;
            }
            case 5 -> {
                fieldName = "Cold Desert";
                coins = -20;
            }
            case 6 -> {
                fieldName = "Walled city";
                coins = 180;
            }
            case 7 -> {
                fieldName = "Monastery";
                coins = 0;
            }
            case 8 -> {
                fieldName = "Black cave";
                coins = -70;
            }
            case 9 -> {
                fieldName = "Huts in the mountain";
                coins = 60;
            }
            case 10 -> {
                fieldName = "The Werewall";
                coins = -80;
            }
            case 11 -> {
                fieldName = "The pit";
                coins = -50;
            }
            case 12 -> {
                fieldName = "Goldmine";
                coins = 650;
            }
        }

    }

    public String getFieldName() {
        return fieldName;
    }

    public int getCoins() {
        return coins;
    }
}