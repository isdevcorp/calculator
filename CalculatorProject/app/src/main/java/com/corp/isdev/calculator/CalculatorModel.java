package com.corp.isdev.calculator;

import java.util.Observable;

/**
 * Created by USER on 30/05/2015.
 */
public class CalculatorModel extends Observable {
    private int _current;
    private int _previous;

    public int getCurrent() {
        return _current;
    }

    public void setCurrent(int current) {
        if(this._current != current) {
            this._current = current;
            setChanged();
            notifyObservers();
        }
    }

    public int getPrevious() {
        return _previous;
    }

    public void setPrevious(int previous) {
        this._previous = previous;
    }
}
