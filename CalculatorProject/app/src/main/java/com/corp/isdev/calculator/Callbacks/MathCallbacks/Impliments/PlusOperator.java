package com.corp.isdev.calculator.Callbacks.MathCallbacks.Impliments;

import com.corp.isdev.calculator.Callbacks.MathCallbacks.IOperator;

/**
 * Created by USER on 18/05/2015.
 */
public class PlusOperator implements IOperator {
    @Override
    public int calc(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
