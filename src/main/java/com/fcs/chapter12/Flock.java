package com.fcs.chapter12;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Lucare.Feng on 2016/8/27.
 */
public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
}
