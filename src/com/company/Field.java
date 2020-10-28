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
                System.out.println("Sikke en udsigt!"); // tilføjet disse strings
            }
            case 3 -> {
                fieldName = "Crater";
                coins = -100;
                System.out.println("Op igen, op igen!");
            }
            case 4 -> {
                fieldName = "Palace gates";
                coins = 100;
                System.out.println("Sesam, Sesam luk dig op!");
            }
            case 5 -> {
                fieldName = "Cold Desert";
                coins = -20;
                System.out.println("So cooold!");
            }
            case 6 -> {
                fieldName = "Walled city";
                coins = 180;
                System.out.println("Nyd det!, du er i sikkerhed");
            }
            case 7 -> {
                fieldName = "Monastery";
                coins = 0;
                System.out.println("Et kloster.");
            }
            case 8 -> {
                fieldName = "Black cave";
                coins = -70;
                System.out.println("Ikke lige det hyggeliste sted!");
            }
            case 9 -> {
                fieldName = "Huts in the mountain";
                coins = 60;
                System.out.println("All Nature!");
            }
            case 10 -> {
                fieldName = "The Werewall";
                coins = -80;
                System.out.println(" 'You Shall Not Pass!' ");
            }
            case 11 -> {
                fieldName = "The pit";
                coins = -50;
                System.out.println(" 'Daddy's home...' ");
            }
            case 12 -> {
                fieldName = "Goldmine";
                coins = 650;
                System.out.println(" 'Money in the Bank!' ");
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