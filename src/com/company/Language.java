package com.company;

import java.util.Scanner;

public class Language {

    Scanner scanner = new Scanner(System.in);
    Dice dice = new Dice();
    Field fields = new Field();

    private String p1Name;
    private String p2Name;
    private String pressEnter;

    public void languageChooser() {
        System.out.println("Choose language");
        System.out.println("");
        System.out.println("1. Tryk 1 for Dansk");
        System.out.println("2. Press 2 for English");
    }

    public void rulesLanguage(int languageNumber) {
        switch (languageNumber) {
            case 1:
                System.out.println("Hvad er navnet på spiller 1?");
                Player p1 = new Player(scanner.nextLine());

                System.out.println("Og hvad er navnet på spiller 2?");
                Player p2 = new Player(scanner.nextLine());

                p1Name = p1.getPlayerName();
                p2Name = p2.getPlayerName();

                System.out.println("");
                System.out.println("Velkommen til Crazy Game " + p1.getPlayerName() + " og " + p2.getPlayerName());
                System.out.println("");
                System.out.println("Tryk enter for at forsætte");
                String pressEnter = scanner.nextLine();
                System.out.println("");
                System.out.println("Spillets regler er således: ");
                System.out.println("");
                System.out.println("Alt afhængig af hvad du slår med terningerne, lander du på et felt");
                System.out.println("");
                System.out.println("Og hvert felt udløser et beløb til din pengebeholdning");
                System.out.println("");
                System.out.println("MEN - det kan også være et negativt beløb!");
                System.out.println("");
                System.out.println("Tryk på enter for at se værdierne");
                pressEnter = scanner.nextLine();
                System.out.println("");
                System.out.println("    Terningværdi: 2    Felt: Tower                 Pengebeholdning: +\t250");
                System.out.println("    Terningværdi: 3    Felt: Crater                Pengebeholdning: -\t100");
                System.out.println("    Terningværdi: 4    Felt: Palace Gates          Pengebeholdning: +\t100");
                System.out.println("    Terningværdi: 5    Felt: Cold Desert           Pengebeholdning: -\t20");
                System.out.println("    Terningværdi: 6    Felt: Walled city           Pengebeholdning: +\t180");
                System.out.println("    Terningværdi: 7    Felt: Monastery             Pengebeholdning:  \t0");
                System.out.println("    Terningværdi: 8    Felt: Black cave            Pengebeholdning: -\t70");
                System.out.println("    Terningværdi: 9    Felt: Huts in the mountain  Pengebeholdning: +\t60");
                System.out.println("    Terningværdi: 10   Felt: The Werewall          Pengebeholdning: -\t80 + ekstra tur");
                System.out.println("    Terningværdi: 11   Felt: The pit               Pengebeholdning: -\t50");
                System.out.println("    Terningværdi: 12   Felt: Goldmine              Pengebeholdning: +\t650");

                System.out.println("");
                System.out.println("Den første spiller som får 3000 i pengebeholdningen, vinder spillet!");
                System.out.println("");
                System.out.println("Tryk på enter for at starte spillet, med første kast til " + p1.getPlayerName());
                pressEnter = scanner.nextLine();
                System.out.println("");

                break;
            case 2:
                System.out.println("What is player 1's name?");
                p1 = new Player(scanner.nextLine());

                System.out.println("What is player 2's name?");
                p2 = new Player(scanner.nextLine());

                p1Name = p1.getPlayerName();
                p2Name = p2.getPlayerName();

                System.out.println("");
                System.out.println("Welcome to the Crazy Game " + p1.getPlayerName() + " and " + p2.getPlayerName());
                System.out.println("");
                System.out.println("Press enter to continue");
                pressEnter = scanner.nextLine();
                System.out.println("");
                System.out.println("The rules of the game are as follows: ");
                System.out.println("");
                System.out.println("Depending on your dice roll, you will land on a specific field");
                System.out.println("");
                System.out.println("And every field triggers a sum of coins that gets added yo your account");
                System.out.println("");
                System.out.println("BUUUT - It could also be a negative amount of coins");
                System.out.println("");
                System.out.println("Press enter to see the field values");
                pressEnter = scanner.nextLine();
                System.out.println("");
                System.out.println("    Dice value: 2    Felt: Tower                 Coin sum: +\t250");
                System.out.println("    Dice value: 3    Felt: Crater                Coin sum: -\t100");
                System.out.println("    Dice value: 4    Felt: Palace Gates          Coin sum: +\t100");
                System.out.println("    Dice value: 5    Felt: Cold Desert           Coin sum: -\t20");
                System.out.println("    Dice value: 6    Felt: Walled city           Coin sum: +\t180");
                System.out.println("    Dice value: 7    Felt: Monastery             Coin sum:  \t0");
                System.out.println("    Dice value: 8    Felt: Black cave            Coin sum: -\t70");
                System.out.println("    Dice value: 9    Felt: Huts in the mountain  Coin sum: +\t60");
                System.out.println("    Dice value: 10   Felt: The Werewall          Coin sum: -\t80 + extra turn");
                System.out.println("    Dice value: 11   Felt: The pit               Coin sum: -\t50");
                System.out.println("    Dice value: 12   Felt: Goldmine              Coin sum: +\t650");

                System.out.println("");
                System.out.println("The first player that reaches 3000 coins, wins the game!");
                System.out.println("");
                System.out.println("Press enter to start the game " + p1.getPlayerName() + " gets to start");
                pressEnter = scanner.nextLine();
                System.out.println("");

                break;
        }
    }

