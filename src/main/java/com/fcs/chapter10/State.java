package com.fcs.chapter10;

/**
 * Created by Lucare.Feng on 2016/8/26.
 * 状态模式--状态接口
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
