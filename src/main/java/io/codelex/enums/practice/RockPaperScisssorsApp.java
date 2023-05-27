package io.codelex.enums.practice;

import java.util.Scanner;

public class RockPaperScisssorsApp {

    public enum Choice {
        ROCK("ROCK"),
        PAPER("PAPER"),
        SCISSORS("SCISSORS");

        private final String name;

        Choice(String name) {
            this.name = name;
        }
    }

    public static String computersChoice() {
        Choice[] choices = Choice.values();
        int random = (int) (Math.random() * choices.length);
        return choices[random].name;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME TO ROCK PAPER SCISSORS GAME! ");
        int gamesPlayed = 0;
        int playerWins = 0;
        int computerWins = 0;
        int gamesTie = 0;

        while (true) {

            System.out.println("Choice (R) for ROCK, (P) for PAPER, (S) for SCISSORS! ");
            String input = in.next();
            String playersChoice = input.toUpperCase();
            String finalPlayerChoice = "";
            String finalComputerChoice = computersChoice();

            if (playersChoice.matches("[qQ]")) {
                System.out.println("Player choice to quit! ");
                break;
            } else if (!playersChoice.matches("[SRP]")) {
                System.out.println("Invalid input, try again! ");
                break;
            }
            System.out.println("Computer choice " + finalComputerChoice);
            switch (playersChoice) {
                case "R" -> {
                    finalPlayerChoice = "ROCK";
                    System.out.println("Player choice " + finalPlayerChoice);
                }
                case "P" -> {
                    finalPlayerChoice = "PAPER";
                    System.out.println("Player choice " + finalPlayerChoice);
                }
                case "S" -> {
                    finalPlayerChoice = "SCISSORS";
                    System.out.println("Player choice " + finalPlayerChoice);
                }

            }
            if (finalPlayerChoice.matches(finalComputerChoice)) {
                gamesTie++;
                System.out.println("GAME IS TIE! Tie games " + gamesTie + "!");
            } else if (finalPlayerChoice.equals("ROCK") && finalComputerChoice.equals("SCISSORS")
                    || finalPlayerChoice.equals("SCISSORS") && finalComputerChoice.equals("PAPER")
                    || finalPlayerChoice.equals("PAPER") && finalComputerChoice.equals("ROCK")) {
                playerWins++;
                gamesPlayed++;
                System.out.println("PLAYER WINS!");
                System.out.println("Games played: " + gamesPlayed + ", Player won: "
                        + playerWins + ", Computer won: " + computerWins + "!");
            } else {
                computerWins++;
                gamesPlayed++;
                System.out.println("COMPUTERS WINS!");
                System.out.println("Games played: " + gamesPlayed + ", Player won: "
                        + playerWins + ", Computer won: " + computerWins + "!");
            }


        }
    }
}
