package com.corp.isdev.calculator;

import android.view.View;

import com.corp.isdev.calculator.Callbacks.MathCallbacks.Operands.OperandEnum;
import com.corp.isdev.calculator.Callbacks.MathCallbacks.Operands.OperandFactory;

/**
 * Created by USER on 21/05/2015.
 */
public class MainActivityViewModel {

    // Properties
    private BaseActivity _activity;

    private int _currentNumber = 0;
    private int _calculatedNumber = 0;

    public View.OnClickListener onOperandClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            updateCurrentNumber((_currentNumber * 10) + OperandFactory.getOperandValue((OperandEnum)v.getTag()));
        }
    };

    // Ctor
    public MainActivityViewModel(BaseActivity activity) {
        _activity = activity;
    }

    // Functions
    private void updateCurrentNumber(int newNumber)
    {
        _currentNumber = newNumber;
        _activity.UpdateProperty("txtDisplay",String.valueOf(newNumber));
    }
}
