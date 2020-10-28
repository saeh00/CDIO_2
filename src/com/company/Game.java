package com.company;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dice dice = new Dice();

        Field fields = new Field();

        System.out.println("Hvad er navnet på spiller 1?");
        Player p1 = new Player(scanner.nextLine());

        System.out.println("Og hvad er navnet på spiller 2?");
        Player p2 = new Player(scanner.nextLine());

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

        int turn = 0;
        while (p1.getPlayerCoins() < 3000 || p2.getPlayerCoins() < 3000) {

            switch (turn) {

                case 0:
                    if (p2.getPlayerCoins() >= 3000) {
                        System.out.println(p2.getPlayerName() + " har vundet spillet!");
                        System.out.println("Tillykke :-)");
                        return;
                    }

                    dice.rollDice();
                    System.out.println(p1.getPlayerName() + " slår " + dice.firstDice() + " og " + dice.secondDice());
                    System.out.println("Sum: " + dice.getSum());
                    System.out.println("");
                    fields.field(dice.getSum());
                    System.out.println(p1.getPlayerName() + " lander altså på felt nummer " + dice.getSum() + fields.getFieldName());
                    System.out.println("");
                    System.out.println(fields.getComment());
                    System.out.println("");
                    p1.addPlayerCoins(fields.getCoins());
                    System.out.println("Du har nu " + p1.getPlayerCoins());
                    System.out.println("");
                    System.out.println("");
                    System.out.println(p2.getPlayerName() + " skal nu trykke på enter, for at kaste terningerne");
                    pressEnter = scanner.nextLine();
                    turn = 1;
                    break;

                case 1:
                    if (p1.getPlayerCoins() >= 3000) {
                        System.out.println(p1.getPlayerName() + " har vundet spillet!");
                        System.out.println("Tillykke :-)");
                        return;
                    }

                    dice.rollDice();
                    System.out.println(p2.getPlayerName() + " slår " + dice.firstDice() + " og " + dice.secondDice());
                    System.out.println("Sum: " + dice.getSum());
                    System.out.println("");
                    fields.field(dice.getSum());
                    System.out.println(p2.getPlayerName() + " lander altså på felt nummer " + dice.getSum() + fields.getFieldName());
                    System.out.println("");
                    System.out.println(fields.getComment());
                    System.out.println("");
                    p2.addPlayerCoins(fields.getCoins());
                    System.out.println("Du har nu " + p2.getPlayerCoins());
                    System.out.println("");
                    System.out.println("");
                    System.out.println(p1.getPlayerName() + " skal nu trykke på enter, for at kaste terningerne");
                    pressEnter = scanner.nextLine();
                    turn = 0;
                    break;

            }
        }
    }
}



