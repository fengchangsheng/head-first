package com.fcs.chapter12.observer;

/**
 * Created by Lucare.Feng on 2016/8/28.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + "just quacked.");
    }
}
