package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    private String appointment;
    private LocalDate startedToWork;

    public Employee(String firstName, String lastName, String id, int age,
                    String appointment, LocalDate startedToWork) {
        super(firstName, lastName, id, age);
        this.appointment = appointment;
        this.startedToWork = startedToWork;
    }

    public int getWorkExperience() {
        LocalDate dateToday = LocalDate.now();
        Period per = Period.between(startedToWork, dateToday);
        int employeeWorked;
        employeeWorked = per.getYears();
        return employeeWorked;
    }

    @Override
    public String getInfo() {
        int yearsWorked = getWorkExperience();
        return firstName + " " + lastName + " " + appointment + " (" + yearsWorked + " years) ";
    }
}
