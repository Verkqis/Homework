package io.codelex.oop.computers;

public class ComuputersApp {


    public static void main(String[] args) {


        Computer pc = new Computer("AMD Ryzen 9 7950X", "Gskill DDR5 7800 MHz 32 GB",
                "GeForce RTX 4090", "AMD/Gskill/Geforce", "Handmade");
        Computer pc2 = new Computer("Intel Core i5-13400", "DDR4 3300 Mhz 32 GB",
                "GeForce gtx 2080ti", "Intel/Random/Geforce", "Handmade");


        System.out.println(pc.toString());
        System.out.println(pc2.toString());


        Computer laptop = new Laptop("i5", "16gb",
                "GTX1050", "LENOVO", "LEGION", "4000Mah");
        Laptop laptop2 = new Laptop("i5", "16gb",
                "GTX1050", "LENOVO", "LEGION", "4000Mah");

        System.out.println(laptop.toString());
        System.out.println(laptop2.toString());

        System.out.println(laptop.getProcessor());

    }


}
