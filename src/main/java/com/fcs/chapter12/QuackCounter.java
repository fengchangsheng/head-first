package com.fcs.chapter12;

/**
 * Created by Lucare.Feng on 2016/8/27.
 * 装饰者
 */
public class QuackCounter implements Quackable {

    Quackable duck;
    static int numberOfQuacks;

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

}
