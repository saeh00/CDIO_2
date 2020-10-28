package com.company;

public class Field {

    Dice dice = new Dice();

    private String fieldName;
    private int coins;
    private String comment;

    public void field(int diceSum) {
        switch (diceSum) {
            case 2 -> {
                fieldName = ",  'Tower'";
                coins = 250;
                comment = "   sikke en udsigt! ...   ";
            }
            case 3 -> {
                fieldName = ",  'Crater'";
                coins = -100;
                comment = "   op igen, op igen! ...   ";
            }
            case 4 -> {
                fieldName = ",  'Palace gates'";
                coins = 100;
                comment = "   Sesam, Sesam luk dig op! ...   ";
            }
            case 5 -> {
                fieldName = ",  'Cold Desert'";
                coins = -20;
                comment = "   so cooold! ...   ";
            }
            case 6 -> {
                fieldName = ",  'Walled city'";
                coins = 180;
                comment = "   nyd det!, du er i sikkerhed ...   ";
            }
            case 7 -> {
                fieldName = ",  'Monastery'";
                coins = 0;
                comment = "   et kloster.   ";
            }
            case 8 -> {
                fieldName = ",  'Black cave'";
                coins = -70;
                comment = "   ikke lige det hyggeligste sted ...   ";
            }
            case 9 -> {
                fieldName = ",  'Huts in the mountain'";
                coins = 60;
                comment = "   all nature ...   ";
            }
            case 10 -> {
                fieldName = ",  'The Werewall'";
                coins = -80;
                comment = "   'You shall not pass!'   ";
            }
            case 11 -> {
                fieldName = ",  'The pit'";
                coins = -50;
                comment = "   daddy's home ...   ";
            }
            case 12 -> {
                fieldName = ",  'Goldmine'";
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