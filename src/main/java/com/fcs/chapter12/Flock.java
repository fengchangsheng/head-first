package com.fcs.chapter12;

import com.fcs.chapter12.observer.Observable;
import com.fcs.chapter12.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Lucare.Feng on 2016/8/27.
 */
public class Flock implements Quackable {

    Observable observable;

    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
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
