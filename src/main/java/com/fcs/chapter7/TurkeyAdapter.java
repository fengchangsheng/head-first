package com.fcs.chapter7;

/**
 * Created by Lucare.Feng on 2016/8/22.
 * 1.实现客户所希望看到的接口
 * 2.取得要适配的对象引用
 * 3.实现接口中的所有的方法
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
