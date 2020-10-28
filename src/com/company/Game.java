package com.company;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dice dice = new Dice();

        Field fields = new Field();

        System.out.println("What is player 1's name?");
        Player p1 = new Player(scanner.nextLine());

        System.out.println("What is player 2's name?");
        Player p2 = new Player(scanner.nextLine());

        System.out.println("");
        System.out.println("Welcome to the game " + p1.getPlayerName() + " and " + p2.getPlayerName());
        System.out.println("");

        System.out.println("  2. Tower                +\t250");
        System.out.println("  3. Crater               -\t100");
        System.out.println("  4. Palace Gates         +\t100");
        System.out.println("  5. Cold Desert          -\t20");
        System.out.println("  6. Walled city          +\t180");
        System.out.println("  7. Monastery             \t0");
        System.out.println("  8. Black cave           -\t70");
        System.out.println("  9. Huts in the mountain +\t60 + extra turn");
        System.out.println("  10.The Werewall         -\t80");
        System.out.println("  11. The pit             -\t50");
        System.out.println("  12. Goldmine            +\t650");

        System.out.println("");
        System.out.println("The first player to reach 3000 coins wins the game!");
        System.out.println("Press enter to start the game");
        String pressEnter = scanner.nextLine();

        int turn = 0;
        while (p1.getPlayerCoins() < 3000 || p2.getPlayerCoins() < 3000) {

            switch (turn) {

                case 0:
                    if (p2.getPlayerCoins() >= 3000) {
                        System.out.println(p2.getPlayerName() + " has won the game");
                        return;
                    }

                    dice.rollDice();
                    System.out.println(p1.getPlayerName() + " rolled " + dice.firstDice() + " and " + dice.secondDice());
                    System.out.println(p1.getPlayerName() + " now has " + dice.getSum());
                    fields.field(dice.getSum());
                    System.out.println(p1.getPlayerName() + " has landed on " + fields.getFieldName());
                    p1.addPlayerCoins(fields.getCoins());
                    System.out.println(p1.getPlayerName() + " now has " + p1.getPlayerCoins());

                    System.out.println("press enter");
                    pressEnter = scanner.nextLine();
                    turn = 1;
                    break;

                case 1:
                    if (p1.getPlayerCoins() >= 3000) {
                        System.out.println(p1.getPlayerName() + " has won the game");
                        return;
                    }

                    dice.rollDice();
                    System.out.println(p2.getPlayerName() + " rolled " + dice.firstDice() + " and " + dice.secondDice());
                    System.out.println(p2.getPlayerName() + " now has " + dice.getSum());
                    fields.field(dice.getSum());
                    System.out.println(p2.getPlayerName() + " has landed on " + fields.getFieldName());
                    p2.addPlayerCoins(fields.getCoins());
                    System.out.println(p2.getPlayerName() + " now has " + p2.getPlayerCoins());

                    turn = 0;
                    System.out.println("press enter");
                    pressEnter = scanner.nextLine();;
                    break;
            }
        }
    }
}



