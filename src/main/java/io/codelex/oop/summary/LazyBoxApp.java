package io.codelex.oop.summary;

public class LazyBoxApp {

    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(LazyBoxApp::calculate);

        Integer contents = box.get();
        System.out.println("Contents: " + contents);

        Integer contents2 = box.get();
        System.out.println("Contents2: " + contents2);
    }

    public static Integer calculate() {
        return 200;
    }
}
