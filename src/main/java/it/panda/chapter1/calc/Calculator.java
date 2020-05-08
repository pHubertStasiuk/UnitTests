package it.panda.chapter1.calc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public BigDecimal divide(int a, int b) {
        if (b == 0) throw new DivisionByZeroException("Cannot divide by zero!");
        BigDecimal bigDecimal = new BigDecimal(a);
        return bigDecimal.divide(new BigDecimal(b), RoundingMode.CEILING);
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
