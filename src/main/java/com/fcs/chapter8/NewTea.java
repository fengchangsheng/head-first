package com.fcs.chapter8;

/**
 * Created by Lucare.Feng on 2016/8/22.
 */
public class NewTea extends CaffeeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
