package com.fcs.chapter8;

/**
 * Created by Lucare.Feng on 2016/8/22.
 */
public class NewCoffe extends CaffeeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Suger and Milk");
    }
}
