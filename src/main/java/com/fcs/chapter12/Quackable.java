package com.fcs.chapter12;

import com.fcs.chapter12.observer.QuackObservable;

/**
 * Created by Lucare.Feng on 2016/8/27.
 */
public interface Quackable extends QuackObservable {

    public void quack();

}