    public String getP1Name() {
        return p1Name;
    }

    public String getP2Name() {
        return p2Name;
    }

    public void gameWonP1Language(int languageNumber) {
        switch (languageNumber) {
            case 1:
                System.out.println(getP1Name() + " har vundet spillet!");
                System.out.println("Tillykke :-)");
                break;
            case 2:
                System.out.println(getP1Name() + " has won the game!");
                System.out.println("Congratulations :-)");

        }
    }

    public void gameWonP2Language(int languageNumber) {
        switch (languageNumber) {
            case 1:
                System.out.println(getP2Name() + " har vundet spillet!");
                System.out.println("Tillykke :-)");
                break;
            case 2:
                System.out.println(getP2Name() + " has won the game!");
                System.out.println("Congratulations :-)");

        }
    }

    public void runGame(int languageNumber) {
        Player p1 = new Player(getP1Name());
        Player p2 = new Player(getP2Name());
        int turn = 0;
        if (languageNumber == 1) {
            while (p1.getPlayerCoins() < 3000 || p2.getPlayerCoins() < 3000) {
                switch (turn) {
                    case 0:
                        if (p2.getPlayerCoins() >= 3000) {
                            gameWonP2Language(2);
                            return;
                        }

                        System.out.println(p1.getPlayerName() + " skal nu trykke på enter, for at kaste terningerne");
                        pressEnter = scanner.nextLine();

                        dice.rollDice();
                        System.out.println(p1.getPlayerName() + " slår " + dice.firstDice() + " og " + dice.secondDice());
                        System.out.println("Sum: " + dice.getSum());
                        System.out.println("");
                        fields.field(dice.getSum());
                        turn = 1;
                        if (fields.getFieldName().equals(",  'The Werewall'")) {
                            turn = 0;
                            System.out.println(p1.getPlayerName() + " lander altså på felt nummer " + dice.getSum()
                                    + fields.getFieldName() + " og får " + fields.getCoins() + " mønter" + " men en ekstra tur ;)");
                        } else {
                            turn = 1;
                            System.out.println(p1.getPlayerName() + " lander altså på felt nummer " + dice.getSum()
                                    + fields.getFieldName() + " og får " + fields.getCoins() + " mønter");
                        }
                        System.out.println("");
                        System.out.println(fields.getComment());
                        System.out.println("");
                        p1.addPlayerCoins(fields.getCoins());
                        System.out.println("Du har nu " + p1.getPlayerCoins());
                        System.out.println("");
                        System.out.println("");
                        break;

                    case 1:
                        if (p1.getPlayerCoins() >= 3000) {
                            gameWonP2Language(2);
                            return;
                        }

                        System.out.println(p2.getPlayerName() + " skal nu trykke på enter, for at kaste terningerne");
                        pressEnter = scanner.nextLine();

                        dice.rollDice();
                        System.out.println(p2.getPlayerName() + " slår " + dice.firstDice() + " og " + dice.secondDice());
                        System.out.println("Sum: " + dice.getSum());
                        System.out.println("");
                        fields.field(dice.getSum());
                        turn = 0;
                        if (fields.getFieldName().equals(",  'The Werewall'")) {
                            turn = 1;
                            System.out.println(p2.getPlayerName() + " lander altså på felt nummer " + dice.getSum()
                                    + fields.getFieldName() + " og får " + fields.getCoins() + " mønter" + " men en ekstra tur ;)");
                        } else {
                            turn = 0;
                            System.out.println(p2.getPlayerName() + " lander altså på felt nummer " + dice.getSum()
                                    + fields.getFieldName() + " og får " + fields.getCoins() + " mønter");
                        }
                        System.out.println("");
                        System.out.println(fields.getComment());
                        System.out.println("");
                        p2.addPlayerCoins(fields.getCoins());
                        System.out.println("Du har nu " + p2.getPlayerCoins());
                        System.out.println("");
                        System.out.println("");
                        break;
                }
            }
        } else if (languageNumber == 2) {
            while (p1.getPlayerCoins() < 3000 || p2.getPlayerCoins() < 3000) {

                switch (turn) {
                    case 0:
                        if (p2.getPlayerCoins() >= 3000) {
                            gameWonP2Language(2);
                            return;
                        }
                        System.out.println(p1.getPlayerName() + " please press enter to through the dice");
                        pressEnter = scanner.nextLine();

                        dice.rollDice();
                        System.out.println(p1.getPlayerName() + " threw a " + dice.firstDice() + " and a " + dice.secondDice());
                        System.out.println("Sum: " + dice.getSum());
                        System.out.println("");
                        fields.field(dice.getSum());
                        turn = 1;
                        if (fields.getFieldName().equals(",  'The Werewall'")) {
                            turn = 0;
                            System.out.println(p1.getPlayerName() + " lands on field number " + dice.getSum()
                                    + fields.getFieldName() + " and gets " + fields.getCoins() + " coins" + " but also an extra turn ;)");
                        } else {
                            turn = 1;
                            System.out.println(p1.getPlayerName() + " lands on field number " + dice.getSum()
                                    + fields.getFieldName() + " and gets " + fields.getCoins() + " coins");
                        }
                        System.out.println("");
                        System.out.println(fields.getComment());
                        System.out.println("");
                        p1.addPlayerCoins(fields.getCoins());
                        System.out.println("You now have " + p1.getPlayerCoins());
                        System.out.println("");
                        System.out.println("");

                        break;
                    case 1:

                        if (p1.getPlayerCoins() >= 3000) {
                            gameWonP2Language(2);
                            return;
                        }
                        System.out.println(p2.getPlayerName() + " please press enter to through the dice");
                        pressEnter = scanner.nextLine();

                        dice.rollDice();
                        System.out.println(p2.getPlayerName() + " threw a " + dice.firstDice() + " and a " + dice.secondDice());
                        System.out.println("Sum: " + dice.getSum());
                        System.out.println("");
                        fields.field(dice.getSum());
                        turn = 0;
                        if (fields.getFieldName().equals(",  'The Werewall'")) {
                            turn = 1;
                            System.out.println(p2.getPlayerName() + " lands on field number " + dice.getSum()
                                    + fields.getFieldName() + " and gets " + fields.getCoins() + " coins" + " but also an extra turn ;)");
                        } else {
                            turn = 0;
                            System.out.println(p2.getPlayerName() + " lands on field number " + dice.getSum()
                                    + fields.getFieldName() + " og gets " + fields.getCoins() + " coins");
                        }
                        System.out.println("");
                        System.out.println(fields.getComment());
                        System.out.println("");
                        p2.addPlayerCoins(fields.getCoins());
                        System.out.println("You now have " + p2.getPlayerCoins());
                        System.out.println("");
                        System.out.println("");
                        break;
                }
            }
        }
    }
}