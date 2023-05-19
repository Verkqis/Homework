package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private static final String[] WORDS = {
            "achieve", "standard", "economic", "pilot", "arena",
            "manager", "slime", "treasurer", "heat", "notion",
            "advertise", "pneumonia", "anger", "so", "fortune",
            "mess", "dive", "reconcile", "fee", "consideration",
            "glass", "payment", "inspiration", "ivory", "spend",
            "steak", "clean", "picture", "captivate", "year",
            "replacement", "wealth", "install", "academy", "chin",
            "pit", "interactive", "interference", "presidential", "tumour",
            "moon", "polite", "ferry", "adventure", "temporary",
            "application", "material", "wound", "sniff", "notebook"
    };

    private static final int MAX_TRIES = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman Game!");

        String word = getRandomWord();
        char[] wordLetters = word.toCharArray();
        char[] guessedLetters = new char[word.length()];
        Arrays.fill(guessedLetters, '_');

        int remainingTries = MAX_TRIES;
        StringBuilder misses = new StringBuilder();

        while (remainingTries > 0) {
            displayGameState(guessedLetters, misses.toString(), remainingTries);

            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            boolean letterGuessed = false;

            for (int i = 0; i < word.length(); i++) {
                if (wordLetters[i] == guess) {
                    guessedLetters[i] = guess;
                    letterGuessed = true;
                }
            }
            
            if (!letterGuessed) {
                misses.append(guess);
                remainingTries--;
            }

            if (Arrays.equals(wordLetters, guessedLetters)) {
                displayGameState(guessedLetters, misses.toString(), remainingTries);
                System.out.println("YOU GOT IT!");
                break;
            }
        }

        if (remainingTries == 0) {
            System.out.println("Out of tries! The word was: " + word);
        }

        System.out.println("Thank you for playing Hangman Game!");
    }

    private static String getRandomWord() {
        Random random = new Random();
        int randomIndex = random.nextInt(WORDS.length);
        return WORDS[randomIndex];
    }

    private static void displayGameState(char[] guessedLetters, String misses, int remainingTries) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Word: " + new String(guessedLetters));
        System.out.println("Misses: " + misses);
        System.out.println("Remaining tries: " + remainingTries);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}




