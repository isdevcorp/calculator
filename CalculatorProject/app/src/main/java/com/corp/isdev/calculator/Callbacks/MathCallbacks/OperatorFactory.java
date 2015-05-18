package com.corp.isdev.calculator.Callbacks.MathCallbacks;

import com.corp.isdev.calculator.Callbacks.MathCallbacks.Impliments.MinusOperator;
import com.corp.isdev.calculator.Callbacks.MathCallbacks.Impliments.PlusOperator;

/**
 * Created by USER on 18/05/2015.
 */
public class OperatorFactory {
    public static IOperator getOperatorClass(OperatorEnum selectedOperator) throws IllegalArgumentException{

        switch (selectedOperator)
        {
            case Plus:
                return new PlusOperator();

            case Minus:
                return new MinusOperator();

            default:
                throw new IllegalArgumentException(String.format("Selected operator (%s) does not exist in the system",selectedOperator.toString()));
        }
    }
}
