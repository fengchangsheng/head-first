package com.fcs.chapter12;

/**
 * Created by Lucare.Feng on 2016/8/27.
 * 抽象工厂
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();

}
