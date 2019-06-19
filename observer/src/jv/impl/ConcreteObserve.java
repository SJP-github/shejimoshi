package jv.impl;

import jv.inter.Observer;

/**
 * 具体的观察者
 */

public class ConcreteObserve implements Observer {

    private String observerState;

    @Override
    public void update(String state) {
        observerState=state;
        System.out.println("state更改为："+observerState);
    }
}
