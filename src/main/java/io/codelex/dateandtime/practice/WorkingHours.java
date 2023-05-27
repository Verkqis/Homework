package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkingHours {


    public static int workingHoursCalculator(LocalDate start, LocalDate end) {
        int hoursWorked = 0;
        LocalDate startFromDate = start;


        while (!startFromDate.isAfter(end)) {
            if (startFromDate.getDayOfWeek() != DayOfWeek.SUNDAY
                    && startFromDate.getDayOfWeek() != DayOfWeek.SATURDAY) {
                hoursWorked += 8;
            }
            startFromDate = startFromDate.plusDays(1);
        }
        System.out.println(hoursWorked);
        return hoursWorked;
    }

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2021, 12, 12);
        LocalDate end = LocalDate.of(2022, 10, 10);

        workingHoursCalculator(start, end);

    }


}
