package com.corp.isdev.calculator;

import android.view.View;

import com.corp.isdev.calculator.Callbacks.MathCallbacks.Operands.OperandEnum;
import com.corp.isdev.calculator.Callbacks.MathCallbacks.Operands.OperandFactory;

/**
 * Created by USER on 21/05/2015.
 */
public class MainActivityViewModel {

    // Properties
    private int currentNumber = 0;
    private int calculatedNumber = 0;

    public View.OnClickListener onOperandClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO: Should be tested!
            int numberClicked = OperandFactory.getOperandValue((OperandEnum)v.getTag());
            currentNumber = (currentNumber * 10) + numberClicked;
        }
    };
    // Functions
}
