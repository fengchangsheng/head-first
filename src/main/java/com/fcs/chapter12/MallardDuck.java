package com.fcs.chapter12;

import com.fcs.chapter12.observer.Observable;
import com.fcs.chapter12.observer.Observer;

/**
 * Created by Lucare.Feng on 2016/8/27.
 */
public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
