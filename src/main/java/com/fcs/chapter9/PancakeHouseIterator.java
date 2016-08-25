package com.fcs.chapter9;

import java.util.ArrayList;

/**
 * Created by Lucare.Feng on 2016/8/25.
 */
public class PancakeHouseIterator implements Iterator {

    ArrayList menuItems;

    public PancakeHouseIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {

        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
