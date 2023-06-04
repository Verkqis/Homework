package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, PhoneEntry> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        PhoneEntry entry = data.get(name);
        if (entry == null) {
            return null;
        } else {
            return entry.number;
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }

        PhoneEntry entry = new PhoneEntry();
        entry.name = name;
        entry.number = number;
        data.put(name, entry);
    }


    public static void main(String[] args) {

        PhoneDirectory directory = new PhoneDirectory();

        // Adding entries
        directory.putNumber("John Doe", "1234567890");
        directory.putNumber("Jane Doe", "9876543210");
        directory.putNumber("Alice in Wonderland", "5555555555");

        // Getting numbers
        String johnNumber = directory.getNumber("John Doe");
        System.out.println("John Doe number: " + johnNumber);

        String janeNumber = directory.getNumber("Jane Doe");
        System.out.println("Jane Doe number: " + janeNumber);

        String aliceNumber = directory.getNumber("Alice in Wonderland");
        System.out.println("Alice in Wonderland number: " + aliceNumber);

        String nonExistingNumber = directory.getNumber("Bob Smith");
        System.out.println("Bob Smith's number: " + nonExistingNumber);
    }
}