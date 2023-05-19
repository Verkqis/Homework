package io.codelex.classesandobjects.practice.dog;

public class Dog {

    private String dogName;
    private String dogSex;
    private String dogMother;
    private String dogFather;


    public Dog(String dogName, String dogSex) {
        this.dogName = dogName;
        this.dogSex = dogSex;
        this.dogMother = null;
        this.dogFather = null;
    }

    public Dog(String dogName, String dogSex, String dogMother, String dogFather) {
        this.dogName = dogName;
        this.dogSex = dogSex;
        this.dogMother = dogMother;
        this.dogFather = dogFather;
    }

    public void fathersName() {
        if (dogFather == null) {
            System.out.println("Unknown");
        } else {
            System.out.println(dogFather);
        }
    }

    public void hasSameMotherAs(Dog Dog) {
        if (dogMother.equals(dogMother)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }


}
