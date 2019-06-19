package jv;

import jv.impl.ConcreteObserve;
import jv.impl.ConcreteSubject;

public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserve observe = new ConcreteObserve();
        subject.registryObserver(observe);
        subject.change("new state");
    }
}
