package com.company;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice();
        Field fields = new Field();
        Language language = new Language();

        String pressEnter;

        language.languageChooser();

        int languageNumber = scanner.nextInt();

        while (languageNumber != 1 || languageNumber != 2) {
            if (languageNumber == 1) {
                language.rulesLanguage(1);
            } else if (languageNumber == 2) {
                language.rulesLanguage(2);
            } else {
                System.out.println("Error no language chosen, try again");
                languageNumber = scanner.nextInt();
            }
        }

        Player p1 = new Player(language.getP1Name());
        Player p2 = new Player(language.getP2Name());

        int turn = 0;
        while (p1.getPlayerCoins() < 3000 || p2.getPlayerCoins() < 3000) {

            switch (turn) {

                case 0:
                    if (p2.getPlayerCoins() >= 3000) {
                        language.gameWonP2Language(languageNumber);
                        return;
                    }
                    System.out.println(p1.getPlayerName() + " skal nu trykke på enter, for at kaste terningerne");
                    pressEnter = scanner.nextLine();

                    dice.rollDice();
                    System.out.println(p1.getPlayerName() + " slår " + dice.firstDice() + " og " + dice.secondDice());
                    System.out.println("Sum: " + dice.getSum());
                    System.out.println("");
                    fields.field(dice.getSum());
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
                        language.gameWonP1Language(languageNumber);
                        return;
                    }
                    System.out.println(p2.getPlayerName() + " skal nu trykke på enter, for at kaste terningerne");
                    pressEnter = scanner.nextLine();

                    dice.rollDice();
                    System.out.println(p2.getPlayerName() + " slår " + dice.firstDice() + " og " + dice.secondDice());
                    System.out.println("Sum: " + dice.getSum());
                    System.out.println("");
                    fields.field(dice.getSum());
                    if (fields.getFieldName() == ",  'The Werewall'") {
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
    }
}