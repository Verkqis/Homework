package io.codelex.classesandobjects.practice.Product;

public class Exercise1 {

    public static void main(String[] args) {

        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product iPhone = new Product("iPhone 5s", 999.99, 3);
        Product epson = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();
        iPhone.printProduct();
        epson.printProduct();

        mouse.changeQuantity(404);
        iPhone.changePrice(499.99);

        mouse.printProduct();
        iPhone.printProduct();

    }


}
