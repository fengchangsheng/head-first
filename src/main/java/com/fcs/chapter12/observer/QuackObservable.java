package com.fcs.chapter12.observer;


/**
 * Created by Lucare.Feng on 2016/8/28.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
