package KnowlageTest;

import java.util.StringJoiner;

public class Joiner<T> {

    private String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    public String join(T... elements) {
        StringJoiner joiner = new StringJoiner(seperator);
        for (T element : elements) {
            joiner.add(element.toString());
        }
        return joiner.toString();
    }

    public static void main(String[] args) {
        Joiner<Integer> joiner = new Joiner<>("-");
        String result = joiner.join(1, 2, 3, 4);
        System.out.println(result);
    }
}
