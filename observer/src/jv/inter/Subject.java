package jv.inter;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers=new ArrayList<>();

    /**
     * 注册观察者
     * @param observer
     */
    public void registryObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有观察者
     * 注：如有必要，可以异步调用观察者update方法
     * @param newState
     */
    public void nodifyObserver(String newState) {
        for (Observer observer : observers) {
            observer.update(newState);
        }
    }

}
