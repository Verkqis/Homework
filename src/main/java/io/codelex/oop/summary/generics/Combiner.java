package io.codelex.oop.summary.generics;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Combiner {

    public static String combineTwoItems(Object first, Object second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }


    public static void main(String[] args) {

        BigInteger bi = BigInteger.valueOf(1000);
        BigDecimal bd = BigDecimal.TEN;

        System.out.println(Combiner.combineTwoItems(bi, bd));

    }

}
