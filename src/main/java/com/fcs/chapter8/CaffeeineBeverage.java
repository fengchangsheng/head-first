package com.fcs.chapter8;

/**
 * Created by Lucare.Feng on 2016/8/22.
 * 模板方法
 */
public abstract class CaffeeineBeverage {

    final void preprareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

}
