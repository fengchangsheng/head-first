package com.fcs.chapter7;

/**
 * Created by Lucare.Feng on 2016/8/22.
 * 绿头鸭
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
