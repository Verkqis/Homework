package io.codelex.travia;

import java.net.MalformedURLException;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Trivia {

    public static void main(String[] args) throws MalformedURLException {

        Scanner input = new Scanner(System.in);
        AtomicBoolean gameRunning = new AtomicBoolean(true);
        FormattingService gameQuestions = new FormattingService();
        LinkedHashMap<Integer, String> game = new LinkedHashMap<>(gameQuestions.formattingService());

        System.out.println("Welcome to Trivia!!! ");
        System.out.println("There are 20 questions you need to answer to win the game! ");
        System.out.println("If you will have wrong answer game will end! \n");

        AtomicInteger skipper = new AtomicInteger(0);
        AtomicInteger winedGames = new AtomicInteger(0);


        while (gameRunning.get()) {
            game.entrySet().stream()
                    .skip(skipper.get())
                    .findFirst()
                    .ifPresent(entry -> {
                        Integer key = entry.getKey();
                        String value = entry.getValue();
                        System.out.println(value);
                        System.out.println("Possible right answers: ");
                        List<Integer> answers = new ArrayList<>();
                        answers.add(key);
                        int minPercents = 10;
                        int maxPercents = 60;
                        int randomPercents = (int) (Math.random() * (maxPercents - minPercents + 1)) + minPercents;
                        int lowerLimit = (int) (key * randomPercents / 100.0);
                        int upperLimit = (int) (key * 0.60);
                        int randomValue = lowerLimit + (int) (Math.random() * (upperLimit - lowerLimit + 1));
                        answers.add(key / randomValue);
                        answers.add(key * randomValue);
                        answers.add(key + randomValue);
                        Collections.shuffle(answers);
                        for (Integer answer : answers) {
                            System.out.println(answer);
                        }
                        System.out.println("Write correct answer above:");
                        Integer answer = input.nextInt();
                        if (answer.equals(key)) {
                            skipper.incrementAndGet();
                            winedGames.incrementAndGet();
                            System.out.println("Answer is correct, lets get to the next question!");
                        } else if (winedGames.equals(20)) {
                            System.out.println("YOU ANSWERED RIGHT ON ALL QUESTIONS!!!");
                            System.out.println("CONGRATULATIONS");
                        } else {
                            System.out.println("Game is over!!! ");
                            System.out.println("You answered right on " + winedGames + " questions. ");
                            System.out.println("Last correct answer was on question - " + value);
                            gameRunning.set(false);
                        }
                    });
        }
    }
}


