package com.fcs.chapter12;

/**
 * Created by Lucare.Feng on 2016/8/27.
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}