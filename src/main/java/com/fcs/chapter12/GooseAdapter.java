package com.fcs.chapter12;

import com.fcs.chapter12.observer.Observer;

/**
 * Created by Lucare.Feng on 2016/8/27.
 * 鹅适配器--适配成鸭子
 */
public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
