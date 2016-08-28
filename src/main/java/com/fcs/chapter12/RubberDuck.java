package com.fcs.chapter12;

import com.fcs.chapter12.observer.Observer;

/**
 * Created by Lucare.Feng on 2016/8/27.
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
