package com.fcs.chapter9;

import java.util.ArrayList;

/**
 * Created by Lucare.Feng on 2016/8/25.
 */
public class PancakeHouseMenu {

    ArrayList menuItems;

    public Iterator createIterator(){
        return new PancakeHouseIterator(menuItems);
    }
}
