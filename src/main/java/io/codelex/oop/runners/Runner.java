package io.codelex.oop.runners;

public enum Runner {

    BEGINNER(90, 120),
    INTERMEDIATE(60, 90),
    ADVANCED(45, 60);

    private final int minTimeRunningMarathonInMinutes;
    private final int maxTimeRunningMarathonInMinutes;

    Runner(int minTimeRunningMarathonInMinutes, int maxTimeRunningMarathonInMinutes) {
        this.minTimeRunningMarathonInMinutes = minTimeRunningMarathonInMinutes;
        this.maxTimeRunningMarathonInMinutes = maxTimeRunningMarathonInMinutes;
    }

    public static void getFitnessLevel(int minTimeRunningMarathonInMinutes, int maxTimeRunningMarathonInMinutes) {
        int min = minTimeRunningMarathonInMinutes;
        int max = maxTimeRunningMarathonInMinutes;
        String runner = "";
        if (min >= 90 && max >= 120) {
            runner = Runner.BEGINNER.toString();
            System.out.println("Runner is: " + runner);
        } else if (min >= 60 && max <= 90) {
            runner = Runner.INTERMEDIATE.toString();
            System.out.println("Runner is: " + runner);
        } else if (min >= 45 && max <= 60) {
            runner = Runner.ADVANCED.toString();
            System.out.println("Runner is: " + runner);
        }

    }

    public static void main(String[] args) {
        getFitnessLevel(90, 120);
    }

}
