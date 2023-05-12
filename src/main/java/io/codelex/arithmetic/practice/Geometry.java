package io.codelex.arithmetic.practice;



import java.math.BigDecimal;



class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        return BigDecimal.valueOf(Math.PI).multiply(radius.multiply(BigDecimal.valueOf((int)2)));
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        return base.multiply(h).multiply(BigDecimal.valueOf(0.5));
    }
}
