package jv.impl;

import jv.inter.Subject;

public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newstate) {
        state=newstate;
        this.nodifyObserver(state);
    }
}
