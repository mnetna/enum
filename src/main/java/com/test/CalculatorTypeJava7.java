package com.test;

public enum CalculatorTypeJava7 {
    CALC_A {
        long calculate(long value) {return value;}
    },
    CALC_B {
        long calculate(long value) {return value * 10;}
    };

    abstract long calculate(long value);
}