package com.fcs.chapter12;

import com.fcs.chapter12.observer.Observable;
import com.fcs.chapter12.observer.Observer;

/**
 * Created by Lucare.Feng on 2016/8/27.
 * 装饰者
 */
public class QuackCounter implements Quackable {

    Quackable duck;
    static int numberOfQuacks;
    Observable observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks ++;
    }

    public static int getQuacks(){
        return numberOfQuacks;
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
