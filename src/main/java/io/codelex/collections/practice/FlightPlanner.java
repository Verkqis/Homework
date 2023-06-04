//package io.codelex.collections.practice;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class FlightPlanner {
//    private static final String PATH_TO_APP = "C:\\Users\\verne\\HomeworkRepository\\Homework\\target\\classes\\collections\\";
//
//    public static void main(String[] args) throws FileNotFoundException {
//
//        String fileToString = PATH_TO_APP + "flights.txt";
//
//        Scanner in = new Scanner(System.in);
//        TreeMap<String, List<String>> storeFlights = new TreeMap<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileToString))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] splitting = line.split("->");
//                if (splitting.length == 2) {
//                    String key = splitting[0].trim();
//                    String value = splitting[1].trim();
//                    List<String> destinations = storeFlights.getOrDefault(key, new ArrayList<>());
//                    destinations.add(value);
//                    storeFlights.put(key, destinations);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("What would you like to do: ");
//        System.out.println("To display list of the cities press 1 ");
//        System.out.println("To exit program press # ");
//        String input = in.next();
//        if (input.equals("#") || input.isEmpty()) {
//            in.close();
//        } else if (input.equals("1")) {
//            System.out.println("To select a city from list, " +
//                    "you would like to type city name from list ");
//            for (String source : storeFlights.keySet()) {
//                List<String> destinations = storeFlights.get(source);
//                for (String destination : destinations) {
//                    System.out.println(source + " -> " + destination);
//                }
//            }
//            String city = in.next();
//            String cityToLowerCase = city.toLowerCase();
//            if (cityToLowerCase.equals("anchorage")) {
//                System.out.println(storeFlights.get("Anchorage"));
//                String choice
//
//            }
//        }
//
//
//    }
//}
