package com.corp.isdev.calculator.Callbacks.MathCallbacks.Operators.Impliments;

import com.corp.isdev.calculator.Callbacks.MathCallbacks.Operators.IOperator;

/**
 * Created by USER on 18/05/2015.
 */
public class PlusOperator implements IOperator {
    @Override
    public int calc(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
