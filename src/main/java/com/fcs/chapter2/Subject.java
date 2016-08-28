package com.fcs.chapter2;

/**
 * Created by Lucare.Feng on 2016/8/28.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
