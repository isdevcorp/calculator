package com.corp.isdev.calculator.Callbacks.MathCallbacks.Operands;

/**
 * Created by USER on 21/05/2015.
 */
public class OperandFactory {
    public static int getOperandValue(OperandEnum operand) {

        switch (operand) {
            case n0:
                return 0;
            case n1:
                return 1;
            case n2:
                return 2;
            case n3:
                return 3;
            case n4:
                return 4;
            case n5:
                return 5;
            case n6:
                return 6;
            case n7:
                return 7;
            case n8:
                return 8;
            case n9:
                return 9;

            default:
                throw new IllegalArgumentException(String.format("Selected operand (%s) does not exist in the system",operand.toString()));
        }
    }
}
