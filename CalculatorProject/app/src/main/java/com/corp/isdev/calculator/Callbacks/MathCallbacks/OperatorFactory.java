package com.corp.isdev.calculator.Callbacks.MathCallbacks;

/**
 * Created by USER on 18/05/2015.
 */
public class OperatorFactory {
    public static IOperator getOperatorClass(OperatorEnum selectedOperator) {

        switch (selectedOperator)
        {

            default:
                throw new IllegalArgumentException(String.format("Selected operator (%s) does not exist in the system",selectedOperator.toString()));
        }
    }
}
