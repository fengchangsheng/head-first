package com.fcs.chapter10;

/**
 * Created by Lucare.Feng on 2016/8/26.
 */
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
    }

    public void dispense(){
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot....");
        if (count != 0) {
            count --;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    //    final static int SOLD_OUT = 0;
//    final static int NO_QUARTER = 1;
//    final static int HAS_QUARTER = 2;
//    final static int SOLD = 3;
//
//    int state = SOLD_OUT;
//    int count = 0;
//
//    public GumballMachine(int count) {
//        this.count = count;
//        if (count > 0) {
//            state = NO_QUARTER;
//        }
//    }
//
//    /**
//     * 投币
//     */
//    public void insertQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("You can't insert another quarter");
//        } else if (state == NO_QUARTER) {
//            state = HAS_QUARTER;
//            System.out.println("You inserted a quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You can't insert a quarter,the machine is sold out");
//        } else if (state == SOLD) {
//            System.out.println("Please wait, we are already giving you a gumball");
//        }
//    }
//
//    /**
//     * 退币
//     */
//    public void ejectQuarter(){
//        if (state == HAS_QUARTER) {
//            System.out.println("Quarter returned");
//        } else if (state == NO_QUARTER) {
//            System.out.println("You haven't insert a quarter");
//        } else if (state == SOLD) {
//            System.out.println("Sorry, you already turned a crank");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You can't eject, you haven't insert a quarter yet");
//        }
//    }
//
//    /**
//     * 转动曲柄
//     */
//    public void turnCrank() {
//        if (state == SOLD) {
//            System.out.println("Turning twice doesn't get you another gumball");
//        } else if (state == NO_QUARTER) {
//            System.out.println("You turned but there's no quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You turned but there are no gumballs");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("You turned...");
//            state = SOLD;
//            dispense();
//        }
//    }
//
//    /**
//     * 发放糖果
//     */
//    public void dispense() {
//        if (state == SOLD) {
//            System.out.println("A gumball comes rolling out the slot");
//            count = count - 1;
//            if (count == 0) {
//                System.out.println("Oops, out of gumballs!");
//                state = SOLD_OUT;
//            } else {
//                state = NO_QUARTER;
//            }
//        } else if (state == NO_QUARTER){
//            System.out.println("You need pay first");
//        } else if (state == SOLD_OUT) {
//            System.out.println("No gumball dispensed");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("No gumball dispensed");
//        }
//    }


}
