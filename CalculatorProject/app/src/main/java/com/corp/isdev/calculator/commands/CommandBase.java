package com.corp.isdev.calculator.commands;

import android.view.View;

import com.corp.isdev.calculator.CalculatorModel;

/**
 * Created by daniel on 5/30/15.
 */
public abstract class CommandBase implements View.OnClickListener {
    public CalculatorModel getCalculator() {
        return calculator;
    }

    private final CalculatorModel calculator;

    public CommandBase(CalculatorModel calculator) {
        this.calculator = calculator;
    }
}
