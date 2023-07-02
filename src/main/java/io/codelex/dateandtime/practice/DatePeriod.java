package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {

    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }


    public DatePeriod intersection(DatePeriod par) {
        if (this.end.isBefore(par.start) || this.start.isAfter(par.end)) {
            return null;
        } else {
            LocalDate intersectStart = this.start.isAfter(par.start) ? this.start : par.start;
            LocalDate intersectEnd = this.end.isBefore(par.end) ? this.end : par.end;
            return new DatePeriod(intersectStart, intersectEnd);
        }

    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);

        if (overlap != null) {
            System.out.println("Intersection: " + overlap.getStart() + " to " + overlap.getEnd());
        } else {
            System.out.println("No intersection");
        }
    }
}
