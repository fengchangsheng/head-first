package com.fcs.chapter12.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Lucare.Feng on 2016/8/28.
 * Observable辅助类
 */
public class Observable implements QuackObservable {

    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
