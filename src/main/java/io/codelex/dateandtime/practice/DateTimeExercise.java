package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate findNextFriday13th(LocalDate from) {
        from = LocalDate.now();
        LocalDate date = from.plusDays(1);

        while (true) {
            if (date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println("Next 13.friday is: " + date);
                return date;
            }
            date = date.plusDays(1);
        }
    }

    public static void main(String[] args) {

        System.out.println("In 2017 New Year's eve was in : " + createNewYearsEve2017().getDayOfWeek());

        LocalDate[] twoDates = getTwoLocalDates();
        System.out.println("Date 1: " + twoDates[0]);
        System.out.println("Date 2: " + twoDates[1]);


        findNextFriday13th(LocalDate.now());

    }
}
