package com.company;

public class Field {

    Dice dice = new Dice();

    private String fieldName;
    private int coins;
    private String comment;

    public void field(int diceSum) {
        switch (diceSum) {
            case 2 -> {
                fieldName = " altså: Tower";
                coins = 250;
                comment = "   sikke en udsigt! ...   ";
            }
            case 3 -> {
                fieldName = " altså: Crater";
                coins = -100;
                comment = "   op igen, op igen! ...   ";
            }
            case 4 -> {
                fieldName = " altså: Palace gates";
                coins = 100;
                comment = "   Sesam, Sesam luk dig op! ...   ";
            }
            case 5 -> {
                fieldName = " altså: Cold Desert";
                coins = -20;
                comment = "   so cooold! ...   ";
            }
            case 6 -> {
                fieldName = " altså: Walled city";
                coins = 180;
                comment = "   nyd det!, du er i sikkerhed ...   ";
            }
            case 7 -> {
                fieldName = " altså: Monastery";
                coins = 0;
                comment = "   et kloster.   ";
            }
            case 8 -> {
                fieldName = " altså: Black cave";
                coins = -70;
                comment = "   ikke lige det hyggeligste sted ...   ";
            }
            case 9 -> {
                fieldName = " altså: Huts in the mountain";
                coins = 60;
                comment = "   all nature ...   ";
            }
            case 10 -> {
                fieldName = " altså: The Werewall";
                coins = -80;
                comment = "   'You shall not pass!'   ";
            }
            case 11 -> {
                fieldName = " altså: The pit";
                coins = -50;
                comment = "   daddy's home ...   ";
            }
            case 12 -> {
                fieldName = " altså: Goldmine";
                coins = 650;
                comment = "   Juhuu! Money in the bank!   ";
            }
        }

    }

    public String getFieldName() {
        return fieldName;
    }

    public int getCoins() {
        return coins;
    }

    public String getComment() { return comment; }
}