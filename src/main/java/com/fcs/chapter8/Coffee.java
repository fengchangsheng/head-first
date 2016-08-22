package com.fcs.chapter8;

/**
 * Created by Lucare.Feng on 2016/8/22.
 */
public class Coffee {

    void prepareRecipe(){
        boilWater();
        breCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    /**
     * 煮沸水
     */
    public void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 冲泡咖啡
     */
    public void breCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    /**
     * 把咖啡倒进杯子
     */
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 加糖和奶
     */
    public void addSugarAndMilk() {
        System.out.println("Adding Suger and Milk");
    }

}
