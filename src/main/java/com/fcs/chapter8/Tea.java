package com.fcs.chapter8;

/**
 * Created by Lucare.Feng on 2016/8/22.
 */
public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    private void steepTeBag() {
        System.out.println("Steeping the tea");
    }

    private void addLemon() {
        System.out.println("Adding Lemon");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
