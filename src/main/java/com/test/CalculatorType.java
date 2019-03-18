package com.test;

import java.util.function.Function;

public enum CalculatorType {
    CALC_A(value -> value),
    CALC_B(value -> value * 10);

    private Function<Long, Long> expression;

    CalculatorType(Function<Long, Long> expression) {this.expression = expression;}

    public long caculate(long value) {return expression.apply(value);}
}
