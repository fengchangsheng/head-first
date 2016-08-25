package com.fcs.chapter9;

/**
 * Created by Lucare.Feng on 2016/8/25.
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }


}
