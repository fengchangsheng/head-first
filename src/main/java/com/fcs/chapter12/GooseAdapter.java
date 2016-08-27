package com.fcs.chapter12;

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
}
