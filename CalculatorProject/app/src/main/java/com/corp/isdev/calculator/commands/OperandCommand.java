package com.corp.isdev.calculator.commands;

import android.view.View;

import com.corp.isdev.calculator.CalculatorModel;

/**
 * Created by daniel on 5/30/15.
 */
public abstract class OperandCommand extends CommandBase {

    private final int context;

    public OperandCommand(CalculatorModel calculator, int context) {
        super(calculator);
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        CalculatorModel calculator = getCalculator();
        calculator.setCurrent(appendDigit(calculator.getCurrent()));
    }

    private int appendDigit(int value) {
        return (value * 10) + context;
    }
}
