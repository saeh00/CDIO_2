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
                break;
            } else if (languageNumber == 2) {
                language.rulesLanguage(2);
                break;
            } else {
                System.out.println("Error no language chosen, try again");
                languageNumber = scanner.nextInt();
            }
        }

        language.runGame(languageNumber);

    }
}