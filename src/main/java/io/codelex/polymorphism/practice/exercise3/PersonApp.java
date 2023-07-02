package io.codelex.polymorphism.practice.exercise3;

public class PersonApp {
    public static void main(String[] args) {

        Person john = new Person("John", "Doe",
                "New York Myrtle Street 231", 22334455);

        john.display();


        Person jim = new Student("James", "Jameson",
                "New York Sage Lane 679 SW", 23422323, 8.88);

        jim.display();

        Person jackie = new Employee("Jackie", "Chan",
                "Shanghai 7hao Lou 4dan Yuan 503", 232535634, "Actor");

        jackie.display();
    }


}
